package com.techelevator;

import java.util.ArrayList;

// An interface defines which methods MUST be overridden to be a valid type of this interface
//
// Behaviors require to be a type of the interface

// An interface cannot have any data members EXCEPT static final data (constants defined once)

// An interface may only contain method signatures - no body/code for the method

public interface CardHand {
	
	public ArrayList<PlayingCard> getHand();

	public void addCard(PlayingCard aCard);
	
	public void emptyHand();

	public void show();

}
