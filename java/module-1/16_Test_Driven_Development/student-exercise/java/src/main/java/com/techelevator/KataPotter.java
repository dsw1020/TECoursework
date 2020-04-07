package com.techelevator;

public class KataPotter {
	
	public double getCost(int[] books) {
		
		
		
		double totalCost = 0.0;
		double totalBooks = 0.0;

		for (int aBook : books) {
			totalBooks += aBook;
		}
		if (totalBooks == 1) {
			totalCost = 8;
		}
		if (totalBooks == 2) {
			totalCost = 15.20;
		}
		if (totalBooks == 3) {
			totalCost = 21.60;
		}
		if (totalBooks == 4) {
			totalCost = 25.60;
		}
		if (totalBooks == 5) {
			totalCost = 30;
		}
		return totalCost;

	}

}
