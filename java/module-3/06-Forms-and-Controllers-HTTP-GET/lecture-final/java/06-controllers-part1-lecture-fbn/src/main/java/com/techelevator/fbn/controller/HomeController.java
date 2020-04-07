package com.techelevator.fbn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller                    // There be Controllers in here
public class HomeController {

	@RequestMapping("/")       // handle the URL root path
	public String displayHomePage() {
		return "homePage";     // name of  the View (jsp) to display
	}
}
