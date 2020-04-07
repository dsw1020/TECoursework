package com.techelevator.fbn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller									// There are one or more Controllers here
public class HomeController {

	@RequestMapping("/")					// Handle the url root path
	
	public String displayHomePage() {
		
		return "homePage";					// Name of the view (jsp) to display
	}
}
