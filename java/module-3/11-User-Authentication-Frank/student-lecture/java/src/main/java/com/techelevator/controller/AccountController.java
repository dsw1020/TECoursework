package com.techelevator.controller;

import javax.validation.Valid;

import com.techelevator.authentication.AuthProvider;
import com.techelevator.authentication.UnauthorizedException;
import com.techelevator.model.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 * AccountController
 */
@Controller
public class AccountController {
    @Autowired
    private AuthProvider auth;

    @RequestMapping(method = RequestMethod.GET, path = { "/", "/index" })
    public String index(ModelMap modelHolder) {								// Give me a ModelMap to share with other things in the request
        modelHolder.put("user", auth.getCurrentUser());						// Get current user and place it in the modelMap with the key "user"

        return "index";
    }

    @RequestMapping(path = "/login", method = RequestMethod.GET)
    public String login(ModelMap modelHolder) {
        return "login";
    }

    @RequestMapping(path = "/login", method = RequestMethod.POST)
    public String login(@RequestParam String username, @RequestParam String password, RedirectAttributes flash) {
        if (auth.signIn(username, password)) {
            return "redirect:/";
        } else {
            flash.addFlashAttribute("message", "Login Invalid");
            return "redirect:/login";
        }
    }

    @RequestMapping(path = "/logoff", method = RequestMethod.POST)
    public String logOff() {
        auth.logOff();
        return "redirect:/";
    }

    @RequestMapping(path = "/register", method = RequestMethod.GET)
    public String register(ModelMap modelHolder) {
        if (!modelHolder.containsAttribute("user")) {
            modelHolder.put("user", new User());
        }
        return "register";
    }

    @RequestMapping(path = "/register", method = RequestMethod.POST)
    public String register(@Valid @ModelAttribute("user") User user 	// Server should validate using the "user" in ModelMap and User POJO 
    						, BindingResult result						// Results of validation is placed in the BindingResult object
    						, RedirectAttributes flash) {				// Give me flashMap so I can send the validation result and data back if errors
        if (result.hasErrors()) {										// If there are any errors...
            flash.addFlashAttribute("user", user);						// 					send the data entered from the user back to the view
            flash.addFlashAttribute(BindingResult.MODEL_KEY_PREFIX + "user", result); // 	send the validation result back to the view
            flash.addFlashAttribute("message", "Please fix the following errors:");	  //    send a general message to be displayed concerning the errors
            return "redirect:/register";								// go back to redisplay the register screen/ register for GET in controller
        }
        auth.register(user.getUsername(), user.getPassword(), user.getRole()); // if no registration errors - run the register method
        return "redirect:/";		// go back to homepage
    }

}