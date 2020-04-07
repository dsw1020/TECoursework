package com.techelevator.shoppingcart;

public class ShoppingCart {

	//********************************************************************************************	
	// Class member data - attributes of an class object
	//********************************************************************************************
	
	private int totalNumberOfItems; // The number of items in the shopping cart. All shopping carts have 0 items by default.

	private double totalAmountOwed; // The total for the shopping cart. All shopping carts have 0.0 owed by default.
	
	/**************************************************************************************
	 * Constructors
	***************************************************************************************/
	
	public ShoppingCart() { // Default Constructor
	
	}
	
	//********************************************************************************************
	// Getters	- Allows users to see the values in an object
	//********************************************************************************************
	
	public int getTotalNumberOfItems() {
		return totalNumberOfItems;
	}

	public double getTotalAmountOwed() {
		return totalAmountOwed;
	}
	
	/**************************************************************************************
	 * Public Methods / Behaviors - Accessible to the public
	***************************************************************************************/
	
	public double getAveragePricePerItem() {
		if (totalNumberOfItems != 0)
			return totalAmountOwed / totalNumberOfItems;
		return 0.0;
	}
	
	public void addItems(int numberOfItems, double pricePerItem) {
			totalNumberOfItems = totalNumberOfItems + numberOfItems;
			totalAmountOwed = pricePerItem * numberOfItems;
	}
	public void empty()	{
		totalNumberOfItems = 0;
		totalAmountOwed = 0;
		
	}
}
	
	
	
	
	
	
	
	
	
	
	


