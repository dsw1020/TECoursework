package com.techelevator;

public class IntroToClassesCard { 
	
	public static void main(String[] args) {
        
        /*
         *  This program will demonstrate several concepts presented in the Java cohort
		 *  in the topic Introduction to Classes 		
        */
		PlayingCard aCard = new PlayingCard();	// instantiate a PlayingCard 
	System.out.println("aCard" + aCard);
	
	// Define a Ace of Spades which is Black
	
	PlayingCard anotherCard = new PlayingCard(1, "Spades");
	System.out.println("anotherCard: " + anotherCard);
	
	
	System.out.println("The card value is: " + anotherCard.getValue());
	System.out.println("The card suit is: " + anotherCard.getSuit());
	System.out.println("The card color is: " + anotherCard.getColor());
	System.out.println("The card face is: " + anotherCard.isFaceUp());  //.get is lower case and the object is uppercase
		}
}
		 

