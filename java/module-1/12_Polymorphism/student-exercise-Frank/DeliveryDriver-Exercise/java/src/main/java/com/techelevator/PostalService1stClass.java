package com.techelevator;

public class PostalService1stClass extends DeliveryDriver{

	
	/************************************************************************************************
	 * Constructor
	 ***********************************************************************************************/
	
	public PostalService1stClass() {
		super("Postal Service (1st Class)");
	}
	
	
	/************************************************************************************************
	 * Methods
	 ***********************************************************************************************/
	
	public double calculateRate(int distance, double weight) {
		double rate = 0.0;
		
		if (weight > 0 && weight <= 2) {
			rate = 0.035 * distance;
		}
		else if (weight > 2 && weight <= 8) {
			rate = 0.040 * distance;
		}
		else if (weight > 8 && weight <= 15) {
			rate = 0.047 * distance;
		}
		else if(weight > 15 && weight <= 48) {
			rate = 0.195 * distance;
		}
		else if (weight > 48 && weight <= 128) {
			rate = 0.450 * distance;
		}
		else if (weight > 128) {
			rate = 0.500 * distance;
		}
		
		return rate;
		
	}

	

}
