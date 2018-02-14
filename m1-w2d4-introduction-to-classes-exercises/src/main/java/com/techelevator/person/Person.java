package com.techelevator.person;

public class Person{
	
	//Below are PUBLIC instance variables, anyone can get the 
	//information in them(Which is empty here?) but I'm not sure if ofther
	//methods can actually change the values in them.
	//THESE ARE ALMOST ALWAYS PRIVATE---
	
	private String firstName;
	private String lastName;
	private int age;
	
	//BELOW IS THE CONSTRUCTOR
	//Note that the name is the same as the class, AND there 
	//is nothing before it
	
//	
//	public Person(String lastName, String firstName) {
//	this.lastName = lastName;
//	this.firstName = firstName;
//	}

	
	
	//Methods
	public String getFullName(){
		return lastName + ", " + firstName;
	}
	
	public boolean isAdult() {
		if(age >= 18) {
			return true;
		}else {
			return false;
		}
	}
	
	
	
	//Getters & Setters
	public String getFirstName()
	{
		return firstName;
	}
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	public String getLastName()
	{
		return lastName;
	}
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
	public int getAge()
	{
		return age;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
	
	
	
	
	
	
	
	
	
	
}