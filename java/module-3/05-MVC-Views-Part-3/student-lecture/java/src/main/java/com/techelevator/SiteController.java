package com.techelevator;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller  				// Tells Spring MVC this file contains one or more controllers
public class SiteController {

	private ForumDao forumDao;

	public SiteController() {
		forumDao = new ForumDao();
	}
	@RequestMapping("/")	// Tells Spring MVC which URL path the method that follows processes
							// This is the Controller for a specific URL
	public String showHomePage() {
		return "home";		// return the name of the view
	}

	@RequestMapping("/aboutUs") // Handle the /aboutUs path
	public String showAboutUs() {
		return "aboutUs";		// return the name of the view
	}

	@RequestMapping("/forum") 						// Handle the /forum path
	public String showForumList(HttpServletRequest request) { 
		
		request.setAttribute("topicList", forumDao.readAllTopics());  // Go to the model and get some data
																	  // and put the data in the request map
		return "forum/forumList";					// returning the name of the view
	}

	@RequestMapping("/forum/forumDetail")			// Handle the /forum/forumDetail path
	public String showForumDetails(HttpServletRequest request) {
		
		Long id = Long.parseLong(request.getParameter("forumId"));  // Retrieve the forumId parameter from the URL
																	// parameters are Sting values so convert to Long for use
		
		request.setAttribute("topic", forumDao.getForumTopicById(id)); // Go to Model to get the data with the id specified in URL 
																	   // Put data in Request Map with entry name topic 
		return "forum/forumDetail";					// return the name of the view
	}	

}
