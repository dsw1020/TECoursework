package com.techelevator.validation.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.techelevator.validation.model.SignUp;

@Controller
public class UserController {
	
	// GET: /
	// Display homePage view with greeting and invitation to sign up for mailing list 
	
	@RequestMapping(path="/", method=RequestMethod.GET)
	public String getMainScreen() {
		return "homePage";
	}
	
	// GET: /mailingList
	// Display empty mailingList view 
	
	@RequestMapping(path="/mailingList", method=RequestMethod.GET)
	public String showRegisterForm(Model modelHolder) {
		if( ! modelHolder.containsAttribute("SignUp")) {        // if the ModelMap does not have an attribute key "SignUp"
			modelHolder.addAttribute("SignUp", new SignUp());   // Add one with a new instance of the SignUp class
		}
		return "mailingList";
	}
	
	// POST: /mailingList
	// Validate the model and redirect to confirmation (if successful) 
	// or return the mailingList view (if validation fails)

	@RequestMapping(path="/mailingList", method=RequestMethod.POST)
	public String submitRegisterForm(
			@Valid @ModelAttribute("SignUp") SignUp registerFormValues, // @Valid validate the data in modelAttribute "SignUp"
//                                          an Object created at submit with the data from the form			                                   
			BindingResult result,       // Will contain the result of the server validation
			RedirectAttributes flash    // Define a FlashMap to be used in the controller
	){
		if(result.hasErrors()) {  //       key-for-entry                     , value   // if there are errors found during validation
			flash.addFlashAttribute(BindingResult.MODEL_KEY_PREFIX + "SignUp", result);// Add the BindingResult object to the FlashMap
			flash.addFlashAttribute("SignUp", registerFormValues);                     // Add the object with the user data to the FlashMap
			return "redirect:/mailingList";                                            // Go to the GET for this URL
		}
// We get here when there are no validation	errors in the form	
		flash.addFlashAttribute("message", "You have successfully registered.");
		
		return "redirect:/confirmation";
	}
	
	

	// GET: /confirmation
	// Return the confirmation view
	@RequestMapping(path="/confirmation", method=RequestMethod.GET)
	public String showConfirmationView() {
		return "confirmation";
	}
}
