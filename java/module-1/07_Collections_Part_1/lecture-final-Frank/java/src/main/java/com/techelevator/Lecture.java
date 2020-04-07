package com.techelevator;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public class Lecture {

	public static void main(String[] args) {
		System.out.println("####################");
		System.out.println("       LISTS");
		System.out.println("####################");

		// ArrayList is a type of List that can be treated like an Array
		//           a series of objects/elements that may be different types
		//           cannot hold primitives
		//           variable size - add/remove elements
		
		// To define and ArrayList:  List<data-type-for-elements> name      = new ArrayList<data-type-for-elements>();
		//                           ArrayList<data-type-for-elements> name = new ArrayList<data-type-for-elements>();
		
		
		List<String> names = new ArrayList<String>();
		
		// To add elements to an ArrayList    - .add() method
		// To access one element in ArrayList - .get(index) - 1st element is 0 
		// To get the number of elements      - .size()
		// To add elements in the middle      - .add(element #-to-insert-after, new-element);  1 is the first element
		// To remove an element               - .remove(index #)
		// To see if an element is in ArrayList - .contains(search-value) - return true if it's there
		
		
		names.add("Frank");
		names.add("George");
		names.add("Shanygne");
		names.add("Gabe");
		
		System.out.println("####################");
		System.out.println("Lists are ordered according to when they are entered");
		System.out.println("####################");
		
		for (int i = 0; i < names.size(); i++) {
			System.out.println("Elem #: " + i + " - " + names.get(i));  // get the element at index i
			
		}
		System.out.println("####################");
		System.out.println("Lists allow duplicates");
		System.out.println("####################");

		names.add("Shanygne");
		
		for (int i = 0; i < names.size(); i++) {
			System.out.println("Elem #: " + i + " - " + names.get(i));  // get the element at index i
			
		}
		
		System.out.println("####################");
		System.out.println("Lists allow elements to be inserted in the middle");
		System.out.println("####################");

		names.add(3,"Monkey");  // The number is the element number to insert after not an index (1st is #1)
		                        // The number is the index position you want the new element at
		
		for (int i = 0; i < names.size(); i++) {
			System.out.println("Elem #: " + i + " - " + names.get(i));  // get the element at index i
			
		}
		
		System.out.println("####################");
		System.out.println("Lists allow elements to be removed by index");
		System.out.println("####################");
		
		names.remove(3);   // The number is the index position you want the new element at
	
		for (int i = 0; i < names.size(); i++) {
			System.out.println("Elem #: " + i + " - " + names.get(i));  // get the element at index i

		}

		System.out.println("####################");
		System.out.println("Find out if something is already in the List");
		System.out.println("####################");
		
		System.out.println("Is Shanygne is the ArrayList? " + names.contains("Shanygne"));

		System.out.println("####################");
		System.out.println("Lists can be turned into an array");
		System.out.println("####################");
		
		String[] namesArray = names.toArray(new String[names.size()]); // Tell toArray the datatype and 3-elements
		
		for (int i = 0; i < namesArray.length; i++) {
			System.out.println("Elem #: " + i + " - " + namesArray[i]);  // get the element at index i

		}

		System.out.println("####################");
		System.out.println(" PRIMITIVE WRAPPERS");
		System.out.println("####################");

		/* Every primitive data type has an equivalent "primitive wrapper class" that is an object representation
		 * of a primitive value */
		
		List<Integer> intList  = new ArrayList<Integer>();
		List<Double>  dblList  = new ArrayList<Double>();
		List<Boolean> boolList = new ArrayList<Boolean>();

		intList.add(1);
		dblList.add(1.1);
		boolList.add(true);
		
		System.out.println("####################");
		System.out.println("       FOREACH");
		System.out.println("####################");
		System.out.println();

		// for each loop always processes from beginning to end of a Collection object or Array
		//     Can't start in the middle
		//     Can't stop in the middle
		//     Don't know the index of the current element
		//     Can't skip elements
		//
		//     shorthand for loop
		//     
		//     for( datatype name : object/arrayName) - name is where the current element
		//
		//          datatype is the data type of an element in the array/Collection object
		//              name i s used in the loop to reference the current element
		
		for (String aName : names) {  // Each time through the loop aName will contain the current element
			System.out.println("Name is: " + aName);
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
