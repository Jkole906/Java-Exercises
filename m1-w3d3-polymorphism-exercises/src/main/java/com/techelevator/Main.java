package com.techelevator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main
{
	public static void main(String[] args)
	{		

		int[] intArray =
		{ 4, 6, 8 };
		int axles = new Random().nextInt(intArray.length);
		int axleCount = intArray[axles];


		List<Vehicle> testVehicles = new ArrayList<>();
		testVehicles.add(new Car(false));
		testVehicles.add(new Car(true));
		testVehicles.add(new Tank());
		testVehicles.add(new Truck(axleCount));


		int totalMiles = 0;
		double totalToll = 0;
		System.out.println("Vehicle\t\tDistance Traveled\t\tToll$");
		System.out.println("-----------------------------------------------------");
		Random rnd = new Random();
		rnd.setSeed(System.currentTimeMillis());
		for (Vehicle vehicle : testVehicles)
		{
			int distance = rnd.nextInt(230) + 10;
			double toll = vehicle.calculateToll(distance);
			System.out.println(vehicle.getVehicleType() + "\t\t" + distance + "\t\t\t\t$" + String.format("%.2f", toll));
			totalMiles += distance;
			totalToll += toll;
		}
		System.out.println();
		System.out.println("Total Miles: " + totalMiles);
		System.out.println("Total Toll: " + "$" + String.format("%.2f", totalToll));
		System.out.println();
	}

}
