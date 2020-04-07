package com.techelevator;

public class SPUTwoDay extends DeliveryDriver {

	double rate = 0;
	int days = 0;
	
	
	/************************************************************************************************
	 * 0 arg Constructor
	 ***********************************************************************************************/
	
	public SPUTwoDay () {
		super ("SPU (2-Day Business)");
		
	}
	
	/************************************************************************************************
	 * Methods
	 ***********************************************************************************************/
	
	public double calculateRate(int distance, double weight) {
		
		double tooDay = ((weight/16) * 0.050) * distance;
		
		return tooDay;

	}

}
