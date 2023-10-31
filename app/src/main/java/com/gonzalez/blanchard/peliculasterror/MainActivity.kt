package com.gonzalez.blanchard.peliculasterror

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.gonzalez.blanchard.peliculasterror.adapters.MoviesAdapter
import com.gonzalez.blanchard.peliculasterror.data.MovieRepository
import com.gonzalez.blanchard.peliculasterror.databinding.ActivityMainBinding
import com.gonzalez.blanchard.peliculasterror.model.Movie

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var moviesAdapter: MoviesAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val movies = MovieRepository.getMovies()

        binding.movieListRv.layoutManager = LinearLayoutManager(this)
        moviesAdapter = MoviesAdapter(movies, ::onMovieClicked)
        binding.movieListRv.adapter = moviesAdapter
    }

    fun onMovieClicked(movie: Movie) {
        // TODO Evento click
        val intent = Intent(this, DetailScreen::class.java).apply {
            putExtra("MOVIE_ID", movie.id)
        }
        startActivity(intent)
    }
}
