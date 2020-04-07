package com.techelevator;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Lecture {

	public static void main(String[] args) {

		System.out.println("####################");
		System.out.println("       MAPS");
		System.out.println("####################");
		System.out.println();

		/* Map is an interface and HashMap is a class that implements Map */
		/* A HashMap does not store entries in any particular order		*/
		
		// Define a map with a String as Key and a String as Value
		// Syntax for Map:  Map<KeyDataValue, ValueDataType> mapName = new HashMap <KeyDataValue, ValueDataType>();
		//Example:
		//		Map<String, String> zipCodes = new HashMap <String, String>();
		
		/* A TreeMap stores entries in sequential order 
		 * 		String - Alphabetical order
		 * 		Int - Numerical order
		 * 		
		 */
		
		Map<String, String> zipCodes = new TreeMap <String, String>();
		
		
		/* The "put" method is used to add elements to a Map */
		// FIGURE A.
		zipCodes.put("Vinny", "44307");
		zipCodes.put("Jake", "44115");
		zipCodes.put("Jason", "44106");
		zipCodes.put("Gabe", "44266");
		zipCodes.put("Barbarino", "44307");
		

		/* The "get" method is used to retrieve elements from a Map */
		
		System.out.println("Jake lives in " + zipCodes.get("Jake"));
		System.out.println("Gabe lives in " + zipCodes.get("Gabe"));
		System.out.println("Vinny lives in " + zipCodes.get("Vinny"));
		System.out.println("Frank lives in " + zipCodes.get("Frank"));
		System.out.println("Barbarino lives in " + zipCodes.get("Barbarino"));
		/* keySet returns a Set of all of the keys in the Map */
		
		
		/* If the key already exists, put will overwrite the existing value with the new value */
		zipCodes.put("Barbarino", "12345");	// it updates the existing value for the key
											// and DOESN'T tell you it did it 
		
		
		
		// Display all the entries in the map
		// Use a Set object to get all the keys from the Map in order to iterate through the Map
		// Set object designed to hold a set of values
		//FIGURE B.
		
		System.out.println("\n-----Display all entries using a keySet-----\n");
		
		Set<String> theKeys = zipCodes.keySet();	// Extract all the Keys from the Map
		
		for (String aKey : theKeys) {
			System.out.println(aKey + " lives in " + zipCodes.get(aKey));
		}
		
		System.out.println("\n----- removing Barbarino------\n");
		
		
		// To Remove an Entry use .remove(key-value)
		
		zipCodes.remove("Barbarino");

		System.out.println("Barbarino lives in " + zipCodes.get("Barbarino"));

		System.out.println("####################");
		System.out.println("       SETS");
		System.out.println("####################");
		System.out.println();

		// Set<String> names = new TreeSet<String>();
		
		Set<String> names = new HashSet<String>();
		
		names.add("David");
		names.add("Patrick");
		names.add("Ricky");
		
		for (String aName : names)
		{
			System.out.println(aName + " - ");
		}
		
		
		System.out.println("####################");
		System.out.println("Sets cannot contain duplicates");
		System.out.println("####################");
		System.out.println();

		names.add("Ricky");	// Cannot add a duplicate - No message to alert you to issue so check your data!
		

		System.out.println("####################");
		System.out.println("Sets do not guarantee ordering");
		System.out.println("####################");
		System.out.println();



	}

}
