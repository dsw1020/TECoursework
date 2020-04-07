package com.techelevator;

public class Airplane {
	
	//********************************************************************************************	
	// Class member data - attributes of an class object
	//********************************************************************************************
	
	private String planeNumber;

	private int bookedFirstClassSeats;

	private int totalFirstClassSeats;

	private int bookedCoachSeats;

	private int totalCoachSeats;

	//********************************************************************************************
	// Constructors for the class
	//*********************************************************************************************	
	
	public Airplane(String planeNumber, int totalFirstClassSeats, int totalCoachSeats) {
		this.totalCoachSeats = totalCoachSeats;
		this.totalFirstClassSeats = totalFirstClassSeats;
		this.planeNumber = planeNumber;
	}
	//********************************************************************************************
	// Getters	- Allows users to see the values in an object
	//********************************************************************************************
	
	public String getPlaneNumber() {
		return planeNumber;
	}

	public int getBookedFirstClassSeats() {
		return bookedFirstClassSeats;
	}

	public int getTotalFirstClassSeats() {
		return totalFirstClassSeats;
	}

	public int getBookedCoachSeats() {
		return bookedCoachSeats;
	}

	public int getTotalCoachSeats() {
		return totalCoachSeats;
	}

		
	//********************************************************************************************
	// methods - Perform processing 
	//********************************************************************************************
		
	public int getAvailableFirstClassSeats() {
		return totalFirstClassSeats - bookedFirstClassSeats;

	}

	public int getAvailableCoachSeats() {
		return totalCoachSeats - bookedCoachSeats;
	}

	public boolean reserveSeats(boolean forFirstClass, int requestedSeats) {
		if (forFirstClass) {
			// first class isnt full so we are booking first class
			if (getAvailableFirstClassSeats() < requestedSeats) {
				return false;
			}
			bookedFirstClassSeats = bookedFirstClassSeats + requestedSeats;

		} else {
			if (getAvailableCoachSeats() < requestedSeats) {
				return false;
			}
			bookedCoachSeats = bookedCoachSeats + requestedSeats;

			// first class is booked so we are reserving coach seats
		}
		return true;
	}
			
}	
		
		
		
		
		
		
		


