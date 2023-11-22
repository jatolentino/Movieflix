package com.user.movieflix.exceptions;

import java.util.function.Supplier;

public class UserDetailsNotFoundException extends Exception{
    public UserDetailsNotFoundException(String s){
        super(s);
    }
}
