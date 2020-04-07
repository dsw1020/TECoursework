package com.techelevator;

public class TellerMachine {
	
	/************************************************************************************************
	 * Attributes
	 ***********************************************************************************************/
	
	
	private String manufacturer;
	private double deposits;
	private double withdrawls;
	private double balance;
	
	/************************************************************************************************
	 * Constructor
	 ***********************************************************************************************/
	
	public TellerMachine(String manufactuer, double deposits, double withdrawls) {
		this.manufacturer = manufactuer;
		this.deposits = deposits;
		this.withdrawls = withdrawls;
		
	}
	
	/************************************************************************************************
	 * Getters
	 ***********************************************************************************************/
	
	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public double getDeposits() {
		return deposits;
	}

	public void setDeposits(double deposits) {
		this.deposits = deposits;
	}

	public double getWithdrawls() {
		return withdrawls;
	}

	public void setWithdrawls(double withdrawls) {
		this.withdrawls = withdrawls;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	
	
	
	/************************************************************************************************
	 * Methods
	 ***********************************************************************************************/
	
	
	

}
