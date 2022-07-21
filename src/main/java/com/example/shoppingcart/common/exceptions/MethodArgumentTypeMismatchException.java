package com.example.shoppingcart.common.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


public class MethodArgumentTypeMismatchException extends RuntimeException{
    public MethodArgumentTypeMismatchException(String message){
        super(message);
    }
}

