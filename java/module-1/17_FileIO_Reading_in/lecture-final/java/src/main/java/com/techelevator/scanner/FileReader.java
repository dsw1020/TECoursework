package com.techelevator.scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader {

	public static void main(String[] args) throws FileNotFoundException {
		
		File aFile = new File("./data/myData.txt"); // Define a file object to our disk file
		                                            // If the file is NOT in the root path of project
		                                            //      specify path relative to the root path of project
		Scanner aScanner = new Scanner(aFile);      // Define a Scanner object for out File object
		
		while(aScanner.hasNextLine()) {             // Loop while the file has a line to read
			String aLine = aScanner.nextLine();     // Read the next line from the file
			
// Sum the numbers in each line of the file			

			String theNumbers[] = aLine.split(",");  // Separate the numbers between the commas into a String array	
			int    theSum       = 0;                 // Hold the sum of the numbers
			
			for(String aNumber : theNumbers) {       // Loop through the array of individual numbers
				theSum += Integer.parseInt(aNumber); // Convert each number from a String to an int and add to sum 
			}
			
			System.out.println("Line read was: " + aLine + " and the sum is: " + theSum);
		}
		aScanner.close();                           // Release the resources for the since we are done
	}

}
