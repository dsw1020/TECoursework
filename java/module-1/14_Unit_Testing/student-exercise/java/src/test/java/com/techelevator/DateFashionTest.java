package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Test;

public class DateFashionTest {
	
	

	@Test
	public void test_get_a_table_over_under_() {
		DateFashion testDate = new DateFashion();
		int you = 0;
		int date = 10;
		int testTable = testDate.getATable(you, date);
		assertEquals("Table did not implement correctly",0, testTable);
	}

	@Test
	public void test_get_a_table_equal_to_2() {
		DateFashion testDate = new DateFashion();
		int you = 2;
		int date = 2;
		int testTable = testDate.getATable(you, date);
		assertEquals("Table did not implement correctly",0, testTable);
	}
	
	@Test
	public void test_get_a_table_over_under() {
		DateFashion testDate = new DateFashion();
		int you = 1;
		int date = 5;
		int testTable = testDate.getATable(you, date);
		assertEquals("Table did not implement correctly",0, testTable);
	
	}
	
	@Test
	public void test_get_a_table_inside_range() {
		DateFashion testDate = new DateFashion();
		int you = 4;
		int date = 6;
		int testTable = testDate.getATable(you, date);
		assertEquals("Table did not implement correctly",1, testTable);
	
	
	}
	
	@Test
	public void test_get_a_table_8_or_above() {
		DateFashion testDate = new DateFashion();
		int you = 8;
		int date = 8;
		int testTable = testDate.getATable(you, date);
		assertEquals("Table did not implement correctly",2, testTable);
	
	
	}
	
	@Test
	public void test_get_a_table_8_or_above_and_below() {
		DateFashion testDate = new DateFashion();
		int you = 8;
		int date = 3;
		int testTable = testDate.getATable(you, date);
		assertEquals("Table did not implement correctly",2, testTable);
	
	
	}
	
	
	

	
}
