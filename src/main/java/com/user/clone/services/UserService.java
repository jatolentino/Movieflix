package com.user.netflixclone.services;

import com.user.netflixclone.entities.User;
import com.user.netflixclone.exceptions.UserDetailsNotFoundException;

public interface UserService {
    User createUser(User user);
    User findUser(String id) throws UserDetailsNotFoundException;
   // List<String> moviesOfUser(String userId);
}
