package com.techelevator;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		
		Scanner theKeyboard = new Scanner(System.in); 			//Create scanner for keyboard inputs
		String fibonacciInput = "";								// Define the String input for the Scanner
		System.out.println("Please enter an integer: ");		// Start with the first System.out.println requesting the user to input the data
		
		fibonacciInput = theKeyboard.nextLine();				// Prompt the Scanner to take data from the Keyboard input and use in the next line.
		
		int fibonacciNumber = Integer.parseInt(fibonacciInput);
		int fib1 = 0, fib2=1;
		
		for (int i = 1; fib1 <= fibonacciNumber; i++) { 		// The initial Fib loop. Input is parsed from the keyboard input. fib 1 stores 
													   			//the first digit of the sequence so the loop cannot count any higher than that point.
		
		System.out.println(fib1 + " ");
		int sum = fib1 + fib2; 									// this step is used to create a sum of the two digits to make the next number in the sequence
		
		fib1 = fib2;				// this step takes the second digit and moves it back to the first position. 
		
		fib2 = sum;		//Finally, this takes the sum of the loop and moves it back to the 2nd digit in the loop, allowing the loop's recusion. 
		
		
		
		
		
		}	
	}	
}
