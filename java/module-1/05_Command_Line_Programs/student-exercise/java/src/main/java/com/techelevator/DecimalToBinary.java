package com.techelevator;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		
//		Scanner theKeyboard = new Scanner(System.in);  //import scanner for keyboard inputs
//		String decimalToBinary = "";		// establish string for input
//		System.out.println("Please enter a series of integers separated by spaces in to the input field: "); // create first text output line prompting user to input data
//		decimalToBinary = theKeyboard.nextLine(); // move the scanner forward one line
//		
//		String [] tempDecimal = decimalToBinary.split(" ");	// initialize the string array for temporary decimals
//		int [] conversionDecimal = new int [tempDecimal.length];	//initialize conversion array
//		int [] reverseBinary = new int[1024];	// initialize binary array
//		
//		// Create the first loop in the process to take the array from a string to a series of integers.
//		
//		for (int i = 0; i < tempDecimal.length; i++) {
//			conversionDecimal[i] = Integer.parseInt(tempDecimal[i]);
//		}
//		// at this point, the second loop must be established to work through the newly created array of integers, with the next loop incrementing one by one. 
//		
//		for (int i=0; i< conversionDecimal.length; i++) {
//			int binaryIndex = 0;
//			
//		// now, we implement the previous loop data into a while loop, converting the integers to binary. this loop also will put the binary data into an array in reverse order. 
//			while (conversionDecimal[i]>0) {
//	            reverseBinary[binaryIndex] = conversionDecimal[i] % 2;
//	            binaryIndex++;
//	            conversionDecimal[i] /= 2;              
//	            }
//		//	after the while loop completes the conversion, the last for loop is used to flip the binary data to produce the correct order
//			
//			for (int j=binaryIndex-1; j>-1; j--) {
//	            System.out.print(reverseBinary[j]);
//	        }
//			System.out.println(""); // finally, we place a new line at the end to print out the data. 
//		}
//	}
//	
	// Option A. Use active code	
	String [] binaryDigit = new String [100]; // Array to hold binary digits backwards (accounting for a max of 10 digits input)
	
	int userValue = 0; // create int for user input
	System.out.println("Please enter a decimal value: ");	//prompt the user for an input
	
		
	// System.out.println(" Please enter a series of decimal value separated by spaces: ");
	//	
		Scanner theKeyboard = new Scanner(System.in); //create and import scanner
		userValue = Integer.parseInt(theKeyboard.nextLine());	//get a line and convert it to an integer

	// String [] eachValue = userInput.split(" "); //Get the values between the spaces	
		
		
		
		
	//-----Alternate method to get an int from the keyboard successfully-----------------------
	//		userValue = theKeyboard.nextInt(); // get an Int
	//		theKeyboard.nextLine(); 		   // Clear the keyboard buffer and move the program forward one line.
	//------------------------------------------------------------------------------------------
		
		int binaryIndex = 0;  //index for the binaryDIgit array
		
		for (; userValue > 0; binaryIndex++)	{		// this for loop is going forwards starting at 0 and going for greater than 0. 
				// also can move the binaryIndex++ below the userValue = userValue / 2;
			
			binaryDigit[binaryIndex] = Integer.toString(userValue % 2); // Find the 1 or 0 for the binary of the value
			userValue = userValue / 2; 						  // Adjust the value based on the binary position (refer to notes from 1/21/2020 
		}													  // for example of how to convert binary by hand
	/* Option 2 for to make loop more efficient : 
	 	//	while (userValue > 2) {
		// binaryDigit[binaryIndex] = Integer.toString(userValue % 2);
		// userValue = userValue / 2;
		// binaryIndex++;
		}
	*/
		
		
	//-----Alternative method-------------------------------------------------------------------
	// userValue /= 2; // Alternative to userValue = /2;
	//------------------------------------------------------------------------------------------
		for (int i = binaryIndex-1; i >=0; i--) {		// this for loop is going backwards. Using the array for binary digit as the int i value; add -1 
														// as you have a null user value in the last index position
			System.out.print(binaryDigit[i]);	// Display the current binary digit (use .print not .println because you want it all in one individual 
												// line rather than each number printing a different line
		}
		// Option B. multiple inputs at once		
	
//	String [] binaryDigit = new String [100]; // Array to hold binary digits backwards (accounting for a max of 10 digits input)
//		Scanner theKeyboard = new Scanner(System.in);
//		System.out.println(" Please enter a series of decimal value separated by spaces: ");	//prompt the user for an input
//		int userValue = 0; // create int for user input
//		
//		String userInput = theKeyboard.nextLine();
//		String [] eachValue = userInput.split(" "); //Get the values between the spaces
//		
//		
//		for (int i = ); i < eachValue.length; i++)
//			userValue = Integer.parseInt(eachValue.[i]);
//		
//			int binaryIndex = 0;
//			
//		for(; userValue > 0; binaryIndex++) {
//			binaryDigit[binaryIndex] = Integer.toString(userValue % 2);
//			userValue = userValue / 2;
//			
//		}
//		for (int j = binaryIndex - 1; j >= 0; j-- )
//			System.out.print(binaryDigit[j]);
//		
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			
	}
	
		
		
		
}

		
		
