package com.user.movieflix.services;

import com.user.movieflix.entities.User;
import com.user.movieflix.exceptions.UserDetailsNotFoundException;

public interface UserService {
    User createUser(User user);
    User findUser(String id) throws UserDetailsNotFoundException;
   // List<String> moviesOfUser(String userId);
}
