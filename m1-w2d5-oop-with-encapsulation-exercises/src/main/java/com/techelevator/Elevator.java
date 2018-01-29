package com.techelevator;

public class Elevator
{

	private int currentFloor = 1;
	private int numberOfFloors;
	private boolean doorOpen;
	private int totalNumberOfFloors;

	// Constructor -uses 'this.'
	public Elevator(int totalNumberOfFloors)
	{
		this.totalNumberOfFloors = totalNumberOfFloors;
	}

	
	// Methods

	public void openDoor()
	{
		doorOpen = true;
	}

	public void closeDoor()
	{
		doorOpen = false;
	}

	public void goUp(int desiredFloor)
	{
		if (doorOpen == false && desiredFloor <= totalNumberOfFloors && desiredFloor > currentFloor)
		{
			currentFloor = desiredFloor;

		}
	}

	public void goDown(int desiredFloor)
	{
		if (doorOpen == false && desiredFloor > 0 && desiredFloor < currentFloor)
		{
			currentFloor = desiredFloor;
		}

	}

	public int getCurrentFloor()
	{
		return currentFloor;
	}

	public int getNumberOfFloors()
	{
		return numberOfFloors = totalNumberOfFloors;
	}
	
	public boolean isDoorOpen()
	{
		if (doorOpen == true)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
