package com.techelevator;

public class Employee {
	
	//********************************************************************************************	
	// Class member data - attributes of an class object
	//********************************************************************************************
	
	private int employeeId; // the employee's ID
	
	private String firstName; // the employee's first name
	
	private String lastName; // the employee's last name
	
	private String department; //
	
	private double annualSalary;

	
	//********************************************************************************************
	// Getters	- Allows users to see the values in an object
	//********************************************************************************************
	
	
	public String getLastName() {
		return lastName;
	}
	public String getDepartment() {
		return department;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public String getFirstName() {
		return firstName;
	}
	public double getAnnualSalary() {
		return annualSalary;
	}
	//********************************************************************************************
	// Setters	- Allows users to change values
	//********************************************************************************************
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setDepartment(String department) {
		this.department = department;
	}

	//********************************************************************************************
	// Constructors for the class
	//*********************************************************************************************	
	
	public Employee(int employeeId, String firstName, String lastName, double salary) {  
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.annualSalary = salary;
		
	}
	
	//********************************************************************************************
	// methods - Perform processing 
	//********************************************************************************************
	
	public String getFullName() {
		return lastName + ", " +  firstName;
		
	}
	
	public void raiseSalary(double percent) {
		double raiseAmount = annualSalary * (percent/100);
		annualSalary = annualSalary + raiseAmount;
	}
	
}



