package com.techelevator;

import java.util.ArrayList;

public class BlackJackHand	 implements CardHand {   // BlackJackHand is a type-of CardHand (interface)

	private  int  numCardsInHand = 2;
	
	private ArrayList<PlayingCard> aHand;
	
	public BlackJackHand() {
		aHand = new ArrayList<PlayingCard>(numCardsInHand);
	}
	
	@Override // method required by the CardHand interface
	public ArrayList<PlayingCard> getHand() {
		return aHand;
	}

	@Override // method required by the CardHand interface
	public void addCard(PlayingCard aCard) {
		aHand.add(aCard);
		numCardsInHand++;
	}

	@Override // method required by the CardHand interface
	public void emptyHand() {
		aHand.clear();

	}

	@Override // method required by the CardHand interface
	public void show() {
		for (PlayingCard aCard : aHand)
		{
			System.out.println(aCard);
		}
			return;
	}
	
	public void dealHand(CardDeck aDeck) {
		for (int i=0; i < numCardsInHand; i++ ) {
			aHand.add(aDeck.dealCard());
		}	
	}
	
}
	
