package com.techelevator;

import java.util.Scanner;

public class TempConvert {

	public static void main(String[] args) {
		
		Scanner theKeyboard = new Scanner(System.in);
		    
			String temperature = "";
			    
			System.out.println("Please enter the temperature: ");
			temperature = theKeyboard.nextLine();
			    
			String typeOfTemperature = "";
			    
			System.out.println("Is the temperature in (C)elsius or (F)arenheit?");
			typeOfTemperature = theKeyboard.nextLine();
			    
			double nowFarenheit = 0;
			double nowCelcius = 0;
			    
			if (typeOfTemperature.equals("C")) 
			{
			nowFarenheit = (Double.parseDouble(temperature) * 1.8 + 32);
			System.out.println(temperature + "C is " + nowFarenheit + "F");
		}
			    
			else if (typeOfTemperature.equals("F")) 
			{
			nowCelcius = (((Double.parseDouble(temperature) - 32) * 5) / 9);
			System.out.println(temperature + "F is " + nowCelcius + "C");   
	}

		

	}
}