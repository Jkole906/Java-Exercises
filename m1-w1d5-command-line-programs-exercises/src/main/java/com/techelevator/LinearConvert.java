package com.techelevator;

import java.util.Scanner;

/*
 The foot to meter conversion formula is:
 	m = f * 0.3048
 	
 The meter to foot conversion formula is:
 	f = m * 3.2808399
 	
 Write a command line program which prompts a user to enter a length, and whether the measurement is in 
 (m)eters or (f)eet.
 Convert the length to the opposite measurement, and display the old and new measurements to the console.
  
 $ java LinearConvert
 Please enter the length: 58
 Is the measurement in (m)eter, or (f)eet? f
 58f is 17m.
 */

public class LinearConvert {

	public static void main(String[] args) {
		//I understand this first section.
		Scanner input = new Scanner(System.in);
		System.out.print("Enter length:");
		String userGivenLength = input.nextLine();
		System.out.print("Enter length type in meters or feet: ");
		String userGivenType = input.nextLine();
		
		
		//This nest half I understand much less
		
		
		double userGivenLengthAsDouble = Double.parseDouble(userGivenLength);
		char givenType = userGivenType.charAt(0);
		if(givenType == 'f') {
			System.out.print(userGivenLengthAsDouble * 0.3048 + "m");
		}else if(givenType == 'm') {
				System.out.print(userGivenLengthAsDouble * 3.2808399 + "f");
		}else {
			System.out.print("ERROR! YOU MESSED UP!");
		}	
	}
}
	
