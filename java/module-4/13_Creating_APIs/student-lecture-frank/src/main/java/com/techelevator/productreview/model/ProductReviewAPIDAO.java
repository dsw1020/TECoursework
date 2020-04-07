package com.techelevator.productreview.model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class ProductReviewAPIDAO {

	
// receive the URL for the API to be called	
public String getJsonStringFromUrl(URL url) throws MalformedURLException, IOException {
	// Connect to the server the URL	
	HttpURLConnection serverConnection = (HttpURLConnection) url.openConnection();
	
	// Set connection to the server for GET and do it - the url was specified as the object in the openConnection()
	serverConnection.setRequestMethod("GET");
    
	// If the HTTP status indicated the GET was NOT successful (not a 200)
	if (serverConnection.getResponseCode() != 200) {
		System.out.println(url);
		throw new RuntimeException("Failed : HTTP error code : " + serverConnection.getResponseCode());
		}
    // The GET was successful - extract the data from the response body
	// The data is returned as a byte stream
	// Set up a BufferedReader with an InputStreamReader to read the bytes from the response
	//          getInputStream() method of the connection return the data as a byte stream
	//
	
	
	// Get the data from the responses a byte stream
	BufferedReader responseContentReader = new BufferedReader(new InputStreamReader((serverConnection.getInputStream())));
	String output = "";      // hold the line from the byte stream containing the data
	String jsonString = "";  // hold the data to be returned
		
	while ((output = responseContentReader.readLine()) != null) {  // loop while there is a line read from byte stream
		jsonString += output;                                      // add the line to the return variable
		} 
	serverConnection.disconnect();   // disconnect from the api served

	return jsonString;               // return data received from API
}
}
