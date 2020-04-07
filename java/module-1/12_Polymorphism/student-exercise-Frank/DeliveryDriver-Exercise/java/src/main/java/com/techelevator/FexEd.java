package com.techelevator;

public class FexEd extends DeliveryDriver{
	
	
	/************************************************************************************************
	 * Constructor
	 ***********************************************************************************************/
	
	public FexEd() {
		super("FexEd");
		
	}
	
	/************************************************************************************************
	 * Methods
	 ***********************************************************************************************/
	
	public double calculateRate(int distance, double weight) {
		double rate = 20.00;
		
		if (distance > 500) {
			rate += 5.00;
		}
		if (weight > 48) {
			rate += 3.00;
		}
		return rate;
		
	}

	
	
	
	

}
