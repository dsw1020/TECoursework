package com.techelevator.productreview.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Timestamp;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techelevator.productreview.model.ProductReviewAPIDAO;
/**
 * ApiController
 */
@RestController          // identifies the controller a REST api controller - can be called from web service
@RequestMapping("/api")  // Identify root path for all controllers in the - just like it did before
@CrossOrigin             // Allow CORS access - Cross-Origin-Resource-Sharing - allows server to share data
public class APIController {

	@GetMapping   // indicates this method with handle HTTP GET requests for the root
	public String returnProductData() throws IOException {
		
		ProductReviewAPIDAO  ApiDao = new ProductReviewAPIDAO();
		
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		
		System.out.println("Howdy from the Java Product Review REST API at " + timestamp);
							
		URL url = new URL("http://5dd69774ce4c300014403ae7.mockapi.io/productdata");  // Define the URL I want the DAO to use

		String jsonString = ApiDao.getJsonStringFromUrl(url);   // Go get the data from the url specified
		
		return jsonString;                                      // return the data requested rather than the view name
	}
	
	}

