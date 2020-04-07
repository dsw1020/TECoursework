package com.techelevator.controllers;

import com.techelevator.daos.PuppyDao;
import com.techelevator.exceptions.PuppyNotFoundException;
import com.techelevator.models.Puppy;

import java.io.IOException;
import java.net.URL;
import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 * Puppies API Controller
 * 
 * This controller should handle the following API requests:
 * 
 * GET - /api/allPuppies - return all Puppies in the data base as an array of JSON objects
 * 
 * GET - /api/puppy/# - Returns the Puppy from the data based whose id matches the # specified
 * 
 * POST - /api/newPuppy - Add a Puppy to the database using the Puppy information in the API request
 * 
 * DELETE - /api/removePuppy/# - Delete the Puppy from the database whose id matches the # specified 
 * 
 */

@RestController
@CrossOrigin
@RequestMapping("/api")


public class PuppiesController {
	
	@Autowired
	PuppyDao thePuppies;
	
	
	@GetMapping("/allPuppies")
	public List<Puppy> getAllPuppies() {
		return thePuppies.getPuppies();
	}
	
	@GetMapping("/puppy/{id}")
	public Puppy getAPuppyById(@PathVariable int id) {
		
		Puppy aPuppy = thePuppies.getPuppy(id);
		
		if(aPuppy != null) {
			return aPuppy;
		}
		else {
			throw new PuppyNotFoundException();
		}
	}
	
	@PostMapping ("/newPuppy")                  
	@ResponseStatus(HttpStatus.CREATED) 
	public void createNewPuppy(@RequestBody Puppy aPuppy) {
	
	 thePuppies.savePuppy(aPuppy);
	
	}
		
	@DeleteMapping("/removePuppy/{id}")
	public void deletePuppy(@PathVariable int id) {
		
		Puppy aPuppy =thePuppies.getPuppy(id);
		
		if(aPuppy != null) {
			thePuppies.removePuppy(id);
		}
		else {
			throw new PuppyNotFoundException("No puppy found!");
		}
	}
	
	
	
	
	
}
