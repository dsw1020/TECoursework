package com.techelevator.product;

public class Product {

	//********************************************************************************************	
	// Class member data - attributes of an class object
	//********************************************************************************************
	
	private String name; // The name of the product
	
	private double price; // The price of the product
	
	private double weightInOunces; // The weight (in ounces) of the product
	
	/**************************************************************************************
	 * Constructors
	***************************************************************************************/
	public Product() { // Default Constructor
		
	}
	
	//********************************************************************************************
	// Getters	- Allows users to see the values in an object
	//********************************************************************************************
	
	public String getName() {
		return name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public double getWeightInOunces() {
		return weightInOunces;
	}
	
	//********************************************************************************************
	// Setters	- Allows users to change values
	//********************************************************************************************
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void setWeightInOunces(double weightInOunces) {
		this.weightInOunces = weightInOunces;
	}
	
	
	
}
