package com.techelevator;

import org.junit.*;
import static org.junit.Assert.*;

public class KataPotterTest {
	
	
	@Test
	public void customer_bought_one_unique_book() {
		KataPotter test = new KataPotter();

		int[] books = {1,0,0,0,0};
		double expectedCost = 8;
		double getCost = test.getCost(books);
		
		assertEquals("Books did not add properly", expectedCost, getCost, 0.0001);
		
	}
	@Test
	public void customer_bought_two_unique_books() {
		KataPotter test = new KataPotter();

		int[] books = {1,1,0,0,0};
		double expectedCost = 15.20;
		double getCost = test.getCost(books);
		
		assertEquals("Books did not add properly", expectedCost, getCost, 0.0001);
		
	}
	
	@Test
	public void customer_bought_three_unique_books() {
		KataPotter test = new KataPotter();

		int[] books = {1,1,1,0,0};
		double expectedCost = 21.60;
		double getCost = test.getCost(books);
		
		assertEquals("Books did not add properly", expectedCost, getCost, 0.0001);
		
	}
	@Test
	public void customer_bought_four_unique_books() {
		KataPotter test = new KataPotter();

		int[] books = {1,1,1,1,0};
		double expectedCost = 25.60;
		double getCost = test.getCost(books);
		
		assertEquals("Books did not add properly", expectedCost, getCost, 0.0001);
		
	}
	@Test
	public void customer_bought_five_unique_books() {
		KataPotter test = new KataPotter();

		int[] books = {1,1,1,1,1};
		double expectedCost = 30.00;
		double getCost = test.getCost(books);
		
		assertEquals("Books did not add properly", expectedCost, getCost, 0.0001);
		
	}
	
	@Test
	public void customer_bought_five_different_books() {
		KataPotter test = new KataPotter();

		int[] books = {1,1,1,1,1};
		double expectedCost = 30.00;
		double getCost = test.getCost(books);
		
		assertEquals("Books did not add properly", expectedCost, getCost, 0.0001);
		
	}
	
	
	
	
}
