package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestPlayingCard {
	
	// Test the AmericanPlayingCard methods
	
	AmericanPlayingCard testCard = new AmericanPlayingCard(9, "Diamonds");

	
	@Test
	public void test_ctor_to_be_sure_it_initialized_correctly() {
		assertTrue("ctor did not initialize properly", testCard.equals(new AmericanPlayingCard(9, "Diamonds")));
		
		assertEquals("ctor did not set the correct value", 9, testCard.getValue());
		

	}
	
	@Test 
	public void test_the_Value() {
		assertEquals("ctor did not set the correct value", 9, testCard.getValue());
	}

}
