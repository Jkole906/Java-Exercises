package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordSearch {

	public static void main(String[] args) throws FileNotFoundException {
		
		int lineCount = 0;
		
		File inputFile = getInputFileFromUser();
		Scanner userInput = new Scanner(System.in);
		System.out.print("Enter word to search for.");
		String searchedWord = userInput.nextLine();
		try(Scanner fileScanner = new Scanner(inputFile)) {
			while(fileScanner.hasNextLine()) {
				String line = fileScanner.nextLine();
				lineCount++;
				if(line.contains(searchedWord)) {
					System.out.println(lineCount+") " + line);
				}
			}
				
			
			//System.out.println(); 
		}
}
		
		
		@SuppressWarnings("resource")
		private static File getInputFileFromUser() {
			Scanner userInput = new Scanner(System.in);
			System.out.print("Please enter path to input file >>> ");
			String path = userInput.nextLine();
			
			File inputFile = new File(path);
			if(inputFile.exists() == false) { // checks for the existence of a file
				System.out.println(path+" does not exist");
				System.exit(1); // Ends the program
			} else if(inputFile.isFile() == false) {
				System.out.println(path+" is not a file");
				System.exit(1); // Ends the program
			}
			return inputFile;
		}
	
	}