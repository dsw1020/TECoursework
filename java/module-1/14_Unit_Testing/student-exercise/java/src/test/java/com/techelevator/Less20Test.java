package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Test;

public class Less20Test {
	
	
	@Test
	public void test_is_less_that_20() {
		//arrange
		Less20 less20Test = new Less20();
		//act
		boolean result = less20Test.isLessThanMultipleOf20(17);
		//assert
		assertEquals("Number is not one or two less than a multiple of 20", false, result);
		//act
		result = less20Test.isLessThanMultipleOf20(18);
		//assert
		assertEquals("Number is not one or two less than a multiple of 20", true, result);
		//act
		result = less20Test.isLessThanMultipleOf20(19);
		//assert
		assertEquals("Number is not one or two less than a multiple of 20", true, result);
		//act
		result = less20Test.isLessThanMultipleOf20(20);
		//assert
		assertEquals("Number is not one or two less than a multiple of 20", false, result);
	}
	
	@Test
	public void test_is_greater_that_20() {
		//arrange
		Less20 less20Test = new Less20();
		//act
		boolean result = less20Test.isLessThanMultipleOf20(21);
		//assert
		assertEquals("Number is not one or two less than a multiple of 20", false, result);
		//act
		result = less20Test.isLessThanMultipleOf20(22);
		//assert
		assertEquals("Number is not one or two less than a multiple of 20", true, result);
		//act
		result = less20Test.isLessThanMultipleOf20(23);
		//assert
		assertEquals("Number is not one or two less than a multiple of 20", true, result);
		//act
		
	}

}
