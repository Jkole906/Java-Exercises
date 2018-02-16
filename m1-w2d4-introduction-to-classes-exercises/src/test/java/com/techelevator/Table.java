package com.techelevator;

public class Table
{

	private int heightInInches;
	private int widthInInches;
	private int legs;
	private String wood;
	
	public Table(int heightInInches, int widthInInches, int legs, String wood) {
		this.heightInInches = heightInInches;
		this.widthInInches = widthInInches;
		this.legs = legs;
		this.wood = wood;
	
	}
}

	Table desk = new Table(30, 40, 4, "Rich mahogony");
	