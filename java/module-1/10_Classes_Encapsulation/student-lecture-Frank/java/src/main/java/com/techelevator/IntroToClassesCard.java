package com.techelevator;

public class IntroToClassesCard {
	
	//*****************************************************************************
	// main() is the starting method of all applications
	//
	// The class that contains main() is the application
	//*****************************************************************************
	
	public static void main(String[] args) {
        
        /*
         *  This program will demonstrate several concepts presented in the Java cohort
		 *  in the topic Introduction to Classes 		
        */
		
		
		System.out.println("Executing: PlayingCard aCard = new PlayingCard();\n");
		
		PlayingCard aCard = new PlayingCard();   // Instantiate a default PlayingCard
		                                         // Default (0-arg) ctor is run
		
		aCard.showCard();                        // Use the PlayingCard object to run the ShowCard() method
		
		System.out.println("-----------------------------------------------------------------------------------");
		
		System.out.println("Executing: PlayingCard theCard = new PlayingCard(8,Spades,Green,true);\n");
		
		PlayingCard theCard = new PlayingCard(8,"Spades","Green",true);   // Instantiate a new PlayingCard 
		                                                                  // using the 4-arg ctor
		
		theCard.showCard();                       // Use the PlayingCard object to run the ShowCard() method
		
		System.out.println("-----------------------------------------------------------------------------------");
		
		System.out.println("Executing: PlayingCard myCard = new PlayingCard(1,Spades);\n");
		
		PlayingCard myCard = new PlayingCard(1,"Spades");                // Instantiate a new PlayingCard 
                                                                         // using the 2-arg ctor

		
        myCard.showCard();                       // Use the PlayingCard object to run the ShowCard() method

        System.out.println("-----------------------------------------------------------------------------------");
		
        System.out.println("myCard's value is: " + myCard.getValue());    // Use the PlayingCard method to retrieve 
		                                                                  //     the card value in the object
		
		System.out.println("-----------------------------------------------------------------------------------");
		
		// Flip the card - if it's face up it should be made face down and vice-versa
		// Using a member method of PlayingCard
		
		System.out.println("   Right now, Is the card face up? " + theCard.isShowing());
		theCard.flip();          // run the flip() method on a PlayingCard object
		System.out.println("After flip(), Is the card face up? " + theCard.isShowing());
		
		System.out.println("-----------------------------------------------------------------------------------");
		
		PlayingCard newCard1 = new PlayingCard(7, "Hearts");
		PlayingCard newCard2 = new PlayingCard(7, "Hearts");
		
		newCard1.showCard();
		System.out.println("-----------------------------------------------------------------------------------");
		newCard2.showCard();
		
		if (newCard1.equals(newCard2,"value")) {
			System.out.println("The card values are equal");
		}
		else {
			System.out.println("The card values are NOT equal"); // correct in this scenario because we are attempting to compare references
		}
		if (newCard1.equals(newCard2, "suit")) {
			System.out.println("The card suits are equal");
		}
		else {
			System.out.println("The card suits are NOT equal"); // correct in this scenario because we are attempting to compare references
		}
		System.out.println("-----------------------------------------------------------------------------------");
		
		if (newCard1.equals(newCard2, "both")) { // Run the .equals(PlayingCard)
			System.out.println("The cards value and suit are equal");
		}
		else {
			System.out.println("The cards values and suits are NOT equal"); // correct in this scenario because we are 
			// attempting to compare references	
		}
		if (newCard1.equals(8)) { //Check for PlayingCard == integer value
			System.out.println("The card is an 8 equal");
		}
		else {
			System.out.println("The card is NOT an 8 equal");
		}
		System.out.println("-----------------------------------------------------------------------------------");
		
	}
}
		 

