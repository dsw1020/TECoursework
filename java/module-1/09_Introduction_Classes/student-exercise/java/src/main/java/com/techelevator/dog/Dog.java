package com.techelevator.dog;

public class Dog {

	//********************************************************************************************	
	// Class member data - attributes of an class object
	//********************************************************************************************
	
	private boolean isSleeping; // true is the dog is asleep, false if not. All new dogs are awake by default
	
	/**************************************************************************************
	 * Constructors
	***************************************************************************************/
	public Dog() { // Default Constructor
		isSleeping = false;
	}

	//********************************************************************************************
	// Getters	- Allows users to see the values in an object
	//********************************************************************************************
	
	public boolean isSleeping() {	
		return isSleeping;
	}
	
	/**************************************************************************************
	 * Public Methods / Behaviors - Accessible to the public
	***************************************************************************************/
	
	public String makeSound() {	// Returns "Zzzzz..." if the dog is asleep. Returns "Woof!" if the dog is awake. 
		if (isSleeping == true) {
			return "Zzzzz...";
		}	else {
			return "Woof!";
		}
		
	}
	
	public void sleep() {
		isSleeping = true;
	}
	
	public void wakeUp() {
		isSleeping = false;
	
	
	}

	
		
	
}
