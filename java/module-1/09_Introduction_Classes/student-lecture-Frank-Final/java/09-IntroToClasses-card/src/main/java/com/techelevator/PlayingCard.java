package com.techelevator;

public class PlayingCard {
/******************************************************************
 * Attributes / Data item 
 ******************************************************************/
	
	private String  suit;
	private int     value; // A=1, J=11, Q=12, K=13, Joker=0
	private String  color;
	private String  shape;
	private String  backColor;
	private boolean isFaceUp;
	
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public boolean isFaceUp() {
		return isFaceUp;
	}

	public void setFaceUp(boolean isFaceUp) {
		this.isFaceUp = isFaceUp;
	}

	public String getSuit() {
		return suit;
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

	/******************************************************************
	 * Methods / Behaviors
	 ******************************************************************/	
	
	// A constructor (ctor) is a method used to initialize an object
	// When an object is instantiated (new classname) a constructor is run to initialize it
	// If no constructors exist, Java runs a default constructor that does nothing
	//               defaults 0 for numerics null for objects
	//
	// a ctor has the same name as the class and has no return value, not even void
	// 
	
	// a default ctor for PlayingCard - initialize a default card
	//    set attributes to default values
	
	public PlayingCard() {
		value = 0; // Joker
		suit  = "Hearts";
		setColor();   // No object is needed to run teh method because we are in the ctor
		shape = "rectangle";
		backColor = "blue";
		isFaceUp = true;
	}
	
// a ctor to allow the user specify some attributes
// "this" is required when parameters names are the same as data member names
// "this" represents the current object (to left of dot for most methods)
	
	public PlayingCard(int value, String suit) {
		this.value = value;   // this represents the object of the method
		this.suit  = suit;
		this.setColor();
		this.shape = "rectangle";
		this.backColor = "blue";
		this.isFaceUp = true;
	}
	
	private void setColor() {  // private means only members of the class can use it
		if (this.suit.equals("Hearts") || suit.equals("Diamonds")) {
			this.color = "Red";
		}
		else {
			color = "Black";
		}
	}
	
	public String toString() { 
		return "Suit=" + suit + " Value="+value + " Çolor=" +color;
	}
	
}
