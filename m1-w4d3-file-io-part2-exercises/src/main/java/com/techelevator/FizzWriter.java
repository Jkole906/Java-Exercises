package com.techelevator;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class FizzWriter {

	public static void main(String[] args) throws IOException {

		String fileName = null;
		File fizzBuzzFolder = new File(fileName, "FizzBuzz.txt");
		//^ Creates file OBJECT 
		fizzBuzzFolder.createNewFile();
		//^ Creates actual file to store information created by procces
		try(PrintWriter writer = new PrintWriter(fizzBuzzFolder)){
			for( int i = 1; i <=300; i++) {
				if(i % 5 == 0 && i % 3 == 0) {
					writer.println("FizzBuzz");
				} else if(i % 5 == 0){
					writer.println("Buzz");
				}else if(i % 3 == 0) {
					writer.println("Fizz");
				}else {
					writer.println(i);
				}
			}
		}
		
		
		
	}

}
