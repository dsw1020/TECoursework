package com.techelevator.productreview.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller 
@RequestMapping(path= {"/","/mvc"})
public class MVCController {

	@RequestMapping(path= {"/"})
	public String displayAPIServerStartScreen() {
		
		return "productReviewAPI-HomePage";
	}
	@RequestMapping(path= {"/mvc"})
	public String displaySpringMVCRootPage() {
		
		return "productReviewMVC-HomePage";
	}
	}

