package com.techelevator;

import java.util.Scanner;  // Java class that does input

public class CommandLineSampleProgram {

	public static void main(String[] args) {
		
		System.out.println("Welcome to Frank's Command Line Sample Program");
		
		// Java Scanner is defined to handle input
		// Define a Scanner object to represent the keyboard
		// System.in is a name defined by Java for the keyboard
		
		Scanner theKeyboard = new Scanner(System.in);
		
		String aLine = ""; // Hold a line from the keyboard
		
		System.out.println("Enter a line: ");
		aLine = theKeyboard.nextLine();         // Get a line from the keyboard and store it in aLine
		
		System.out.println("You entered: " + aLine);
		
		System.out.println("Enter a number: ");
		aLine = theKeyboard.nextLine();         // Get a line from the keyboard and store it in aLine
		
		int number = Integer.parseInt(aLine);   // Convert the String to an int
		
		System.out.println("Enter another number: ");
		aLine = theKeyboard.nextLine();         // Get a line from the keyboard and store it in aLine
		
		int number2 = Integer.parseInt(aLine);  // Convert the String to an int
			
		System.out.println("The sum of the numbers is: " + (number + number2));
		
//-------------------------------------------------------------------------------------
		
		System.out.println("Enter a number: ");
		number = theKeyboard.nextInt();         // Get a integer from the keyboard and store it in aLine
		
		System.out.println("Enter another number: ");
		number2 = theKeyboard.nextInt();        // Get a line from the keyboard and store it in aLine	
		
		System.out.println("The sum of the numbers is: " + (number + number2));
		
//-------------------------------------------------------------------------------------
		
		System.out.println("Enter a number: ");
		number = theKeyboard.nextInt();         // Get a integer from the keyboard and store it in aLine
		
		theKeyboard.nextLine();  // Remove the \n left in the buffer by enter
		
		System.out.println("Enter another number: ");
		number2 = theKeyboard.nextInt();        // Get a line from the keyboard and store it in aLine
		
		theKeyboard.nextLine();  // Remove the \n left in the buffer by enter
		
		System.out.println("What's your name?");
		aLine = theKeyboard.nextLine();
		
		System.out.println("Hello " + aLine + " The sum of the numbers is: " + (number + number2));
//----------------------------------------------------------------------
// Loop until the user enters "n"
		
		System.out.println("Do you have any numbers to add up? (y/n)");
		aLine = theKeyboard.nextLine();  // Get the user's answer
		
		while (aLine.equals("y")) {
		
			System.out.println("Enter a series of integers separated by spaces");
		
			aLine = theKeyboard.nextLine();        // Get a line from the keyboard and store it in aLine
		
			String[] theNumbers = aLine.split(" "); // take the data in a String and break it into 
		                                        //     an array of values based on separator (" ")
			int sum = 0;  // hold the sum of the numbers
		
			for(int i=0; i < theNumbers.length; i++) {
				sum = sum + Integer.parseInt(theNumbers[i]);  // convert the current element in array to int
			                                              //   add the value to sum
			}	
			System.out.println("The sum of the numbers is: " + sum);
			
			System.out.println("Do you have any numbers to add up? (y/n)");
			aLine = theKeyboard.nextLine();  // Get the user's answer
		}
		//----------------------------------------------------------------------

		// Loop until the user enters "n"
							
		 do {	
			System.out.println("Enter a series of integers separated by spaces");
			
			aLine = theKeyboard.nextLine();        // Get a line from the keyboard and store it in aLine
				
			String[] theNumbers = aLine.split(" "); // take the data in a String and break it into 
				                                        //     an array of values based on separator (" ")
			int sum = 0;  // hold the sum of the numbers
				
			for(int i=0; i < theNumbers.length; i++) {
				sum = sum + Integer.parseInt(theNumbers[i]);  // convert the current element in array to int
					                                              //   add the value to sum
				}	
			System.out.println("The sum of the numbers is: " + sum);
					
			System.out.println("Do you have any numbers to add up? (y/n)");
			
			aLine = theKeyboard.nextLine();  // Get the user's answer
		    }
		while (aLine.equals("y"));
				
	}
	
	
}
