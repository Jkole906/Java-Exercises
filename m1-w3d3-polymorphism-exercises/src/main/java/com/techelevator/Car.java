package com.techelevator;

public class Car implements Vehicle{
	


	private double toll;
	private double distance;
	private boolean trailer;
	
	
	
	public double calculateToll(double distance) {
		distance = distance*0.020;
		if(setTrailer(true)) {
			toll = toll + 1.00;
		}
		return distance;
	}
	
	
	public double getDistance()
	{
		return distance;
	}

	public boolean isTrailer()
	{
		return trailer;
	}


	public boolean setTrailer(boolean trailer)
	{
		this.trailer = trailer;
		return trailer;
	}

}
