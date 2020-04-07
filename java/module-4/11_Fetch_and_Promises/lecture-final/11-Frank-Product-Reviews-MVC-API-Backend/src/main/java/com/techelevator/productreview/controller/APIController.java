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
@RestController
@RequestMapping("/api")
@CrossOrigin
public class APIController {

	@GetMapping
	public String returnProductData() throws IOException {
		
		ProductReviewAPIDAO  ApiDao = new ProductReviewAPIDAO();
		
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		
		System.out.println("Howdy from the Java Product Review REST API-11 at " + timestamp);
							
		URL url = new URL("http://5dd69774ce4c300014403ae7.mockapi.io/productdata");

		String jsonString = ApiDao.getJsonStringFromUrl(url);
		
		return jsonString;
	}
	
	}

