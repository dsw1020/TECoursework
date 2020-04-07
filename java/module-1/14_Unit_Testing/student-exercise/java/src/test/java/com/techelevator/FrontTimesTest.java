package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Test;

public class FrontTimesTest {

	@Test
	public void test_for_2() {
		FrontTimes newFront = new FrontTimes();
		String str = "Chocolate";
		int num = 2;
		String testFront = newFront.generateString(str, num);
		assertEquals("FrontTimes did not return expected result", "ChoCho", testFront);
	}
	
	@Test
	public void test_for_3() {
		FrontTimes newFront = new FrontTimes();
		String str = "Chocolate";
		int num = 3;
		String testFront = newFront.generateString(str, num);
		assertEquals("FrontTimes did not return expected result", "ChoChoCho", testFront);
	}
	
	@Test
	public void test_for_letter_different_string() {
		FrontTimes newFront = new FrontTimes();
		String str = "Abc";
		int num = 3;
		String testFront = newFront.generateString(str, num);
		assertEquals("FrontTimes did not return expected result", "AbcAbcAbc", testFront);
	}
	
	@Test
	public void test_for_letter_less() {
		FrontTimes newFront = new FrontTimes();
		String str = "Ab";
		int num = 3;
		String testFront = newFront.generateString(str, num);
		assertEquals("FrontTimes did not return expected result", "AbAbAb", testFront);
	}
	
	
	

}
