package com.techelevator;

import java.util.Random;

public class Main
{
	public static void main(String[] args) {
		
	
	Random randomDistance = new Random();

	int n = randomDistance.nextInt(231) + 10;
	
	Car testCar = new Car();
	System.out.println(testCar.calculateToll(n));
	
	}
}
