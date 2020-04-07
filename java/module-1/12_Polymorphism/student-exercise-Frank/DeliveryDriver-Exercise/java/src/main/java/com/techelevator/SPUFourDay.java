package com.techelevator;

public class SPUFourDay extends DeliveryDriver{
	

	double rate = 0;
	int days = 0;
	
	
	/************************************************************************************************
	 * 0 arg Constructor
	 ***********************************************************************************************/
	
	public SPUFourDay () {
		super ("SPU (4-Day Ground)");
		
	}
	
	/************************************************************************************************
	 * Methods
	 ***********************************************************************************************/
	
	public double calculateRate(int distance, double weight) {
		
		double fourDay = ((weight/16) * 0.0050) * distance;
			
		return fourDay;

	}

}
