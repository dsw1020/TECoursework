package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Test;

public class Lucky13Test {
	
	@Test
	public void test_for_no_1_or_3_in_array() {
		
		Lucky13 lucky13Test = new Lucky13();
		boolean nums = lucky13Test.getLucky(new int[] {0,2,4});
		assertEquals("Expected true for GetLucky([0,2,4])", true, nums);
	}
	@Test
	public void test_for_no_1_in_array() {
		
		Lucky13 lucky13Test = new Lucky13();
		boolean nums = lucky13Test.getLucky(new int[] {0,1,4});
		assertEquals("Expected true for GetLucky([0,2,4])", false, nums);
	}
	
	@Test
	public void test_for_no_3_in_array() {
		
		Lucky13 lucky13Test = new Lucky13();
		boolean nums = lucky13Test.getLucky(new int[] {0,2,3});
		assertEquals("Expected true for GetLucky([0,2,4])", false, nums);
	}
	
	
}
