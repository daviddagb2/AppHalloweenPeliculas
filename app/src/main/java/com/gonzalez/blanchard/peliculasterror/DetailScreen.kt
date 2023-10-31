package com.gonzalez.blanchard.peliculasterror

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.gonzalez.blanchard.peliculasterror.data.MovieRepository
import com.gonzalez.blanchard.peliculasterror.databinding.ActivityDetailScreenBinding
import com.squareup.picasso.Picasso

class DetailScreen : AppCompatActivity() {

    private lateinit var binding: ActivityDetailScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Obtener el ID de la película desde el intent
        val movieId = intent.getIntExtra("MOVIE_ID", -1)
        if (movieId != -1) {
            val movie = MovieRepository.getMovieById(movieId)

            // Si la película existe en el repositorio, mostrar sus datos en los widgets correspondientes
            movie?.let {
                binding.tvtitle.text = it.title
                Picasso.get().load(movie.poster_path).into(binding.imgPosterMovie)
                binding.tvDescription.text = it.description
            }
        } else {
            finish() // Cierra la actividad
        }
    }
}
