package com.techelevator;

public class Exercises {

	/*
	 * Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".
	 * helloName("Bob") → "Hello Bob!" helloName("Alice") → "Hello Alice!"
	 * helloName("X") → "Hello X!"
	 */
	public String helloName(String name) {
		return "Hello " + name + "!";
	}

// Add the words in the beginning of the term and concatenate the string in the return, followed by an exclamation mark.
	/*
	 * Given two strings, a and b, return the result of putting them together in the
	 * order abba, e.g. "Hi" and "Bye" returns "HiByeByeHi". makeAbba("Hi", "Bye") →
	 * "HiByeByeHi" makeAbba("Yo", "Alice") → "YoAliceAliceYo" makeAbba("What",
	 * "Up") → "WhatUpUpWhat"
	 */
	public String makeAbba(String a, String b) { // Combine all the variables into one string and return
		return a + b + b + a;

	}
// take each string and return them concatenated in the order necessary to reproduce the requested result.

	/*
	 * The web is built with HTML strings like "<i>Yay</i>" which draws Yay as
	 * italic text. In this example, the "i" tag makes <i> and </i> which surround
	 * the word "Yay". Given tag and word strings, create the HTML string with tags
	 * around the word, e.g. "<i>Yay</i>". makeTags("i", "Yay") → "<i>Yay</i>"
	 * makeTags("i", "Hello") → "<i>Hello</i>" makeTags("cite", "Yay") →
	 * "<cite>Yay</cite>"
	 */
	public String makeTags(String tag, String word) {
		return ("<" + tag + ">" + word + "</" + tag + ">"); // Make sure to break down the whole processes into
															// individual pieces

	}
//return the tags interspliced with each of the necessary strings. 

	/*
	 * Given an "out" string length 4, such as "<<>>", and a word, return a new
	 * string where the word is in the middle of the out string, e.g. "<<word>>".
	 * Note: use str.substring(i, j) to extract the String starting at index i and
	 * going up to but not including index j. makeOutWord("<<>>", "Yay") → "<<Yay>>"
	 * makeOutWord("<<>>", "WooHoo") → "<<WooHoo>>" makeOutWord("[[]]", "word") →
	 * "[[word]]"
	 */
	public String makeOutWord(String out, String word) {
		return (out.substring(0, 2) + word + out.substring(2, 4));
	}

// return a new string using the substring method, focusing on the first 3 characters in the beginning, the initial string, and the second substring with the 3 and 5 characters.
	/*
	 * Given a string, return a new string made of 3 copies of the last 2 chars of
	 * the original string. The string length will be at least 2. extraEnd("Hello")
	 * → "lololo" extraEnd("ab") → "ababab" extraEnd("Hi") → "HiHiHi"
	 */
	public String extraEnd(String str) {
		return str.substring(str.length() - 2) + str.substring(str.length() - 2) + str.substring(str.length() - 2);
		// return the str substring with an str length and account for the last two
		// digits then build three different returns.
	}

	/*
	 * Given a string, return the string made of its first two chars, so the String
	 * "Hello" yields "He". If the string is shorter than length 2, return whatever
	 * there is, so "X" yields "X", and the empty string "" yields the empty string
	 * "". Note that str.length() returns the length of a string. firstTwo("Hello")
	 * → "He" firstTwo("abcdefg") → "ab" firstTwo("ab") → "ab"
	 */
	public String firstTwo(String str) {
		if (str.length() >= 3)
			return str.substring(0, 2);
		return str;
	}

// 1. create an if statement that contains the max length of characters available (3). 
// 2. return the substring with positions of 0 and 2 to account for the location of characters in the initial string.

	/*
	 * Given a string of even length, return the first half. So the string "WooHoo"
	 * yields "Woo". firstHalf("WooHoo") → "Woo" firstHalf("HelloThere") → "Hello"
	 * firstHalf("abcdef") → "abc"
	 */
	public String firstHalf(String str) {
		return str.substring(0, str.length() / 2);
	}

// Return the String with a substring using position 0 as the start and taking half off by doing str.length()/2.

