package com.techelevator;

import java.util.Scanner;


public class HelloworldTest {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.print("Whats your name? ");
		String name = input.nextLine();
		
		System.out.println("Hello, " + name + "! Nice to meet you!");

	
	
	}
	
}
