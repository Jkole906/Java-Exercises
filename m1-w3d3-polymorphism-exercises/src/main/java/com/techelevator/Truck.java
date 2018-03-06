package com.techelevator;

import java.util.Random;

public class Truck implements Vehicle
{
private int axleCount;
	
	public Truck(int axleCount) {
		this.axleCount = axleCount;
	}
	
	public int getAxles() {
		//Put this in the main method?
//		int[] intArray =
//		{ 4, 6, 8 };
//		int axles = new Random().nextInt(intArray.length);
//		int axleCount = intArray[axles];
		return axleCount;
	}
	
	
	//Imported methods 
	@Override
	public double calculateToll(double distance)
	{
		if (axleCount >= 8) {
			return distance*0.048;
		}
		else if (axleCount >= 6) {
			return distance*0.045;
		}
		else {
			return distance*0.040;
		}
	}
	

	@Override
	public String getVehicleType()
	{
		return "Truck";
	}

}
