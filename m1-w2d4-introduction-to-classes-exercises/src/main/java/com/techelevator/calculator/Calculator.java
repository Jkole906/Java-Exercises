package com.techelevator.calculator;

public class Calculator {

	private int currentValue;

	
	public Calculator() {
		
	}
	
	public int add(int addend) {
		currentValue = addend+currentValue;
		return currentValue;
		
	}
	public int multiply(int multiplier) {
		currentValue = multiplier*currentValue;
		return currentValue;
	}
    public int subtract(int subtrahend) {
    	
    }
    public int power(int exponent) {
    	
    }
    public void reset() {
    		currentValue = 0;
    }
	
	
	
	
	
	public int getCurrentValue()
	{
		return currentValue;
	}
	
	
	
	
	
	
}
