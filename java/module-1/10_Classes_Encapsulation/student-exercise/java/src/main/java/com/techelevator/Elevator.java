package com.techelevator;

public class Elevator {
	
	//********************************************************************************************	
	// Class member data - attributes of an class object
	//********************************************************************************************
	private int currentFloor;
	
	private int numberOfFloors;
	
	private boolean doorOpen;
	

	//********************************************************************************************
	// Constructors for the class
	//********************************************************************************************
	
	public Elevator (int totalNumberOfFloors) {
		this.currentFloor = 1;
		this.numberOfFloors = totalNumberOfFloors;
	}


	
		
	//********************************************************************************************
	// Getters	- Allows users to see the values in an object
	//********************************************************************************************
	public int getCurrentFloor() {
		return currentFloor;
	}


	public int getNumberOfFloors() {
		return numberOfFloors;
	}


	public boolean isDoorOpen() {
		return doorOpen;
	}
	
	
	
	//********************************************************************************************
	// methods - Perform processing 
	//********************************************************************************************
	
	public void openDoor() {
		doorOpen = true;
	}
	
	public void closeDoor() {
		doorOpen = false;
	}
	public void goUp(int desiredFloor) {
		if (doorOpen == false && desiredFloor > currentFloor && desiredFloor <= numberOfFloors) {
			currentFloor = desiredFloor;
		}
	}
	
	public void goDown(int desiredFloor) {
		if (doorOpen == false && desiredFloor < currentFloor && desiredFloor >= 1) {
			currentFloor = desiredFloor;
	}

	}
}
