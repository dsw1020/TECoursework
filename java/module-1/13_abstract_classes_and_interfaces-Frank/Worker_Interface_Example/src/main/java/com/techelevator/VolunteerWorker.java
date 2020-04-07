package com.techelevator;

public class VolunteerWorker implements Worker{
	private String firstName;
	private String lastName;

	

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public VolunteerWorker(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		
	}

	@Override
	public double calculatePay(int hoursWorked) {
		return hoursWorked * 0;

	}

}
