package com.techelevator.scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class RTNValidator {
	
	private static final int[] CHECKSUM_WEIGHTS = new int[] { 3, 7, 1, 3, 7, 1, 3, 7, 1 };

	public static void main(String[] args) throws FileNotFoundException {
										  // Throws - tells the compiler I know this checked exception can happen
		printApplicationBanner();
		
		File inputFile = getInputFileFromUser();				// inputFile is a File object for an existing file
		
		try(Scanner fileScanner = new Scanner(inputFile)) {
			
			while(fileScanner.hasNextLine()) {					// Loop while the file has another line
				String line = fileScanner.nextLine();			// Read the next line into the variable line 
				String rtn = line.substring(0, 9);				// Get the first 9 characters of the line
				System.out.print("RTN : " + rtn);				// Display the routing number to the user
				if(checksumIsValid(rtn) == false) {				// If the routing number is invalid...
					System.out.println(" - Invalid");			// 		Print an Invalid Message
				}
					else {										//	If the routing number is valid...
						System.out.println(" - Valid");			// 		Print the Valid message
				}												// end of If
			}													// End of the while()
		}					// End of try block
	}

	private static void printApplicationBanner() {
		System.out.println("******************");
		System.out.println("RTN Validator 9000");
		System.out.println("******************");
		System.out.println();
	}

	@SuppressWarnings("resource")
	private static File getInputFileFromUser() {
		Scanner userInput = new Scanner(System.in);					// Define a keyboard object
		System.out.print("Please enter path to input file >>> ");	// Prompt the user
		String path = userInput.nextLine();							// Get a line from the Keyboard
		
		System.out.println("Path entered: "+ path + "\n");
		
		File inputFile = new File(path);							// Define a File object for the input file
		
		if(inputFile.exists() == false) { 							// checks for the existence of a file
			System.out.println(path+" does not exist");				// If note - message the user
			System.exit(1); // Ends the program						// Terminate the program with return code 1
		} else if(inputFile.isFile() == false) {					// If it does exist, check to see if it's a file
			System.out.println(path+" is not a file");				// if not a file - message the user
			System.exit(1); // Ends the program						// terminate program with a return code 1
		}
		return inputFile;
	}

	private static boolean checksumIsValid(String routingNumber) {
		int checksum = 0;
		for(int i = 0; i < 9; i++) {
			int digit = Integer.parseInt(routingNumber.substring(i, i+1));
			checksum += digit * CHECKSUM_WEIGHTS[i];
		}
		return checksum % 10 == 0;
	}
}
