package com.techelevator;

/**********************************************************************
* Fibonacci problem	 
***********************************************************************/

import java.util.Scanner;

public class Fibonacci {

public static void main(String[] args) {
    
	Scanner kybd = new Scanner(System.in);                // Define a keyboard object
    
    System.out.print("Enter upper limit for sequence: "); // Prompt the user
    String theLimit = kybd.nextLine();	                  // Get the upper limit from the user
    int limit = Integer.parseInt(theLimit);               // Convert the upper limit to an int

    int previous = 0;                                     // Variable to hold previously processed loop value
    System.out.print("0");                                // Display zero since it is always the 1st in the sequence

// the first and last section of the for loop are optional.  
// Here, we do not do anything at the end of each iteration.

 for(int next = 1; next < limit; ) {                      // Loop from one to the limit variable
    System.out.print(", "+next);                          // Display the current loop variable
    int temp = previous + next;                           // Calculate the sum of the previous + current values
    previous = next;                                      // Remember the current value as the previous value
    next = temp;                                          // Make the loop variable equal to sum of previous + current
    }                                                     // Loop again
  }

/**********************************************************************
* Sample logic for Fibonacci problem	 
***********************************************************************
* 1. Get the upper limit for the sequence from the user.
* 
* 2. Define a variable to hold the previously processed loop value
* 3. Display a zero which is always the first number in the sequence
* 4. Loop from 1 to the limit value 
*    (the for loop variable is the current loop value)
*    (NOTE:  DO NOT CODE AN INCREMENT IN THE for STATEMENT  
*     e.g. for (init; condition;)
*    a. Display the current loop value 
*       (you may need to include a ' , ' somewhere too)
*    b. Create a variable to hold the sum of the current loop value 
*              and the previous loop value
*    c. Remember the current loop value in the variable 
*              that is holding the previously processed loop value
*    d. Set the loop variable to the sum of the 
*       previous loop value + current loop value (step b)
***********************************************************************/
}