	/*
	 * Given a string, return a version without the first and last char, so "Hello"
	 * yields "ell". The string length will be at least 2. withoutEnd("Hello") →
	 * "ell" withoutEnd("java") → "av" withoutEnd("coding") → "odin"
	 */
	public String withoutEnd(String str) {
		return str.substring(1, str.length() - 1);
	}

// Return string with substring starting at position 1 and leaving the last character off through str.length-1.

	/*
	 * Given 2 strings, a and b, return a string of the form short+long+short, with
	 * the shorter string on the outside and the longer string on the inside. The
	 * strings will not be the same length, but they may be empty (length 0).
	 * comboString("Hello", "hi") → "hiHellohi" comboString("hi", "Hello") →
	 * "hiHellohi" comboString("aaa", "b") → "baaab"
	 */
	public String comboString(String a, String b) {
		if (a.length() > b.length()) { // start by positioning the if statement, comparing the two strings
										// starting with a greater than b due to no equals and no matter which one
										// thanks to either working
			return b + a + b; // return the different sections concatenated by which ones are smaller on the
								// outside and the bigger in the middle
		}
		return a + b + a; // return the opposite to cover the alternatives.
	}

	/*
	 * Given 2 strings, return their concatenation, except omit the first char of
	 * each. The strings will be at least length 1. nonStart("Hello", "There") →
	 * "ellohere" nonStart("java", "code") → "avaode" nonStart("shotl", "java") →
	 * "hotlava"
	 */
	public String nonStart(String a, String b) {

		return a.substring(1) + b.substring(1); // return a substring omitting the first character of each string.

	}

	/*
	 * Given a string, return a "rotated left 2" version where the first 2 chars are
	 * moved to the end. The string length will be at least 2. left2("Hello") →
	 * "lloHe" left2("java") → "vaja" left2("Hi") → "Hi"
	 */
	public String left2(String str) {
		return str.substring(2) + str.substring(0, 2); // return the substring with 2 characters ommitted,
														// then concatenate the same string with only the first two
														// characters after the first
	}

	/*
	 * Given a string, return a "rotated right 2" version where the last 2 chars are
	 * moved to the start. The string length will be at least 2. right2("Hello") →
	 * "loHel" right2("java") → "vaja" right2("Hi") → "Hi"
	 */
	public String right2(String str) {
		return str.substring(str.length() - 2) + str.substring(0, str.length() - 2);
		// return the substring with the last two characters ommitted
		// then concatenate the substring so the string is moved to after the first two
		// characters
	}

	/*
	 * Given a string, return a string length 1 from its front, unless front is
	 * false, in which case return a string length 1 from its back. The string will
	 * be non-empty. theEnd("Hello", true) → "H" theEnd("Hello", false) → "o"
	 * theEnd("oh", true) → "o"
	 */
	public String theEnd(String str, boolean front) {
		if (front == true) { // Position the if boolean statement at the beginning, for the true false
								// section.
			return str.substring(0, 1); // if true, return the string character at position (0,1);
		}
		{
			return str.substring(str.length() - 1); // if false, return the last character
		}

	}

	/*
	 * Given a string, return a version without both the first and last char of the
	 * string. The string may be any length, including 0. withoutEnd2("Hello") →
	 * "ell" withoutEnd2("abc") → "b" withoutEnd2("ab") → ""
	 */
	public String withoutEnd2(String str) {
		if (str.length() > 2) {
			return str.substring(1, str.length() - 1);
		}
		return "";
	}

	/*
	 * Given a string of even length, return a string made of the middle two chars,
	 * so the string "string" yields "ri". The string length will be at least 2.
	 * middleTwo("string") → "ri" middleTwo("code") → "od" middleTwo("Practice") →
	 * "ct"
	 */
	public String middleTwo(String str) {
		return str.substring((str.length() / 2 - 1), (str.length() / 2 + 1));
	}

	// Break the problems down into sides. each is even, so split down the middle
	// and to find the high and low points,
	// you divide the string by two and subtract one for the lower limit and do the
	// same but add one for the upper limit.

	/*
	 * Given a string, return true if it ends in "ly". endsLy("oddly") → true
	 * endsLy("y") → false endsLy("oddy") → false
	 */
	public boolean endsLy(String str) {
		if (str.endsWith("ly")) { // ask if the string ends in ly.
			return true; // if yes, return true.
		}
		return false; // return false;
	}

