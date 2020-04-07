package com.techelevator.person;

public class Person {

	//********************************************************************************************	
	// Class member data - attributes of an class object
	//********************************************************************************************
	
	private String  firstName;  // First name of the person
	
	private String  lastName;	// Last name of the Person
	
	private int		age;		// The age of the person
	
	
	
	/**************************************************************************************
	 * Constructors
	***************************************************************************************/
	public Person() { // Default Constructor
		
	}
	
	//********************************************************************************************
	// Getters	- Allows users to see the values in an object
	//********************************************************************************************
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public int getAge() {
		return age;
	}
	
	//********************************************************************************************
	// Setters	- Allows users to change values
	//********************************************************************************************
		
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	/**************************************************************************************
	 * Public Methods / Behaviors - Accessible to the public
	***************************************************************************************/
	
	public String getFullName() {	
		return firstName + " " + lastName;
	}
	
	public boolean isAdult() {
		if (age >= 18)
			return true;
		return false;
	}
	
	
	
	
	
}
