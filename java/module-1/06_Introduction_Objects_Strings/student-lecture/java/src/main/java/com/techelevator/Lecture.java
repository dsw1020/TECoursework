package com.techelevator;

import java.util.Scanner;

public class Lecture {

	public static void main(String[] args) {

		System.out.println("************************************");
		System.out.println("****** MAKING A STRING OBJECT ******");
		System.out.println("************************************");

		/* The String class gets special treatment in the Java language.  One
		 * example of this is that there is a literal representation of a
		 * String (i.e. characters appearing between two double quotes.  This
		 * is not the case for most classes */

		/* create an new instance of String using a literal */

		String classmate = "Jake";	// Not an array
		
		char[] anotherPerson = {'G','a','b','e'};	// Not a String 
		
		System.out.println("classmate is: " + classmate);	// + with a String means concatenate
		
		System.out.println("First char is: " + classmate.charAt(0)); // get the character at index 0 - the first character
		
		for (int i=0; i < classmate.length(); i++) {	// walk through the String one character at a time
			System.out.println(classmate.charAt(i));
		}
		

		
		
		System.out.println();
		System.out.println("******************************");
		System.out.println("****** MEMBER METHODS ******");
		System.out.println("******************************");
		System.out.println();


		/* Other commonly used methods:
		 *
		 * endsWith(String) 	- return true if the String object ends with the String given 
		 * startsWith(String)	- return true if the String object starts with the String given 
		 * indexOf(String) 		- return the index of the String given in the String
		 * lastIndexOf(string) 	- return the index of the last occurrence String given in the String
		 * length 				- return the number of characters in the String
		 * substring 			- return the middle or part of a String
		 * toLowerCase 			- return the String converted to all lower case
		 * toUpperCase			- return the String converted to all upper case
		 * trim() 				- Remove spaces 
		 */
		
		System.out.println("--------------------------------");
		String aString = "We like Java";
		System.out.println("aString contains:" + aString);
		
		if (aString.endsWith("va")) {
			System.out.println("It ends with va");
		}
		else {
			System.out.println("It DOES NOT ends with va");
			
		}

		if (aString.startsWith("We like")) {
			System.out.println("It starts with We like");
		}
		else {
			System.out.println("It DOES NOT start with We like");
			
		}
		
		if (aString.toUpperCase().startsWith("WE")) {
			System.out.println("It starts with WE");
		}
		else {
			System.out.println("It DOES NOT start with WE");
			
		}
		
		System.out.println("The first occurance of ' ' is: " + aString.indexOf(" "));
		
		System.out.println("--------------------------------");
		
		String firstFiveChars = aString.substring(0,5);	// Give us the chars between index 0 and 5
														// does not include the character at the end of index
		System.out.println("1st 5 chars are: " + firstFiveChars);
		System.out.println("--------------------------------");
		
		String lastThreeChars = aString.substring(aString.length()-3);	// method as argument
		
		System.out.println("Last 3 chars are: " + lastThreeChars);
		
		System.out.println("--------------------------------");
		
		String silence = "   The class was very quiet one day   ";
		
		System.out.println("silence contains: " + silence + '*' + '\n');
		
		System.out.println("trim(silence) - "+ silence.trim() + "!");	// Remove both the leading and trailing spaces
		
		
		silence = "-----The class was very quiet one day   ";
		
		System.out.println("silence contains: " + silence + '*' + '\n');
		
		System.out.println("trim(-) - "+ silence.trim() + "!");	// Remove both the leading and trailing spaces
		
		
		
		
		
		System.out.println("--------------------------------------------");
		System.out.println();
		System.out.println("**********************");
		System.out.println("****** EQUALITY ******");
		System.out.println("**********************");
		System.out.println();


		String hello1 = "Hello";	// The same memeory location will be used for both
		String hello2 = "Hello";	// Since the same literal is used to initialize them.
		
		
		/* Double equals will compare to see if the two variables, hello1 and
		 * hello2 point to the same object in memory. Are they the same object? */
		if (hello1 == hello2) {
			System.out.println("They are equal!");
		} else {
			System.out.println(hello1 + " is not equal to " + hello2);
		}

		String hello3 = hello1;	// Make the reference for hello3 be equal to reference for hello1
		if (hello1 == hello3) {
			System.out.println("hello1 is the same reference as hello3");
		}

		/* So, to compare the values of two objects, we need to use the equals method.
		 * Every object type has an equals method */
		if (hello1.equals(hello2)) {
			System.out.println("They are equal!");
		} else {
			System.out.println(hello1 + " is not equal to " + hello2);
		}
		System.out.println("--------------------------------------------");
		
		
		Scanner kybd = new Scanner(System.in); // Define an object for the keyboard
		
		System.out.println("Please enter an line");
		String aLine = kybd.nextLine(); 	   // gets a line from the keyboard
		
		System.out.println("You entered: " + aLine);
		System.out.println("	 hello1: " + hello1);
		
		if (aLine == hello1) {
		System.out.println("They are equal!");
		} else {
		
		System.out.println(hello1 + " is not equal to " + hello2);
		
		if (aLine.contentEquals(hello1)) {
		System.out.println("They are equal!");
		} else {
		System.out.println(hello1 + " is not equal to " + hello2);
		
		}
		
		hello1 = "Good Bye";
		System.out.println("     hello1: " + hello1);
		System.out.println("     hello2: " + hello2);
			
		}	
			
		}
	}

