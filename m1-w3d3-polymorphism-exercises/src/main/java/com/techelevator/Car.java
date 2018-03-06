package com.techelevator;

public class Car implements Vehicle{
	


	private double distance;
	private boolean hasTrailer;
	
	

	public Car(boolean hasTrailer) {
		this.hasTrailer = hasTrailer;
	}
	
	
	public double calculateToll(double distance) {
		double toll = distance*0.020;
		if(hasTrailer) {
			toll = toll + 1.00;
		}
		return toll;
	}
	
	
	public double getDistance()
	{
		return distance;
	}

	public boolean hasTrailer() {
		return hasTrailer;
	}



	@Override
	public String getVehicleType()
	{
		if(hasTrailer) {
			return "Car+T";
		}
	
		return "Car";
	}

}
