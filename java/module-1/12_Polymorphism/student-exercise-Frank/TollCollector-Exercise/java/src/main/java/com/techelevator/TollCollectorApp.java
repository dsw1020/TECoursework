package com.techelevator;



import java.util.ArrayList;
import java.util.Random;

public class TollCollectorApp {

	public static void main(String[] args) {
		
		Vehicle truck1 = new Truck (4);
		Vehicle truck2 = new Truck (6);
		Vehicle truck3 = new Truck (8);
		Vehicle car1 = new Car(false);
		Vehicle car2 = new Car(true);
		Vehicle tank = new Tank();
		
		ArrayList <Vehicle> transport = new ArrayList <Vehicle>();
		
		transport.add(tank);
		transport.add(car2);
		transport.add(car1);
		transport.add(truck3);
		transport.add(truck2);
		transport.add(truck1);
		
		int totalMilesTraveled = 0;
		double totalRevenueCollected = 0.0;
		
		Random num = new Random();	
		
		System.out.print(String.format("%-30s", "Vehicle"));	
		System.out.print(String.format("%-25s", "Miles"));
		System.out.print(String.format("%-10s", "Toll $"));
		System.out.println();
		System.out.println("-----------------------------------------------------------------------");
		
		
		for (Vehicle vehicle : transport) {
			int distance = (num.nextInt(230) + 10);
			double revenue = vehicle.calculateToll(distance);
			
		
		
		System.out.print(String.format("%-30s", vehicle.getType()));
		System.out.print(String.format("%-25s", Integer.toString(distance)));
		System.out.print(String.format("%-10s", "$" + String.format("%.2f", revenue)));
		
		System.out.println();

		totalMilesTraveled += distance;
		totalRevenueCollected += revenue;
		
		

}
System.out.println();
System.out.print("Total Miles: \t" + totalMilesTraveled + "\n");
System.out.print("Total Tollbooth Revenue: \t" + "$" + String.format("%.2f", totalRevenueCollected));


	}

}
