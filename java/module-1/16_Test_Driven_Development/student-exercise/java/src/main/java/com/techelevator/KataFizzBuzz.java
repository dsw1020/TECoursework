package com.techelevator;

public class KataFizzBuzz {

	public String fizzBuzz (int num) {
		if (num < 1 || num > 100)
			return "";
	
		else if (num %3 == 0 && num %5 == 0 || Integer.toString(num).contains("3") && Integer.toString(num).contains("5")) {
			return "FizzBuzz";
			
		}
		else if (num %5 == 0 || Integer.toString(num).contains("5")) {
			return "Buzz";
		}
		else if (num %3 == 0 || Integer.toString(num).contains("3")) {
			return "Fizz";
		}
		else {
			return Integer.toString(num);
		}
	
	
	}

}
