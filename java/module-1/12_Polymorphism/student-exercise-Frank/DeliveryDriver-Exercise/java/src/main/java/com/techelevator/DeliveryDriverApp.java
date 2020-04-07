package com.techelevator;

import java.util.ArrayList;
import java.util.Scanner;

public class DeliveryDriverApp {

	public static void main(String[] args) {

		DeliveryDriver driver1 = new FexEd();
		DeliveryDriver driver2 = new SPUFourDay();
		DeliveryDriver driver3 = new SPUTwoDay();
		DeliveryDriver driver4 = new SPUNextDay();
		DeliveryDriver driver5 = new PostalService3rdClass();
		DeliveryDriver driver6 = new PostalService2ndClass();
		DeliveryDriver driver7 = new PostalService1stClass();

		ArrayList<DeliveryDriver> carrier = new ArrayList<DeliveryDriver>();

		carrier.add(driver7);
		carrier.add(driver6);
		carrier.add(driver5);
		carrier.add(driver4);
		carrier.add(driver3);
		carrier.add(driver2);
		carrier.add(driver1);

		Scanner theKeyboard = new Scanner(System.in);

		System.out.println("Please enter the weight of the package?");
		int weight = theKeyboard.nextInt();
		theKeyboard.nextLine();
		System.out.println("-----------------------------------------------------------------------");

		System.out.println("(P)ounds or (O)unces?");
		String metric = theKeyboard.nextLine();
		System.out.println("-----------------------------------------------------------------------");

		if (metric.equals("P")) {
			weight = (weight * 16);
		} else if (metric.equals("O")) {
			weight += 0;
		}

		System.out.println("What distance will it be traveling?");
		int distance = theKeyboard.nextInt();
		System.out.println("-----------------------------------------------------------------------");

		System.out.println();
		System.out.print(String.format("%-30s", "Delivery Method"));
		System.out.print(String.format("%-25s", "$ cost"));
		System.out.println();
		System.out.println("-----------------------------------------------------------------------");

		for (DeliveryDriver service : carrier) {
			double rate = service.calculateRate(distance, weight);

			System.out.print(String.format("%-30s", service.getName()));
			System.out.print(String.format("%-25s", "$" + String.format("%.2f", rate)));
			System.out.println();
			theKeyboard.close();
		}

	}

}
