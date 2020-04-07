package com.techelevator;

public class PostalService2ndClass extends DeliveryDriver{
	
	/************************************************************************************************
	 * 0 arg Constructor
	 ***********************************************************************************************/
	
	public PostalService2ndClass() {
		super("Postal Service (2nd Class)");
		
		
	}
	
	
	/************************************************************************************************
	 * Methods
	 ***********************************************************************************************/
	
	public double calculateRate(int distance, double weight) {
			double rate = 0.0;
			
			if (weight > 0 && weight <= 2) {
				rate = 0.0035 * distance;
			}
			else if (weight > 2 && weight <= 8) {
				rate = 0.0040 * distance;
			}
			else if (weight > 8 && weight <= 15) {
				rate = 0.0047 * distance;
			}
			else if(weight > 15 && weight <= 48) {
				rate = 0.0195 * distance;
			}
			else if (weight > 48 && weight <= 128) {
				rate = 0.0450 * distance;
			}
			else if (weight > 128) {
				rate = 0.0500 * distance;
			}
			
			return rate;
			
		
	}

	

}
