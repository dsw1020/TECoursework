package com.techelevator;

public class Truck extends Vehicle{
	
	private static final double axle4 = 0.040;
	private static final double axle6 = 0.045;
	private static final double axle8Plus = 0.048;
	
	/************************************************************************************************
	 * Attributes
	 ***********************************************************************************************/
		
		private int numberOfAxles; // Creates a new truck indicating how many axles it has.
	
	
	
	/************************************************************************************************
	 * 0 argument Constructor		
	 ************************************************************************************************/
	
	public Truck (int numberOfAxles) {
		super("Truck");
		this.numberOfAxles = numberOfAxles;
	}
	
	
	/************************************************************************************************
	 * Getters
	 ***********************************************************************************************/
	
	public int getNumberOfAxles() {
		return numberOfAxles;
	}
	
	
	/************************************************************************************************
	 * Methods
	 ***********************************************************************************************/
	
	
	double toll = 0.0;
	
	public double calculateToll (int distance) {
		if (numberOfAxles == 4) {
			toll = axle4 * distance;
		}
		else if (numberOfAxles == 6) {
			toll = axle6 * distance;
		}
		else if (numberOfAxles == 8) {
			toll = axle8Plus * distance;
		}
		return toll;
	}
	


}
