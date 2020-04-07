package com.techelevator;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.techelevator.model.campground.Campground;
import com.techelevator.model.campground.CampgroundDAO;
import com.techelevator.model.park.Park;
import com.techelevator.model.park.ParkDAO;
import com.techelevator.model.site.Site;
import com.techelevator.model.site.SiteDAO;

@Controller 
public class CampgroundMVC {

	// Define the DAO for parks table and have Spring MVC Dependency Inject it via @Autowired
	//  Be sure the @Component is in the JDBCDAO file for the DAO so Spring MVC can find it
	@Autowired
	ParkDAO theParks;
	
	@Autowired
	CampgroundDAO theCampgrounds;
	
	@Autowired
	SiteDAO theSites;
	
	@RequestMapping("/")
	public String displayHomePage(HttpSession sharedWithView) {
		
		// Use the ParkDAO to get all the parks
		List<Park> listOfParks = theParks.getAllParks();
			
		// Put the list in a Map (ModelMap) so View (jsp) can access it
		sharedWithView.setAttribute("allParks", listOfParks);		
		
		return "campgroundResHomePage";
	}
	
	@RequestMapping("/parkInfo")
	public String showParkInfo(@RequestParam int selectedPark
			                  , HttpSession cherWithView) {
		
		// Get the information from the data base for the selected Park
		Park theParkSelected = theParks.getParkById(selectedPark);
		
		// Put in the Map to share with view		
		cherWithView.setAttribute("aPark", theParkSelected);
		
		return "campgroundResHomePage";
	}
	@RequestMapping("/viewCampgrounds")
	
	public String viewCampGrounds(@RequestParam int selectedPark
			                      ,HttpSession campGrounds)
	{
	List<Campground> list1 = theCampgrounds.getCampgroundsByParkId(selectedPark);
	campGrounds.setAttribute("campGrounds", theCampgrounds.getCampgroundsByParkId(selectedPark));
	
	return "viewCampgrounds";

	}
	@RequestMapping("/searchReservations")
	public String searchReservation(@RequestParam int selectedCampground
			                        ,HttpSession campGrounds)

	{
		@SuppressWarnings("deprecation")
		Campground aCampground = theCampgrounds.getCampgroundsByParkIdAndCampgroundId(((Park)campGrounds.getValue("aPark")).getParkId(),selectedCampground);
		campGrounds.setAttribute("aCampground",aCampground);
	
	
	return "makeReservation";
	}
	
	@RequestMapping("/findAvailableSites")
	public String findAvailableSites(@RequestParam String arrivalDate
			                        ,@RequestParam String departureDate
			                        ,HttpSession RavenClaw)

	{
		List<Site> availableSites = null;
		
		int fromMonth = Integer.parseInt(arrivalDate.substring(0,2));
		int toMonth   = Integer.parseInt(departureDate.substring(0,2));
		
		//                                                               |-------------------- get the campground id --------------------|
		availableSites = theSites.getAvailableSitesForReservationRequest(((Campground)RavenClaw.getValue("aCampground")).getCampgroundId(), arrivalDate, departureDate, fromMonth, toMonth);
		//                                                               (campground)|Selected campground from Session Map|
		//                                                               |-------------------campground object --------------------------|
		//																					|campgroundID for selected campground--------|, arrivalDate, departureDate, fromMonth, toMonth
		RavenClaw.setAttribute("theSites",availableSites);
	
	
	return "makeReservation";
	}
	@RequestMapping("/reserveSite")
	public String reserveSite(@RequestParam String reservationName
			                 ,@RequestParam int selectedSite)
	{
		System.out.println("Site picked: " + selectedSite + " Name: " + reservationName);
		
		return "makeReservation";
		
	}
}
