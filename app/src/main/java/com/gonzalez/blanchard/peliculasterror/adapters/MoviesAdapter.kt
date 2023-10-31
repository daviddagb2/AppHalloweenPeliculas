package com.gonzalez.blanchard.peliculasterror.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.gonzalez.blanchard.peliculasterror.R
import com.gonzalez.blanchard.peliculasterror.model.Movie

class MoviesAdapter(
    private val movies: List<Movie>,
    private val itemClickListener: (Movie) -> Unit,
) :
    RecyclerView.Adapter<MovieViewHolder>() {

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        val movie = movies[position]
        holder.bind(movie)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(R.layout.item_movie, parent, false)
        return MovieViewHolder(view, itemClickListener)
    }

    override fun getItemCount(): Int {
        return movies.size
    }
}
