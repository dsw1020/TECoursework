package com.techelevator;

public class Car extends Vehicle{
	private static final double rate = 0.020;
	/************************************************************************************************
	 * Attributes
	 ***********************************************************************************************/
	
	private boolean hasTrailer; // Creates a new car indicating whether or not it is pulling a trailer
	
	/************************************************************************************************
	 * 1 arg Constructor
	 ***********************************************************************************************/
	
	public Car(boolean hasTrailer) {
		super("Car"); 
		this.hasTrailer = hasTrailer;
	}

	
	/************************************************************************************************
	 * Getters
	 ***********************************************************************************************/
	
	public boolean isHasTrailer() {
		return hasTrailer;
	}
	
	/************************************************************************************************
	 * Methods
	 ***********************************************************************************************/
		
		
	
		public double calculateToll(int distance) {
			double toll = 0.0;
			
			if(hasTrailer = true) {
				toll += 1;
			}
			else {
				toll = distance * rate;
		}
		return toll;
	}
	
	
	
	
	
}
