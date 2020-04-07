package com.techelevator.mine;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader {
	
		public static void main(String[] args) throws FileNotFoundException {
			String fileName = "./data/numbers.txt"; // File is in the same folder as project - just give it's name
			
			File numbersFile = new File(fileName); // Define a File Object for the text file
			
			Scanner donutFileScanner = new Scanner(numbersFile); // Define Scanner for the File Objects - Encapsulation Laws
			
			while (donutFileScanner.hasNextLine()) { 			// Loop while there are lines in the file
				String fileLine = donutFileScanner.nextLine();  //	Read a line from the file
				System.out.println("Line read: " + fileLine);	//	Display the line just read
				
// 			Sum the numbers and display the numbers and the sum
				
				String[] theNums = fileLine.split(","); 		// Place each number in the line as an element in an array
				
				int sum = 0; 	// This defined variable will hold the sum of the numbers
				
// 				for (int i = 0; i < theNums.length; i++) (alternate for-loop method if you want to avoid for-each-loop)
				
				for (String aNum : theNums) { 	// Loop through the created "theNums" array, placing each element in aNum
					int aValue = Integer.parseInt(aNum); // Convert the current element to an int by parsing String aNum into integer aValue
					sum += aValue;
					
				}
				System.out.println("The sum of the numbers is: " + sum); // Display the calculated sum
				
			}
			donutFileScanner.close();
		}
		
}
