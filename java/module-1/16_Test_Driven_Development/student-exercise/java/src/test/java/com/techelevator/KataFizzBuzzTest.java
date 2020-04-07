package com.techelevator;

import org.junit.*;
import static org.junit.Assert.*;

public class KataFizzBuzzTest {
	
	
	
	@Test
	public void value_is_divisible_by_3() {
		KataFizzBuzz test = new KataFizzBuzz();
		int input = 3;
		String result = "Fizz";
		String fizzBuzz = test.fizzBuzz(input);
		assertEquals("FizzBuzz Kata did not initate properly. ", result, fizzBuzz);
	
	}
	
	@Test
	public void value_is_divisible_by_5() {
		KataFizzBuzz test = new KataFizzBuzz();
		int input = 5;
		String result = "Buzz";
		String fizzBuzz = test.fizzBuzz(input);
		assertEquals("FizzBuzz Kata did not initate properly. ", result, fizzBuzz);

	}
	
	@Test
	public void value_is_divisible_by_3_and_5() {
		KataFizzBuzz test = new KataFizzBuzz();
		int input = 15;
		String result = "FizzBuzz";
		String fizzBuzz = test.fizzBuzz(input);
		assertEquals("FizzBuzz Kata did not initate properly. ", result, fizzBuzz);

	}
	
	@Test
	public void value_is_NOT_divisible_by_either_but_inside_string() {
		KataFizzBuzz test = new KataFizzBuzz();
		int input = 22;
		String result = "22";
		String fizzBuzz = test.fizzBuzz(input);
		assertEquals("FizzBuzz Kata did not initate properly. ", result, fizzBuzz);

	}
	
	@Test
	public void value_is_NOT_inside_range() {
		KataFizzBuzz test = new KataFizzBuzz();
		int input = 0;
		String result = "";
		String fizzBuzz = test.fizzBuzz(input);
		assertEquals("FizzBuzz Kata did not initate properly. ", result, fizzBuzz);

	}
	
	@Test
	public void value_is_divisible_by_3_or_contains_3() {
		KataFizzBuzz test = new KataFizzBuzz();
		int input = 3;
		String result = "Fizz";
		String fizzBuzz = test.fizzBuzz(input);
		assertEquals("FizzBuzz Kata did not initate properly. ", result, fizzBuzz);

	}
	
	@Test
	public void value_is_divisible_by_3_and_contains_3() {
		KataFizzBuzz test = new KataFizzBuzz();
		int input = 13;
		String result = "Fizz";
		String fizzBuzz = test.fizzBuzz(input);
		assertEquals("FizzBuzz Kata did not initate properly. ", result, fizzBuzz);

	}
	
	@Test
	public void value_is_divisible_by_5_or_contains_5() {
		KataFizzBuzz test = new KataFizzBuzz();
		int input = 5;
		String result = "Buzz";
		String fizzBuzz = test.fizzBuzz(input);
		assertEquals("FizzBuzz Kata did not initate properly. ", result, fizzBuzz);

	}
	
	@Test
	public void value_is_divisible_by_5_and_contains_5() {
		KataFizzBuzz test = new KataFizzBuzz();
		int input = 35;
		String result = "FizzBuzz";
		String fizzBuzz = test.fizzBuzz(input);
		assertEquals("FizzBuzz Kata did not initate properly. ", result, fizzBuzz);

	}
	
	@Test
	public void value_is_divisible_by_3_and_contains_5() {
		KataFizzBuzz test = new KataFizzBuzz();
		int input = 51;
		String result = "Buzz";
		String fizzBuzz = test.fizzBuzz(input);
		assertEquals("FizzBuzz Kata did not initate properly. ", result, fizzBuzz);

	}
	@Test
	public void value_is_divisible_by_5_and_contains_3() {
		KataFizzBuzz test = new KataFizzBuzz();
		int input = 53;
		String result = "FizzBuzz";
		String fizzBuzz = test.fizzBuzz(input);
		assertEquals("FizzBuzz Kata did not initate properly. ", result, fizzBuzz);

	}
	
	
	
	
}	
