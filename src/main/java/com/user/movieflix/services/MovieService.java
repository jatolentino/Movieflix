package com.user.movieflix.services;

import com.user.movieflix.entities.Movie;
import com.user.movieflix.exceptions.MovieDetailsNotFoundException;

import java.util.List;

public interface MovieService {
    List<Movie> fetchMovie(String user_id) throws MovieDetailsNotFoundException;
    Movie addMovie(Movie movie);

    boolean deleteMovie(String id);
}
