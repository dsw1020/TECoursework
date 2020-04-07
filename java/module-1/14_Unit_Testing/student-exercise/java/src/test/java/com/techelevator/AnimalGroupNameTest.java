package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Test;

public class AnimalGroupNameTest {

	@Test
	public void animal_Group_Name_lowercase() {

		AnimalGroupName aGnTests = new AnimalGroupName();
		String aGnTest = "rhino";
		String groupName = aGnTests.getHerd(aGnTest);
		assertEquals("getHerd method did not return the proper animal", "Crash", groupName);

	}

	@Test
	public void animal_Group_Name_uppercase() {

		AnimalGroupName aGnTests = new AnimalGroupName();
		String aGnTest = "RHINO";
		String groupName = aGnTests.getHerd(aGnTest);
		assertEquals("getHerd method did not return the proper animal", "Crash", groupName);

	}

	@Test
	public void animal_Group_Name_mixedcase() {

		AnimalGroupName aGnTests = new AnimalGroupName();
		String aGnTest = "rHiNo";
		String groupName = aGnTests.getHerd(aGnTest);
		assertEquals("getHerd method did not return the proper animal", "Crash", groupName);
	}

	@Test
	public void animal_Group_Name_unKnown() {

		AnimalGroupName aGnTests = new AnimalGroupName();
		String aGnTest = "walrus";
		String groupName = aGnTests.getHerd(aGnTest);
		assertEquals("getHerd method did not return the proper animal", "unknown", groupName);

	}

	@Test
	public void animal_Group_Name_empty() {

		AnimalGroupName aGnTests = new AnimalGroupName();
		String aGnTest = " ";
		String groupName = aGnTests.getHerd(aGnTest);
		assertEquals("getHerd method did not return the proper animal", "unknown", groupName);

	}

	@Test
	public void animal_Group_Name_not_found() {

		AnimalGroupName aGnTests = new AnimalGroupName();
		String aGnTest = "elephants";
		String groupName = aGnTests.getHerd(aGnTest);
		assertEquals("getHerd method did not return the proper animal", "unknown", groupName);

	}

	@Test
	public void animal_Group_Name_null() {

		AnimalGroupName aGnTests = new AnimalGroupName();
		String aGnTest = "null";
		String groupName = aGnTests.getHerd(aGnTest);
		assertEquals("getHerd method did not return the proper animal", "unknown", groupName);

	}

}
