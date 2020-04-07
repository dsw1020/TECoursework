package com.techelevator.controller;

import com.techelevator.authentication.AuthProvider;
import com.techelevator.authentication.UnauthorizedException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * SiteController
 */
@Controller
public class SiteController {
    @Autowired
    private AuthProvider auth;

    @RequestMapping(path = "/private", method = RequestMethod.GET)
    public String privatePage() throws UnauthorizedException {
        if (auth.userHasRole(new String[] { "admin", "user" })) {  // Does the user have the admin or user role
            return "private";   // return the private.jsp - display the private jasp
        } else {
            throw new UnauthorizedException();  // Throw this excepetion is user does not have the "admin" or "user" role
        }
    }

    @RequestMapping(path = "/about", method = RequestMethod.GET)
    public String aboutPage() throws UnauthorizedException {
        return "about";
    }
}