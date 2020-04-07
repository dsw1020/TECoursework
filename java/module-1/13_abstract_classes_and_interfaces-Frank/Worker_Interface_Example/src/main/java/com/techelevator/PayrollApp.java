package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class PayrollApp {

	public static void main(String[] args) {

		SalaryWorker goofy = new SalaryWorker("George", "Geef", 52);

		System.out.println(
				goofy.getFirstName() + " " + goofy.getLastName() + " makes $" + goofy.calculatePay(90) + " per week");

		VolunteerWorker Jason = new VolunteerWorker("Jason", "Bush");

		System.out.println(
				Jason.getFirstName() + " " + Jason.getLastName() + " makes $" + Jason.calculatePay(90) + " per week");

		List<Worker> employees = new ArrayList<Worker>();
		// make sure to only import the java.util setting not the .awt

		employees.add(Jason); // add objects of classes that implement and interface to a Collection of the
								// interfaces
		employees.add(goofy);

		for (Worker employee : employees) {

		}

	}
}
