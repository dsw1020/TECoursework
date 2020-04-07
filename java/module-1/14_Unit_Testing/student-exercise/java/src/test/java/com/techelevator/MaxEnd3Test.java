package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Test;

public class MaxEnd3Test {
	
	MaxEnd3 makeArray = new MaxEnd3();

	@Test
	public void test_for_array() {
		int [] numberArray = new int[] {1,2,3};
		int [] expectedArray = new int [] {3,3,3};
		int [] makeArrays = makeArray.makeArray(numberArray);
		assertArrayEquals("makeArray method did not return the expected array", expectedArray, numberArray);
	}

	@Test
	public void test_for_array_high() {
		int [] numberArray = new int[] {11,5,9};
		int [] expectedArray = new int [] {11,11,11};
		int [] test = makeArray.makeArray(numberArray);
		assertArrayEquals("makeArray method did not return the expected array", expectedArray, numberArray);
	}
	@Test
	public void test_for_array_inside_out() {
		int [] numberArray = new int[] {2,11,3};
		int [] expectedArray = new int [] {3,3,3};
		int [] test = makeArray.makeArray(numberArray);
		assertArrayEquals("makeArray method did not return the expected array", expectedArray, numberArray);
	}
	
	
	
}
