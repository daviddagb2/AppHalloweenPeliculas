package com.gonzalez.blanchard.peliculasterror.data

import com.gonzalez.blanchard.peliculasterror.model.Movie

object MovieRepository {

    private val movies = mutableListOf<Movie>(
        Movie(1, "El exorcista", "https://m.media-amazon.com/images/I/61s6okUC3GL._AC_UF894,1000_QL80_.jpg", "Una niña es poseída por un demonio"),
        Movie(2, "El resplandor", "https://play-lh.googleusercontent.com/8aBHlb1nsME7ONs6c9dQnxKxebktJoEzOzwfuUwvxJ3F9GVq1H8g_5RCP1U3Ktxqi17c", "Un escritor se vuelve loco"),
        Movie(3, "El conjuro", "https://www.themoviedb.org/t/p/original/gZs6rkuJIZh9OwThlabw08EPJVs.jpg", "Una familia es atormentada por un demonio"),
        Movie(4, "El conjuro 2", "https://i.pinimg.com/474x/46/8c/2f/468c2f9dc91d7e1a5cfdcbb7b7a39d58.jpg", "Una familia es atormentada por un demonio"),
        Movie(5, "La Monja", "https://hips.hearstapps.com/es.h-cdn.co/fotoes/images/media/imagenes/recursos/la-monja-poster-pelicula/138144618-1-esl-ES/la-monja-poster-pelicula.jpg", "Una monja anda asustando personas"),
        Movie(9, "El conjuro 7", "https://i.imgur.com/DvpvklR.png", "Una familia es atormentada por un demonio"),
        Movie(10, "El conjuro 8", "https://i.imgur.com/DvpvklR.png", "Una familia es atormentada por un demonio"),
    )

    fun getMovies(): List<Movie> {
        return movies
    }

    fun getMovieById(id: Int): Movie? {
        return movies.find { it.id == id }
    }

    fun addMovie(movie: Movie) {
        movies.add(movie)
    }
}
