package com.techelevator.productreview.model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class ProductReviewAPIDAO {
	
public String getJsonStringFromUrl(URL url) throws MalformedURLException, IOException {
		
	HttpURLConnection serverConnection = (HttpURLConnection) url.openConnection();
		
	serverConnection.setRequestMethod("GET");

	if (serverConnection.getResponseCode() != 200) {
		System.out.println(url);
		throw new RuntimeException("Failed : HTTP error code : " + serverConnection.getResponseCode());
		}

	BufferedReader responseContentReader = new BufferedReader(new InputStreamReader((serverConnection.getInputStream())));
	String output = "";
	String jsonString = "";
		
	while ((output = responseContentReader.readLine()) != null) {
		jsonString += output;
		}
	serverConnection.disconnect();

	return jsonString;
}
}
