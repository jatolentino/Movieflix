package com.user.movieflix.daos;

import com.user.movieflix.entities.Movie;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface MovieDao extends MongoRepository<Movie,String> {
    Optional<List<Movie>> findAllByUserId(String id);
}
