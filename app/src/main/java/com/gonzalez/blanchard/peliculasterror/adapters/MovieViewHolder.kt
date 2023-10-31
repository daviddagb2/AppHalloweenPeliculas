package com.gonzalez.blanchard.peliculasterror.adapters

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.gonzalez.blanchard.peliculasterror.databinding.ItemMovieBinding
import com.gonzalez.blanchard.peliculasterror.model.Movie
import com.squareup.picasso.Picasso

class MovieViewHolder(view: View, private val onClickListener: (Movie) -> Unit) : RecyclerView.ViewHolder(view) {

    val binding = ItemMovieBinding.bind(view)

    fun bind(movie: Movie) {
        with(itemView) {
            binding.tvTitle.text = movie.title
            // Cargar imagen del poster con Picasso
            Picasso.get().load(movie.poster_path).into(binding.imgPoster)
        }

        binding.root.setOnClickListener {
            onClickListener(movie)
        }
    }
}
