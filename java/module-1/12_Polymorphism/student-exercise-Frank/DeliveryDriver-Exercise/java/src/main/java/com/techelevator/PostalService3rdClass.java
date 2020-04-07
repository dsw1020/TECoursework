package com.techelevator;

public class PostalService3rdClass extends DeliveryDriver{
	
	/************************************************************************************************
	 * Constructor
	 ***********************************************************************************************/
	
	public PostalService3rdClass() {
		super("Postal Service (3rd Class)");
		
		
	}
	
	
	/************************************************************************************************
	 * Methods
	 ***********************************************************************************************/
	
	public double calculateRate(int distance, double weight) {
		double rate = 0.0;
		
		if (weight > 0 && weight <= 2) {
			rate = 0.0020 * distance;
		}
		else if (weight > 2 && weight <= 8) {
			rate = 0.0022 * distance;
		}
		else if (weight > 8 && weight <= 15) {
			rate = 0.0024 * distance;
		}
		else if(weight > 15 && weight <= 48) {
			rate = 0.0150 * distance;
		}
		else if (weight > 48 && weight <= 128) {
			rate = 0.0160 * distance;
		}
		else if (weight > 128) {
			rate = 0.0170 * distance;
		}
		
		return rate;
		
	}

	

}
