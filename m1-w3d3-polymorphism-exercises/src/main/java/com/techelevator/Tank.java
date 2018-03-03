package com.techelevator;

public class Tank implements Vehicle
{

	
	
	
	
	
	
	//Imported methods
	@Override
	public double calculateToll(double distance)
	{
		// Because tanks do not pay a toll, this only needs to return 0
		return 0;
	}

	@Override
	public String getVehicleType()
	{
		return "Tank";
	}

}