	/*
	 * Given a string and an int n, return a string made of the first and last n
	 * chars from the string. The string length will be at least n. nTwice("Hello",
	 * 2) → "Helo" nTwice("Chocolate", 3) → "Choate" nTwice("Chocolate", 1) → "Ce"
	 */
	public String nTwice(String str, int n) {
		return (str.substring(0, n) + str.substring(str.length() - n));

	}

	/*
	 * Given a string and an index, return a string length 2 starting at the given
	 * index. If the index is too big or too small to define a string length 2, use
	 * the first 2 chars. The string length will be at least 2. twoChar("java", 0) →
	 * "ja" twoChar("java", 2) → "va" twoChar("java", 3) → "ja"
	 */
	public String twoChar(String str, int index) {
		if (index + 2 > str.length() || index < 0) // create if statement, saying if the index plus two is greater than
													// the string length
													// or the index is less than 0, returning the string between
													// positions 0 and 2.
			return str.substring(0, 2);
		return str.substring(index, index + 2); // if the is greater than two, return the first two characters

	}

	/*
	 * Given a string of odd length, return the string length 3 from its middle, so
	 * "Candy" yields "and". The string length will be at least 3.
	 * middleThree("Candy") → "and" middleThree("and") → "and"
	 * middleThree("solving") → "lvi"
	 */
	public String middleThree(String str) {
		int length = (str.length() / 2);
		return str.substring(length - 1, length + 2);
	}

	// return substrings that create a max number of three spaces to account for the
	// 3 character option,
	// dividing by 2 to split and doing odd options to account for the uneven string
	// length.

	/*
	 * Given a string, return true if "bad" appears starting at index 0 or 1 in the
	 * string, such as with "badxxx" or "xbadxx" but not "xxbadxx". The string may
	 * be any length, including 0. Note: use .equals() to compare 2 strings.
	 * hasBad("badxx") → true hasBad("xbadxx") → true hasBad("xxbadxx") → false
	 */
	public boolean hasBad(String str) {
		if (str.startsWith("bad")) { // create if statement for bad to return true
			return true;
		} else if (str.startsWith("xbad")) { // create if statement for position one bad by incorporating the x in
												// position 0 to the statement
			return true;
		}
		return false; // return false for anything else.
	}

	/*
	 * Given a string and a non-negative int n, return a larger string that is n
	 * copies of the original string. stringTimes("Hi", 2) → "HiHi"
	 * stringTimes("Hi", 3) → "HiHiHi" stringTimes("Hi", 1) → "Hi"
	 */
	public String stringTimes(String str, int n) {

		String larger = ""; // Create new string

		for (int i = 0; i < n; i++) { // establish for loop where int i = 0, n is greater than i, and it
										// increments as many times as n.

			larger = larger + str; // concatenate created string with given string

		}
		return larger; // return the new string

	}

	/*
	 * Given a string and a non-negative int n, we'll say that the front of the
	 * string is the first 3 chars, or whatever is there if the string is less than
	 * length 3. Return n copies of the front; frontTimes("Chocolate", 2) → "ChoCho"
	 * frontTimes("Chocolate", 3) → "ChoChoCho" frontTimes("Abc", 3) → "AbcAbcAbc"
	 */
	public String frontTimes(String str, int n) {
		String firstThree = ""; // create new string
		if (str.length() < 3) { // establish if statement when length is less than 3.
			for (int i = 0; i < n; i++) // first for loop, incrementing 3 times
				firstThree += str; // add the new loop to the initial string
			return firstThree; // return the new loop
		} else if (str.length() >= 3) { // create else if for greater than 3 scenario

			String newString = str.substring(0, 3); // establish new alternate string
			for (int i = 0; i < n; i++) // run for loop
				firstThree += newString; // add new string to other new string
		}

		return firstThree;
	}

	/*
	 * Count the number of "xx" in the given string. We'll say that overlapping is
	 * allowed, so "xxx" contains 2 "xx". countXX("abcxx") → 1 countXX("xxx") → 2
	 * countXX("xxxx") →
	 */
	public int countXX(String str) {
		int count = 0;
		for (int i = 0; i < str.length() - 1; i++) { // stop the loop from going beyond last character with str.length
														// -1
			if (str.substring(i, i + 2).equals("xx"))
				count++;
		}

		return count;
	}

