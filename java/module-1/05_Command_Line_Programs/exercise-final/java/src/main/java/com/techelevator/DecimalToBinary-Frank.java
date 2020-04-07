package com.techelevator;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {

		String[] binaryDigit = new String[100];  // Array to hold binary digits backwards
		
		int userValue = 0;
		
		System.out.println("Please enter a series of decimal value separated by spaces : ");
		Scanner theKeyboard = new Scanner(System.in);
		
		String userInput = theKeyboard.nextLine();   // Get a line from the user
		
		String[] eachValue = userInput.split(" ");   // Get the values bewteen the spaces
		
		for (int i = 0; i < eachValue.length; i++) {
		
			userValue = Integer.parseInt(eachValue[i]); // convert one of the user numbers  to an int
		
			int binaryIndex = 0; // index for the binaryDigit array
		
			while(userValue > 0) {
			
				binaryDigit[binaryIndex] = Integer.toString(userValue % 2);  // Find the 1 or 0 for the binary of the value
				userValue = userValue / 2;                                   // Adjust the value based on the binary position
				binaryIndex++;
			}  // end of the while loop to convert to binary
	
			for (int j=binaryIndex-1;  j >= 0; j--) {
				System.out.print(binaryDigit[j]);   // Display the current binary digit
			
				} // end of the for loop to display the binary digits
			System.out.println(0);
		}  // end of the for loop for eachValue
	}
	/********************************************************************************
	* Sample logic for converting a decimal value to a binary value
	*********************************************************************************
	* 1. Define an array to hold binary digits; 
	*    (Define a size for the largest number of digits you expect
	* 2. Get decimal number(s) from user
	* 3. Define a variable to use as an index into array of binary digits
	* 4. Initialize index for binary digit array to first element
	* 
	* 5. Loop to determine the binary digits in the decimal number:
	*    (while the decimal number is not zero):
	*    a. Store the remainder of the decimal number divided by 2 
	*       into the current array element of binary digit array
	*    b. Increment the index for accessing binary digit array
	*    c. Store the quotient of the decimal number divided by 2 
	*       back into the decimal number
	*  
	* 5. Loop to print out the values in the binary digit array backwards.
	*    (Be sure you start at the last value placed in the array 
	*        and not the last element IN the array)
	********************************************************************************/

}
