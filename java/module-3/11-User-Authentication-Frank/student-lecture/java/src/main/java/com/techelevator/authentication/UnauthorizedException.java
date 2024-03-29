package com.techelevator.authentication;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * UnauthorizedException
 */
@ResponseStatus(code = HttpStatus.FORBIDDEN)   // Set the HTTP status code to return for this exeption 
public class UnauthorizedException extends Exception {

    private static final long serialVersionUID = 1L;

}