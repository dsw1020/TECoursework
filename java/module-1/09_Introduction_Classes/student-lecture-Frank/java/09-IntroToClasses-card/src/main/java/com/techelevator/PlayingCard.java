package com.techelevator;

public class PlayingCard {
/**************************************************************************************
 * Attributes/Data item 
 **************************************************************************************/
	
	// Only members if the class have access to the data
	private String suit;
	private int    value; // A = 1, J = 11, Q = 12, K = 13, Joker = 0
	private String color;
	private String shape;
	private String backColor;
	private boolean isFaceUp;
	
	


/**************************************************************************************
 * Methods / Behaviors
***************************************************************************************/
	
	// A constructor(ctor) is a method used to initialize an object
	// When an object is instantiated (new classname) a constructor is run to initialize it
	// If no constructors exist, Java runs a default constructor that does nothing 
	//					defaults 0 for numerics null for objects
	//
	// a ctor has the same name as the class and has no return value, not even void
	//
	
	// a default ctor for PlayingCard - initialize a default card
	//		set atributes to default values
	public PlayingCard() {
		
		value = 0;	//Joker
		suit = "Hearts"; 
		setColor();	// Because we are in the class, no object is needed to run the method in the ctor
		shape = "rectangle";
		backColor = "blue";
		isFaceUp = true;
		
	}

	// a ctor to allow the user to specify some attributes
	// "this" is required when parameters names are the same as data member names
	// "this" represents the current object (to the left of dot for moth methods)
	public PlayingCard(int value, String suit) {
		this.value = value;
		this.suit = suit;
		setColor(); 
		shape = "rectangle";	//Keeping the shape, backColor, and position fixed so they are unchangeable in this case
		backColor = "blue";
		isFaceUp = true;
		
	
	}
	public String getSuit() {
		return suit;
	}

	public void setSuit(String suit) {
		this.suit = suit;
	}

	public boolean isFaceUp() {
		return isFaceUp;
	}

	public void setFaceUp(boolean isFaceUp) {
		this.isFaceUp = isFaceUp;
	}

	public int getValue() {
		return value;
	}

	public String getColor() {
		return color;
	}

	public String getShape() {
		return shape;
	}

	public String getBackColor() {
		return backColor;
	}

	/**************************************************************************************
	 * Private Methods / Behaviors - Untouchable to the public
	***************************************************************************************/
	private void setColor() {	// private means only members of the class can use it 
		if (this.suit.equals("Hearts") || suit.equals("Diamonds")) {
			this.color = "Red";
		}
		else {
			color = "Black";
		}
	}
	
public String toString() {	//defined method inside the PlayingCard Class
	return "Suit = " + suit + " Value = " + value + " Color = " + color;
	}
}
	
	
	

