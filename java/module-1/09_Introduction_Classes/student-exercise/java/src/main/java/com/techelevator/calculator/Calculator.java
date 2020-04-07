package com.techelevator.calculator;

public class Calculator {

	//********************************************************************************************	
	// Class member data - attributes of an class object
	//********************************************************************************************
	
	private int result; // The current calculated value
	
	/**************************************************************************************
	 * Constructors
	***************************************************************************************/
	
	public Calculator() { // Default Constructor
		
	}

	
	//********************************************************************************************
	// Getters	- Allows users to see the values in an object
	//********************************************************************************************

	public int getResult() { 
		return result;
	}
	
	/**************************************************************************************
	 * Public Methods / Behaviors - Accessible to the public
	***************************************************************************************/
	
	public int add(int addend) {
		result += addend;
		return result;	

	}
	
	public int multiply(int multiplier) {
		result *= multiplier; 
		return result;
	}
	
	public int power(int exponent) {
		result = (int)Math.pow(result, exponent);
		return result;
	}
	
	public void reset() {
		result = 0;
	}
	
	public int subtract(int subtrahend) {
		result = result - subtrahend;
		return result;
	}
	
	
	
	
}
