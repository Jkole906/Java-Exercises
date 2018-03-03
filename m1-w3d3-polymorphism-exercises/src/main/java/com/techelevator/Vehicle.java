package com.techelevator;

public interface Vehicle
{
	// Each vehicle *TYPE* has there own logic for calculating tolls
	// This method here just lets those the implement in and 
	// those that call on it know what the other is saying
	public double calculateToll(double distance);

	// Specifies car, truck, tank, etc.
	// *Do not lock this in to one type*
	// *Generalized logic allows for more types to be added later*
	String getVehicleType();

}
