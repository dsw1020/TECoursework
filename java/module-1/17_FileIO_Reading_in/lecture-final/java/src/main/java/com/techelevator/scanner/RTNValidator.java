package com.techelevator.scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class RTNValidator {
	
	private static final int[] CHECKSUM_WEIGHTS = new int[] { 3, 7, 1, 3, 7, 1, 3, 7, 1 };

	public static void main(String[] args) throws FileNotFoundException  {  // throws tells Eclipse you know you might 
		                                                                    // throw this exception - you might/might not
		                                                                    //     handle
		printApplicationBanner();
		
		File inputFile = getInputFileFromUser();            // Define a File object to represent our disk file
		try(Scanner fileScanner = new Scanner(inputFile)) { // Define a Scanner object for the File object
			while(fileScanner.hasNextLine()) {              // Ask fileScanner - Do you have a nextLine()?
				String line = fileScanner.nextLine();       // Get the nextLine from fileScanner
				String rtn = line.substring(0, 9);          // Using a String method to get data out of line
				System.out.print("RTN : " + rtn);
				if(checksumIsValid(rtn) == false) {
					System.out.println(" - Invalid");
				}
					else {
						System.out.println(" - Valid");
				}
			}
		}
	}
	// End of main() method
	
	// Methods defined outside of main() that main() uses
	// It's OK - as long as they are static
	
	private static void printApplicationBanner() {
		System.out.println("******************");
		System.out.println("RTN Validator 9000");
		System.out.println("******************");
		System.out.println();
	}
	
//	@SuppressWarnings("resource")
	private static File getInputFileFromUser() {
		Scanner userInput = new Scanner(System.in);                // Define an object for the keyboard
		System.out.print("Please enter path to input file >>> ");  // Prompt the user for input
		String path = userInput.nextLine();                        // Get a line from the keyboard
		System.out.println("Path entered: "+ path + "\n");         // Show the user what we got from the keyboard
		File inputFile = new File(path);                           // Define a file object for the path entered by user
		if(inputFile.exists() == false) {                          // Checks for the existence of a file in the path
			System.out.println(path+" does not exist");            //     If it doesn't tell the user
			System.exit(1); // Ends the program                    //     End the program with a return code of 1
		} else if(inputFile.isFile() == false) {                   // Check to be sure the user gave us the name of a file
			System.out.println(path+" is not a file");             //     If not a file - tell user
			System.exit(2); // Ends the program                    //     End the program with a return code of 2
		}
	    userInput.close();                                         // We're done with keyboard in this method so release resource
		return inputFile;                                          // If what the user gave us exists and is a file
	}                                                              //    return the file obbject we created
                                                                     
	private static boolean checksumIsValid(String routingNumber) {
		int checksum = 0;
		for(int i = 0; i < 9; i++) {
			int digit = Integer.parseInt(routingNumber.substring(i, i+1));
			checksum += digit * CHECKSUM_WEIGHTS[i];
		}
		return checksum % 10 == 0;
	}
}
