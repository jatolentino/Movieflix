package com.user.netflixclone.services;

import com.user.netflixclone.entities.Movie;
import com.user.netflixclone.exceptions.MovieDetailsNotFoundException;

import java.util.List;

public interface MovieService {
    List<Movie> fetchMovie(String user_id) throws MovieDetailsNotFoundException;
    Movie addMovie(Movie movie);

    boolean deleteMovie(String id);
}
