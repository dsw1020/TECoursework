package com.techelevator;

import java.util.Scanner;

public class LinearConvert {

	public static void main(String[] args) {	
		
		Scanner theKeyboard = new Scanner(System.in);
    
			String measurement = "";
	    
			System.out.println("Please enter the length: ");
			measurement = theKeyboard.nextLine();
	    
			String typeOfMeasurement = "";
	    
			System.out.println("Is the length in (F)eet or (M)eters?");
			typeOfMeasurement = theKeyboard.nextLine();
	    
			double nowMeters = 0;
			double nowFeet = 0;
	
			if (typeOfMeasurement.equals ("F")) {
				nowMeters = (Double.parseDouble(measurement) * 0.3048);
				System.out.println(measurement + " Feet is equivalent to " + nowMeters + " Meters.");
			}
	    
			else if (typeOfMeasurement.equals("M")) 
			{
				nowFeet = (Double.parseDouble(measurement) * 0.3048);
				System.out.println(measurement + " Meters is equivalent to " + nowFeet + " Feet."); 
				
			}



	}

}


