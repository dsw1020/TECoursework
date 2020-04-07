package com.techelevator;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

// Classes are always capitalized (PascalCase)
public class Lecture {

	public static void main(String[] args) {
		System.out.println("####################");
		System.out.println("       LISTS");
		System.out.println("####################");
		
		
		// ArrayList is a type of list that can be treated like an Array
		//			a series of objects/elements that may be different types
		//			CANNOT hold primatives (int, long, float, double, boolean, etc.)
		//			variable size - add/remove elements
		
		// To define an ArrayList:	List<data-type-for-elements> name 	   = new ArrayList<data-type-for-elements>();
		// 						 :	ArrayList<data-type-for-elements> name = new ArrayList<data-type-for-elements>(); 
		
		List<String> names = new ArrayList <String>(); //created new ArrayList that utilizes the data initialized below
		
		// To add elements to an ArrayList 			- .add() method
		// To access one element in the ArrayList   - .get(index number you want) method - 1st element is 0
		// To get the number of elements			- .size() method
		// To add elements in the middle			- .add(element #-to-insert-after, new-element); *1 is the first element*
		// To remove an element 					- .remove(index number)
		// To check if an ArrayList contains something - .contains(element)
		// To convert an Arraylist to an Array    - 
		
	
		names.add("Frank");
		names.add("George");
		names.add("Shanygne");
		names.add("Gabe");
		
		
		System.out.println("####################");
		System.out.println("Lists are ordered according to when they are entered");
		System.out.println("####################");
		
		for ( int i = 0; i < names.size(); i++) {
			System.out.println("Elem #: " + i + " - " + names.get(i)); // get the element at i
		}

		System.out.println("####################");
		System.out.println("Lists allow duplicates");
		System.out.println("####################");
		
		names.add("Shanygne");
		
		for ( int i = 0; i < names.size(); i++) {
			System.out.println("Elem #: " + i + " - " + names.get(i)); // get the element at i
		}

		System.out.println("####################");
		System.out.println("Lists allow elements to be inserted in the middle");
		System.out.println("####################");
		
		names.add(3,"Monkey"); // The number is the element number to insert after, not an index( 1st element is #1)
							   // The number is the index position you want the new element to appear at. 
		for ( int i = 0; i < names.size(); i++) {
			System.out.println("Elem #: " + i + " - " + names.get(i)); // get the element at i
		}

		System.out.println("####################");
		System.out.println("Lists allow elements to be removed by index");
		System.out.println("####################");
		
		
		names.remove(3); //Removes monkey that was previously at element 3
		
		for ( int i = 0; i < names.size(); i++) {
			System.out.println("Elem #: " + i + " - " + names.get(i)); // get the element at i
		}

		System.out.println("####################");
		System.out.println("Find out if something is already in the List");
		System.out.println("####################");
		
		System.out.println("Is Shanygne in the ArrayList? " + names.contains("Shanygne"));
		
		

		System.out.println("####################");
		System.out.println("Lists can be turned into an array");
		System.out.println("####################");
		
		String [] namesArray = names.toArray(new String[names.size()]); // Tell toArray the datatype and 3-elements
		
		for ( int i = 0; i < namesArray.length; i++) {
			System.out.println("Elem #: " + i + " - " + namesArray[i]); // 
		}
		

		System.out.println("####################");
		System.out.println(" PRIMITIVE WRAPPERS");
		System.out.println("####################");

		/* Every primitive data type has an equivalent "primitive wrapper class" that is an object representation
		 * of a primitive value */
		
		List<Integer> intList = new ArrayList<Integer>();
		List<Double>  dblList = new ArrayList<Double>();
		List<Boolean> booList = new ArrayList<Boolean>();
		
		intList.add(1);
		dblList.add(1.1);
		booList.add(true);
		
		
		System.out.println("####################");
		System.out.println("       FOREACH");
		System.out.println("####################");
		System.out.println();
		
		// for each loop always processes from the beginning to the end of a Collection object or Array
		// 		Can't start in the middle 
		//		Can't stop in the middle
		//		Don't know the index of the current element
		//		Can't skip elements (i.e. no i+2 or i-3)
		//		Shorthand - for loop
		//
		//		for( datatype name : object/arrayName) - name is where the current element is stored
		//			 datatype is the datat type of an element in the array/collection object
		// 			 name is used in the loop to reference the current element

		for (String aName : names) {		// each time through the loop aName will contain the current element
			System.out.println("Name is : " + aName);
		}
		
		System.out.println("####################");
		System.out.println("       QUEUES");
		System.out.println("####################");
		System.out.println();

		/////////////////////
		// PROCESSING ITEMS IN A QUEUE
		/////////////////////

		System.out.println("####################");
		System.out.println("       STACKS");
		System.out.println("####################");
		System.out.println();

		////////////////////
		// PUSHING ITEMS TO THE STACK
		////////////////////

		////////////////////
		// POPPING THE STACK
		////////////////////

	}
}
