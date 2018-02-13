package com.techelevator;

public class KataFizzBuzz {
	
	
	
	
	
		public String fizzBuzz(Integer n) {
			
			for(int i = 1; i < 101; i++) {
				if(i % 5 == 0 &&  i % 3 == 0) {
					return "FizzBuzz";
				}
				else if(i % 5 == 0) {
					return "Buzz";
				}else if( i % 3 == 0){
					return "Fizz";
				}else {
					return String.valueOf(n);
				}	
			}
		}
		