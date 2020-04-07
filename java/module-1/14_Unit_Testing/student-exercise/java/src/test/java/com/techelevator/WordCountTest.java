package com.techelevator;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class WordCountTest {

	@Test
	public void word_count_test() {

		WordCount testMap = new WordCount();
		String[] words = new String[] { "ba", "ba", "black", "sheep" };
		String ba = "ba";
		String black = "black";
		String sheep = "sheep";
		Map<String, Integer> expectedMap = new HashMap<String, Integer>();
		expectedMap.put(ba, 2);
		expectedMap.put(black, 1);
		expectedMap.put(sheep, 1);
		Map<String, Integer> getCount = testMap.getCount(words);
		assertEquals("WordCount did not return the correct Map", expectedMap, getCount);
		int expectedSize = 3;
		int getCountSize = getCount.size();
		assertEquals("WordCount did not return a map of size 3 elements. ", expectedSize, getCount.size());
	}

	@Test
	public void word_count_test_empty() {

		WordCount testMap = new WordCount();
		String[] words = new String[] { "", "", "", "" };
		Map<String, Integer> expectedMap = new HashMap<String, Integer>();
		expectedMap.put("", 4);
		Map<String, Integer> getCount = testMap.getCount(words);
		assertEquals("WordCount did not return the correct Map", expectedMap, getCount);

		int expectedSize = 1;
		int getCountSize = getCount.size();
		assertEquals("WordCount did not return a map of size 3 elements. ", expectedSize, getCount.size());

	}
}
