package com.techelevator;

public class SPUNextDay extends DeliveryDriver{
	
	double rate = 0;
	int days = 0;
	
	/************************************************************************************************
	 * Constructor
	 ***********************************************************************************************/
	
	public SPUNextDay () {
		super("SPU (Next Day)");
		
	}
	
	/************************************************************************************************
	 * Methods
	 ***********************************************************************************************/
	
	public double calculateRate(int distance, double weight) {
		
		double nextDay = ((weight/16) * 0.075) * distance;
	
			return nextDay;

	}

}
