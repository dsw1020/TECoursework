package com.techelevator;

import org.junit.*;
import static org.junit.Assert.*;

public class RomanNumeral_Lecture_Test {
/************************************************************************************************************
 *  Unit Tests for Roman Numeral Class
 ************************************************************************************************************/ 

/************************************************************************************************************
 * V1.0 - Test for single digit Roman Numeral conversion
 ************************************************************************************************************/ 

	@Test
	public void Convert_To_Single_Digit_Roman_Numeral() {
		assertEquals("Decimal value    1 not converted to I correctly", "I", new RomanNumeral_Lecture(1).getRomanNumeral());
		assertEquals("Decimal value    5 not converted to V correctly", "V", new RomanNumeral_Lecture(5).getRomanNumeral());
		assertEquals("Decimal value   10 not converted to X correctly", "X", new RomanNumeral_Lecture(10).getRomanNumeral());
		assertEquals("Decimal value   50 not converted to L correctly", "L", new RomanNumeral_Lecture(50).getRomanNumeral());
		assertEquals("Decimal value  100 not converted to C correctly", "C", new RomanNumeral_Lecture(100).getRomanNumeral());
		assertEquals("Decimal value  500 not converted to D correctly", "D", new RomanNumeral_Lecture(500).getRomanNumeral());
		assertEquals("Decimal value 1000 not converted to M correctly", "M", new RomanNumeral_Lecture(1000).getRomanNumeral());
	}
/************************************************************************************************************
 *  V2.0 -Test for multi digit Roman Numeral conversion - no edge cases (IV, IX, XC, etc)
 ************************************************************************************************************/ 
	@Test
	public void Convert_Multi_Digit_Roman_Numeral_Value() {
		assertEquals("Decimal value  6 not converted to VI    correctly", "VI",   new RomanNumeral_Lecture(6).getRomanNumeral());
		assertEquals("Decimal value  7 not converted to VII   correctly", "VII",  new RomanNumeral_Lecture(7).getRomanNumeral());
		assertEquals("Decimal value  8 not converted to VIII  correctly", "VIII", new RomanNumeral_Lecture(8).getRomanNumeral());
		assertEquals("Decimal value 11 not converted to XI    correctly", "XI",   new RomanNumeral_Lecture(11).getRomanNumeral());
		assertEquals("Decimal value 12 not converted to XII   correctly", "XII",  new RomanNumeral_Lecture(12).getRomanNumeral());
		assertEquals("Decimal value 13 not converted to XIII  correctly", "XIII", new RomanNumeral_Lecture(13).getRomanNumeral());
		assertEquals("Decimal value 51 not converted to LI    correctly", "LI",   new RomanNumeral_Lecture(51).getRomanNumeral());
		assertEquals("Decimal value 52 not converted to LII   correctly", "LII",  new RomanNumeral_Lecture(52).getRomanNumeral());
		assertEquals("Decimal value 53 not converted to LIII  correctly", "LIII", new RomanNumeral_Lecture(53).getRomanNumeral());
		assertEquals("Decimal value 99 not converted to XCIX  correctly", "XCIX", new RomanNumeral_Lecture(99).getRomanNumeral());	
		assertEquals("Decimal value 40 not converted to XL    correctly", "XL",   new RomanNumeral_Lecture(40).getRomanNumeral());	
		
	}
/************************************************************************************************************
 *  V3.0 - Test for multiples of 10, 100, 1000 - no edge cases (XL, XC, CD, CM)
 ************************************************************************************************************/ 
	@Test
	public void Convert_Multiples_of_10_to_RomanNumerals() {
		assertEquals("Decimal value   10 not converted to   X correctly",   "X", new RomanNumeral_Lecture( 10).getRomanNumeral());
		assertEquals("Decimal value   20 not converted to  XX correctly",  "XX", new RomanNumeral_Lecture( 20).getRomanNumeral());
		assertEquals("Decimal value   30 not converted to  XX correctly", "XXX", new RomanNumeral_Lecture( 30).getRomanNumeral());
		assertEquals("Decimal value   60 not converted to  LX correctly",  "LX", new RomanNumeral_Lecture( 60).getRomanNumeral());
		assertEquals("Decimal value  110 not converted to  CX correctly",  "CX", new RomanNumeral_Lecture(110).getRomanNumeral());
		assertEquals("Decimal value  250 not converted to CCL correctly", "CCL", new RomanNumeral_Lecture(250).getRomanNumeral());
		assertEquals("Decimal value  510 not converted to  DX correctly",  "DX", new RomanNumeral_Lecture(510).getRomanNumeral());
		assertEquals("Decimal value  550 not converted to  DL correctly",  "DL", new RomanNumeral_Lecture(550).getRomanNumeral());
		assertEquals("Decimal value 1010 not converted to  DL correctly",  "DL", new RomanNumeral_Lecture(550).getRomanNumeral());
		assertEquals("Decimal value 1300 not converted to  DL correctly",  "DL", new RomanNumeral_Lecture(550).getRomanNumeral());
	
	}
/************************************************************************************************************
 * V4.0 - Test for multi digit Roman Numeral conversion - edge cases (IV, IX, XL, XC, etc)
 ************************************************************************************************************/ 
	@Test
	public void Convert_Multi_Digit_Roman_Numeral_Value_Edge_Cases() {
		assertEquals("Decimal value    4 not converted to IV      correctly", "IV",      new RomanNumeral_Lecture(   4).getRomanNumeral());	
		assertEquals("Decimal value    9 not converted to IX      correctly", "IX",      new RomanNumeral_Lecture(   9).getRomanNumeral());		
		assertEquals("Decimal value   40 not converted to XL      correctly", "XL",      new RomanNumeral_Lecture(  40).getRomanNumeral());
		assertEquals("Decimal value   90 not converted to XC      correctly", "XC",      new RomanNumeral_Lecture(  90).getRomanNumeral());
		assertEquals("Decimal value  900 not converted to CM      correctly", "CM",      new RomanNumeral_Lecture( 900).getRomanNumeral());
		assertEquals("Decimal value   99 not converted to XCIX    correctly", "XCIX",    new RomanNumeral_Lecture(  99).getRomanNumeral());	
		assertEquals("Decimal value 1999 not converted to MCMXCIX correctly", "MCMXCIX", new RomanNumeral_Lecture(1999).getRomanNumeral());	
		assertEquals("Decimal value 2019 not converted to MMXIX   correctly", "MMXIX",   new RomanNumeral_Lecture(2019).getRomanNumeral());	
		
/************************************************************************************************************
 *  v5.0 - Test to be sure ctor did not change the decimal value passed to it
 ************************************************************************************************************/ 

		assertEquals("Decimal value changed by ctor", 40,   new RomanNumeral_Lecture(40).getDecimalValue());
		assertEquals("Decimal value changed by ctor", 2019, new RomanNumeral_Lecture(2019).getDecimalValue());

}
}



	

