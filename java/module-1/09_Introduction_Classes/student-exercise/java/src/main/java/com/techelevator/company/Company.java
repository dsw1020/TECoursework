package com.techelevator.company;

public class Company {
	//********************************************************************************************	
	// Class member data - attributes of an class object
	//********************************************************************************************
	
	private String name; // Company Name
	
	private	int numberOfEmployees; // The number of employees at the company
	
	private double revenue; // The annual revenue of the company
	
	private double expenses; // The annual expenses of the company
	
	
	/**************************************************************************************
	 * Constructors
	***************************************************************************************/
	public Company() { // Default Constructor
		
	}
	
	//********************************************************************************************
	// Getters	- Allows users to see the values in an object
	//********************************************************************************************
	
	public String getName() {
		return name;
	}
	
	public int getNumberOfEmployees() {
		return numberOfEmployees;
	}
	
	public double getRevenue() {
		return revenue;
	}
	
	public double getExpenses() {
		return expenses;
	}
	
	//********************************************************************************************
	// Setters	- Allows users to change values
	//********************************************************************************************
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setNumberOfEmployees(int numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}
	
	public void setRevenue(double revenue) {
		this.revenue = revenue;
	}

	public void setExpenses(double expenses) {
		this.expenses = expenses;
	}
	
	/**************************************************************************************
	 * Public Methods / Behaviors - Accessible to the public
	***************************************************************************************/
	
	public String getCompanySize() {	// private means only members of the class can use it 
		if (numberOfEmployees <= 50)  {
			return "small";
		}
			else if (numberOfEmployees >= 51 && numberOfEmployees <= 250) {
				return "medium";
			}
			else if (numberOfEmployees > 250) {
				return "large";
			}
		return name;
	}
	
	public double getProfit() {
		return revenue - expenses;
	}
	
	
	
	/**************************************************************************************
	 * Returns if data is entered.
	***************************************************************************************/

	

	public String toString() {
		return "Size: " + getCompanySize();
	}
	
	public String toDouble() {
		return "Revenue - Expenses = " + getProfit();
	}

	
}
