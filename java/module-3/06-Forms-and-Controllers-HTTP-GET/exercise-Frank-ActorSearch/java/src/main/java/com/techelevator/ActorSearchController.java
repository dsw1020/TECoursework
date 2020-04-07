package com.techelevator;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.techelevator.dao.ActorDao;
import com.techelevator.dao.model.Actor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ActorSearchController {

	@Autowired
	private ActorDao actorDao;

	@RequestMapping("/")
	public String showSearchActorForm() {
		return "actorList";     // show the jsp that will get the search value
	}

	@RequestMapping("/goFindTheActors")
//	public String searchActors(HttpServletRequest theRequest, @RequestParam String lastNameWeWant) {  // Get the value from teh query string stored in lastNameWeWant
	public String searchActors(@RequestParam String lastNameWeWant
			                  ,ModelMap myMap) {  // Get the value from teh query string stored in lastNameWeWant
	
		List<Actor> listOfActors = new ArrayList<Actor>();
		
		listOfActors = actorDao.getMatchingActors(lastNameWeWant);  // Go get the the actors that match the search string
		
		myMap.put("actors", listOfActors);            // Place the list of actors where view can find it
		
		return "actorList";    // show the jsp that will display data
	}
}
