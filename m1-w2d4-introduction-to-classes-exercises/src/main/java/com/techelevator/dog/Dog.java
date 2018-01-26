package com.techelevator.dog;

public class Dog {

	//Instance varriables
	private boolean sleeping;
	
	//Getters & Setters
	public boolean isSleeping() {
		return sleeping;
	}
	
	
	
	//Instance methods - may make use of instance variables
	public String makeSound() {
		if (sleeping) {
			return "Zzzzz...";
		}else {
			return "Woof!";
		}
	}
	
	public void sleep() {
		sleeping = true;
	}
	
	public void wakeUp() {
		sleeping = false;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
