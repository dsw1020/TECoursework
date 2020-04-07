package com.techelevator;

public class PlayingCard {
	//********************************************************************************************	
    // Class member data - attributes of an class object
	//********************************************************************************************
	private String  suit;
	private int     value;   // j=11, q=12, k=13
	private String  color;
	private boolean showing;
	static private String  backDesign = "BicycleBlue";
	static private String  shape = "Rectangle";

//********************************************************************************************
// Constructors for the class
//
// Constructors have the same name as the class have no return type - NOT EVEN void	
//
// Constructors are frequently overloaded (same name, same behavior,  different parameters)
//              overloading ctors allows users flexibility in defining objects of the class
//*********************************************************************************************	

	
	// default ctor - has no parameters
	
	public PlayingCard() {  
		value   = 1;
		suit    = "Clubs";
		showing = false;
		backDesign = "BicycleBlue";
		determineColor();         // Use class member method to set the color based on the suit
		shape   = "Rectangle";			
	}
	
	// 4-arg ctor
	public PlayingCard(int value, String suit, String color, boolean showing) {
		this.value   = value;
		this.suit    = suit;
		this.showing = showing;
		this.shape   = "Rectangle";
		this.backDesign = "BicycleBlue";
		determineColor();         // Use class member method to set the color based on the suit
		                          //     ignore color sent is as a parameter by user
	}
	
	// 2-arg ctor
		public PlayingCard(int value, String suit) {
			this.value      = value;
			this.suit       = suit;
			this.showing    = false;
			determineColor();         // Use class member method to set the color based on the suit
			this.shape      = "Rectangle";
			this.backDesign = "BicycleBlue";
		}
//********************************************************************************************
// Getters	- Allow users to see the values in an object
//********************************************************************************************

	public String getSuit() {
		return suit;
	}
	
	public int getValue() {
		return value;
	}
	
	public String getColor() {
		return color;
	}
	
	public boolean isShowing() {
		return showing;
	}
	
	public String getShape() {
		return shape;
	}
	public String getBackDesign() {
		return backDesign;
	}
	
//********************************************************************************************
// Setters	-  Allow users to change values
//********************************************************************************************

	public void setSuit(String suit) {
		this.suit = suit;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
	
	public void setColor(String color) { // Ignore the color the user sends
		determineColor();                // Use class member method to set the color based on the suit
	}
	
	public void setShowing(boolean showing) {
		this.showing = showing;
	}
	
	
	
//********************************************************************************************
// Additional member methods - Perform processing beyond getting and setting
//********************************************************************************************

	// Flip card from showing to not showing
	
	public void flip() {
		showing = !showing;  // Reverse the current value of showing true to false; false to true 
	}
	
	// Determine card color based on suit
	// So we control what color is set and can be sure it is correct for the suit
	// private so only members of the class may use it
	
	private void determineColor() { // set the cardColor based on the cardSuit
		if (suit.equals("Spades") 
		 || suit.equals("Clubs")
		 || suit.equals("Joker")) {
			color = "Black";
		} else {
			color = "Red";
		}
	}	
	
	// Display the attributes of a PlayingCard 
	public void showCard() {
		System.out.println("      Suit: " + suit);
		System.out.println("     Value: " + value);
		System.out.println("     Color: " + color);
		System.out.println("   Showing: " + showing);
		System.out.println("backDesign: " + backDesign);
		System.out.println("     Shape: " + shape);
//		System.out.println("-----------------------------------------------------------------------------------");
	}

//********************************************************************************************
// Overrides - Define new behavior that is different than ancestor behavior
//             Overriding methods have same name, same parameters, but different behavior	
//********************************************************************************************
//
//  @word - Annotation - request/direction for the compiler
//
// Change/override Object class toString() 

	@Override             // Ask the compiler to verify this is a proper override
	public String toString() {
		return "PlayingCard [suit=" + suit + ", value=" + value + ", color=" + color + ", showing=" + showing
				+ ", backDesign=" + backDesign + ", shape=" + shape + "]";
	}
// equals require an option to tell us what to compare	
// "value' - compare just the value
// "suit"  - compare just the suit
// "both"  - compare value and the suit
	
	public boolean equals(PlayingCard otherCard, String option) {
		
		if (option.equals("value")) {
			return this.value == otherCard.value;  // Compare the current object value to the other card value
			}
		if (option.equals("suit")) {
			return this.suit.equals(otherCard.suit);  // Compare the current object suit to the other card suit
			}
		if (option.equals("both")) {
			return this.suit.equals(otherCard.suit)  // Compare the current object suit to the other card suit
			    && this.value == otherCard.value;    // and the current object value to the other card value
			}
		return false;                                // If no valid option sent - return false
	}
	
	public boolean equals(PlayingCard otherCard) {   // default .equals for PlayingCard - compare
		return this.suit.equals(otherCard.suit)      // Compare the current object suit to the other card suit
			    && this.value == otherCard.value;    // and the current object value to the other card value
			}
	
	public boolean equals(int aValue) {   // default .equals for PlayingCard - compare
	    return this.value == aValue;
}
}

