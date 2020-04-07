package com.techelevator;

import java.util.ArrayList;


public interface CardHand {		// If you want to be a CradHand you must implement these methods/behaviors
	
	public ArrayList<PlayingCard> getHand();	// Return the cards in the hand as an ArrayList

	public void addCard(PlayingCard aCard);		// Allow a card to be added to the Hand
	
	public void emptyHand();					// Must allow user to empty/remove all cards from the Hand

	public void show();							// Must be able to show the card in the Hand

}
