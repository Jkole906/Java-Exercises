package com.techelevator.person;

public class Person{
	
	//Below are PRIVATE instance variables
	//THESE ARE ALMOST ALWAYS PRIVATE---
	
	private String firstName;
	private String lastName;
	private int age;
	
	//BELOW IS THE CONSTRUCTOR
	//Note that the name is the same as the class, AND there 
	//is nothing between it and "public"
	
	//Below is a 'empty/default' CONSTRUCTOR,the () are empty AND the [] block is empty, it assumes 
	//the user will give it all the information it needs with setters.
	
	public Person() {
		
	}
	//This would work
	Person bob = new Person()
	// But they would have to have getters and setters to
	//fill in the lastName/firstName/age bits later
			

	//Below if a full constructor that will only objects that have data for all 
	//the parameters between the ()
	public Person(String lastName, String firstName) {
	this.lastName = lastName;
	this.firstName = firstName;
	}
	
	Person bob = new Person("Smith", "Bob");
	//this would work BUT, if one wanted to set age, they would need to have a setter for it.
	//Like so:
	
	public void setAge(int age) {
		this.age = age; 
	}
	//Note, the "void" because it just SETS a value, it doesn't actually send/return anything
	
	
	
	
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