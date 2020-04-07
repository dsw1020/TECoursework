package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringBitsTest {

	@Test
	public void test_Hello() {
		
		StringBits testBits = new StringBits();
		String str = "Hello";
		String expectedString = "Hlo";
		String method = testBits.getBits(str);
		assertEquals("StringBits did not execute property", expectedString, method);
	}

	
	@Test
	public void test_Hi() {
		
		StringBits testBits = new StringBits();
		String str = "Hi";
		String expectedString = "H";
		String method = testBits.getBits(str);
		assertEquals("StringBits did not execute property", expectedString, method);
	}
	
	@Test
	public void test_Heeololeo() {
		
		StringBits testBits = new StringBits();
		String str = "Heeololeo";
		String expectedString = "Hello";
		String method = testBits.getBits(str);
		assertEquals("StringBits did not execute property", expectedString, method);
	}
	
	
	
	
}
