package com.techelevator;

public class FruitTree {
	
	//********************************************************************************************	
	// Class member data - attributes of an class object
	//********************************************************************************************
	
	private String typeOfFruit;
	private int piecesOfFruitLeft;
	
	
	//********************************************************************************************
	// Constructors for the class
	//*********************************************************************************************	
	
	public FruitTree(String typeOfFruit, int startingPiecesOfFruit) {
		this.typeOfFruit = typeOfFruit;
		this.piecesOfFruitLeft = startingPiecesOfFruit;
	}

	
	//********************************************************************************************
	// Getters	- Allows users to see the values in an object
	//********************************************************************************************
	
	public String getTypeOfFruit() {
		return typeOfFruit;
	}
	public int getPiecesOfFruitLeft() {
		return piecesOfFruitLeft;
	}
	
	
	//********************************************************************************************
	// methods - Perform processing 
	//********************************************************************************************
	
	public boolean pickFruit(int numberOfPiecesToRemove) {
		if (piecesOfFruitLeft >= numberOfPiecesToRemove) {
			piecesOfFruitLeft -= numberOfPiecesToRemove;
			return true;
		} else {
			return false;
		}

	}
}

	
	
	
	
	
	
	


