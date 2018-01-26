package com.techelevator.company;

public class Company {

	
	//Instance varriables

	private String name;
	private int numberOfEmployees;
	private double revenue;
	private double expenses;
	
	
	//Getters & Setters
	public String getName() {
		return name;
	}
	public void setName(String newName) {
		name = newName;
	}
	public int getNumberOfEmployees() {
		return numberOfEmployees;
	}
	public void setNumberOfEmployees(int newNumberOfEmployees) {
		numberOfEmployees = newNumberOfEmployees;
	}
	public double getRevenue()
	{
		return revenue;
	}
	public void setRevenue(double revenue)
	{
		this.revenue = revenue;
	}
	public double getExpenses()
	{
		return expenses;
	}
	public void setExpenses(double expenses)
	{
		this.expenses = expenses;
	}
	
	
	
	//Instance methods
	public String getCompanySize() {
		if(numberOfEmployees <= 50) {
			return "small";
		}else if(numberOfEmployees >= 51 && numberOfEmployees <= 250) {
			return "medium";
		}else {
			return "large";
		}
		
	}
	public double getProfit() {
		return (revenue - expenses);
	}
	
	
	
	
	
	
	
	
	
	
}