	/*
	 * Given a string, return true if the first instance of "x" in the string is
	 * immediately followed by another "x". doubleX("axxbb") → true
	 * doubleX("axaxax") → false doubleX("xxxxx") → true
	 */
	public boolean doubleX(String str) {

		int possOfX = str.indexOf("x"); // Initialize the variable

		if (possOfX < str.length() - 1) {
			if (str.charAt(possOfX + 1) == 'x') {
				return true;
			}
		}
		return false;

	}

	/*
	 * Given a string, return a new string made of every other char starting with
	 * the first, so "Hello" yields "Hlo". stringBits("Hello") → "Hlo"
	 * stringBits("Hi") → "H" stringBits("Heeololeo") → "Hello"
	 */
	public String stringBits(String str) {
		String result = "";
		for (int i = 0; i < str.length(); i += 2) {
			result += str.charAt(i);
		}
		return result;
	}

	/*
	 * Given a non-empty string like "Code" return a string like "CCoCodCode".
	 * stringSplosion("Code") → "CCoCodCode" stringSplosion("abc") → "aababc"
	 * stringSplosion("ab") → "aab"
	 */
	public String stringSplosion(String str) {
		String result = "";
			for (int i = 0; i < str.length()+1; i++) {
				result += str.substring(0, i);
			}
		
		return result;
	}

	/*
	 * Given a string, return the count of the number of times that a substring
	 * length 2 appears in the string and also as the last 2 chars of the string, so
	 * "hixxxhi" yields 1 (we won't count the end substring). last2("hixxhi") → 1
	 * last2("xaxxaxaxx") → 1 last2("axxxaaxx") → 2
	 */
	public int last2(String str) {
		if (str.length() < 2)
			return 0;
		
		String lastTwoCharacters = str.substring((str.length() -2));
		int count = 0;
		for (int i = 0; i < str.length() - 2; i++) { // stop the loop from going beyond last character with str.length
														// -1
			if (str.substring(i, i + 2).equals(lastTwoCharacters))
				count++;
		}

		return count;
	}

	/*
	 * Given a string, return a version where all the "x" have been removed. Except
	 * an "x" at the very start or end should not be removed. stringX("xxHxix") →
	 * "xHix" stringX("abxxxcd") → "abcd" stringX("xabxxxcdx") → "xabcdx"
	 */
	public String stringX(String str) {
		String result = "";
		if (str.length() <= 2) { // if the string is 2 characters or less, we return the string beacuse its
									// either 2 'x' or no x at all.
			return str;
		}
		result += str.charAt(0); // so far, the empty string wants the first character
		// skip over the first because if it is an x, we keep it, and if it isn't an x
		// we omit it anyways
		for (int i = 1; i < str.length() - 1; i++) {
			if (str.charAt(i) != 'x') {
				result = result + str.charAt(i); // to solve for the x's in the middle, you are starting at position 1
													// in the index and going
			}
		}
		result += str.charAt(str.length() - 1); // this statement accounts for the last character position as the
												// character
												// is returned regardless of the loop results
		return result;
	}

	/*
	 * Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9
	 * ... so "kittens" yields "kien". altPairs("kitten") → "kien"
	 * altPairs("Chocolate") → "Chole" altPairs("CodingHorror") → "Congrr"
	 */
	public String altPairs(String str) {
		
		if (str.length() <=1 ) {
			return str;
		}
			String result = "";
			for (int i = 0; i < str.length(); i += 4) {
				int endIndex = i + 2;
				
				if ( endIndex > str.length()) {
					endIndex = str.length();
				}
			result +=str.substring(i, endIndex);	
				
			}
			
		return result;
	}

	/*
	 * Suppose the string "yak" is unlucky. Given a string, return a version where
	 * all the "yak" are removed, but the "a" can be any char. The "yak" strings
	 * will not overlap. stringYak("yakpak") → "pak" stringYak("pakyak") → "pak"
	 * stringYak("yak123ya") → "123ya"
	 */
	public String stringYak(String str) {
		return null; // craig said its such a disaster that he doesnt even think to do it.
	}

}
