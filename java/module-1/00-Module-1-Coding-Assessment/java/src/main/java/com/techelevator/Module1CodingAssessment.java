package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Module1CodingAssessment {

	public static void main(String[] args) {
		
		
		String cardNumber1 = "5458069654810762";
		String cardNumber2 = "45806965481076";
		String cardNumber3 = "4580696548310762";
		String cardNumber4 = "3458069654810762";
		String cardNumber5 = "3758069654810762";
		
		ArrayList<String> cardNumber = new ArrayList<String>(); 
		
		cardNumber.add(cardNumber1);
		cardNumber.add(cardNumber2);
		cardNumber.add(cardNumber3);
		cardNumber.add(cardNumber4);
		cardNumber.add(cardNumber5);
		

	}

	
	private boolean isRealCard(){
		String[] cardNumber = new String[] {"5458069654810762", "45806965481076", "4580696548310762",
				"3458069654810762", "3758069654810762"};
			boolean isCardNumber = false;                          
			for(String i = ""; i == cardNumber.length; i++) {
	            if (cardNumber [i] == "5458069654810762")
	                isCardNumber = false;
			}
	            if (cardNumber [i] == "45806965481076")
	                isCardNumber = false;
	           
	            }  
	        }  
	    }                
	    return sorted;
	}
	
	
	
	
	
	private static String getCardNumber() {
		Scanner userInput = new Scanner(System.in);
		System.out.print("");
		String searchString = userInput.nextLine();
		return searchString;
	}
	
	
	
	
	public void TellerInput() {
		try {
			File vMInventory = getTellerInputFile("TellerInput.csv");
			try (Scanner tellerScanner = new Scanner(vMInventory)) {
				while (tellerScanner.hasNextLine()) {
					String itemInfoFromFile = tellerScanner.nextLine();
					Item currentItem = getValues(itemInfoFromFile);
					inventoryMap.put(currentItem.getSlot(), currentItem);
				}
			}
		} catch (FileNotFoundException ex) {
			System.out.println(ex.getMessage());
			System.exit(1);
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
			System.exit(1);
		}

	}
}
