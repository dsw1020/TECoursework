package com.techelevator.validation.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.techelevator.validation.model.Login;
import com.techelevator.validation.model.Registration;

@Controller
public class UserController {
	// GET: /
	@RequestMapping(path = "/", method = RequestMethod.GET)
	public String getMainScreen() {
		return "homePage";
	}

	// Add the following Controller Actions

	// GET: /register
	// Return the empty registration view
	@RequestMapping(path = "/register", method = RequestMethod.GET)
	public String showRegisterForm(Model modelHolder) {
		if (!modelHolder.containsAttribute("registration")) {
			modelHolder.addAttribute("registration", new Registration());
		}
		return "register";
	}

	// POST: /register
	// Validate the model and redirect to confirmation (if successful) or return
	// the
	// registration view (if validation fails)
	@RequestMapping(path = "/register", method = RequestMethod.POST)
	public String submitRegisterForm(@Valid @ModelAttribute("registration") Registration registerFormValues,
			BindingResult result, RedirectAttributes flash) {
		if (result.hasErrors()) {
			flash.addFlashAttribute(BindingResult.MODEL_KEY_PREFIX + "registration", result);
			flash.addFlashAttribute("registration", registerFormValues);
			return "redirect:/register";
		}

		flash.addFlashAttribute("message", "You have successfully registered.");

		return "redirect:/confirmation";
	}

	// GET: /login
	// Return the empty login view
	@RequestMapping(path = "/login", method = RequestMethod.GET)
	public String showLoginForm(Model modelHolder) {
		if (!modelHolder.containsAttribute("login")) {
			modelHolder.addAttribute("login", new Login());
		}
		return "login";
	}

	// POST: /login
	// Validate the model and redirect to a confirmation page if validation is
	// successful. Return the login view (if validation fails).
	@RequestMapping(path = "/login", method = RequestMethod.POST)
	public String submitLoginForm(@Valid 							// Tell server to perform validation
								  @ModelAttribute("login") 			// Hold the data from the form in ModelMap
								  Login loginFormValues , 			// POJO with the validation criteria
								  BindingResult result ,			// Hold the result of the Validation
								  RedirectAttributes flash) {		// FlashMap to hold result and data returned if errors
		
		if (result.hasErrors()) {														// If there were validation errors
			flash.addFlashAttribute(BindingResult.MODEL_KEY_PREFIX + "login", result);	// put the data from form in FlashMap
			flash.addFlashAttribute("login", loginFormValues);							// Put the POJO in the FlashMap
			return "redirect:/login";													// Go back to /login path with a GET
		}																				// 		and redisplay the View (jsp)
		
		// if no errors - put a message in the FlashMap for the next View to display
		flash.addFlashAttribute("message", "You have successfully logged in.");

		return "redirect:/confirmation"; // issue an HTTP Get with the path /confirmation
	}

	// GET: /confirmation
	// Return the confirmation view
	@RequestMapping(path = "/confirmation", method = RequestMethod.GET)
	public String showConfirmationView() {
		return "confirmation";
	}
}
