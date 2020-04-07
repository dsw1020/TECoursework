package com.techelevator;

public class SalaryWorker implements Worker {
	
	private String firstName;
	private String lastName;

	private double annualSalary;

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	
	
	public SalaryWorker(String firstName, String lastName, double annualSalary) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.annualSalary = annualSalary;
	}

	public double getAnnualSalary() {
		return annualSalary;
	}

	@Override
	public double calculatePay(int hoursWorked) {
		return annualSalary / 52;

	}

}
