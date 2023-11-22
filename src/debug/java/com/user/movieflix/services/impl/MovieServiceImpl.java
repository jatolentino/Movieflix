package com.user.movieflix.services.impl;

import com.user.movieflix.daos.MovieDao;
import com.user.movieflix.entities.Movie;
import com.user.movieflix.exceptions.MovieDetailsNotFoundException;
import com.user.movieflix.exceptions.UserDetailsNotFoundException;
import com.user.movieflix.services.MovieService;
import lombok.AllArgsConstructor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@AllArgsConstructor
public class MovieServiceImpl implements MovieService {

    static final Logger LOGGER = LoggerFactory.getLogger(MovieServiceImpl.class);

    MovieDao movieDao;

    @Autowired
    private UserServiceImpl userServiceImpl;

    @Override
    public List<Movie> fetchMovie(String user_id) throws MovieDetailsNotFoundException {
        LOGGER.debug("Finding movies of userList : " + user_id);
        LOGGER.info(" fetchmovie method is triggered"+ user_id);
        List<Movie> list =  movieDao.findAllByUserId(user_id).orElseThrow(()->new MovieDetailsNotFoundException("Movie with id does not exists"));
        System.out.printf("Returning the saved movies of users %s%n",list.size());
        return list;
    }

    @Override
    public Movie addMovie(Movie movie) {
        LOGGER.debug("add movie with details"+ movie);
        LOGGER.info("add method movie has been triggered");
        Movie movie1 = movieDao.save(movie);
        return movie1;
    }

    @Override
    public boolean deleteMovie(String id) {
        movieDao.deleteById(id);
        return true;
    }

    public Boolean checkUser(String user_id) throws UserDetailsNotFoundException {
        return userServiceImpl.checkUserByUserId(user_id);
    }
}
