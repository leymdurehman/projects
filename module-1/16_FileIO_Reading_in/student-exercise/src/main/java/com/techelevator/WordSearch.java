package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordSearch {
	
	private static final Scanner userInput = new Scanner(System.in);
	

	public static void main(String[] args) throws FileNotFoundException {
	
		
		
		
		
		System.out.println("What is the file that should be searched?");
		String pathToFile = userInput.nextLine();
		File file = new File(pathToFile);
		
		
		
		
		System.out.println("What is the search word you are looking for?");
		String wordToSearch = userInput.nextLine();
			
			System.out.println("Should the search be case sensitive? (Y\\N)");
			String caseSensitive = userInput.nextLine();
			if(caseSensitive.contentEquals("N")) {
				
				
				
				try (Scanner textReader = new Scanner(file)) {
					
					String wordToSearchUpperCase = wordToSearch.toUpperCase().substring(0, 1) + wordToSearch.toLowerCase().substring(1);	
					String wordToSearchLowerCase = wordToSearch.toLowerCase();	
					System.out.println(wordToSearchUpperCase);
					System.out.println(wordToSearchLowerCase);
					
					int lineNumber = 0;
					
					while( textReader.hasNextLine()) {
						
						String nextLineOfFile = textReader.nextLine();
						lineNumber++;
						
						int wordToSearchLength = wordToSearchUpperCase.substring(0).length();
						if (nextLineOfFile.contains(wordToSearchUpperCase.substring(0)) || (nextLineOfFile.contains(wordToSearchLowerCase.substring(0)))) {
							System.out.println( lineNumber + ")"  + nextLineOfFile);
					}
					
				}
					}

	} 				else if (caseSensitive.contentEquals("Y")) {
			
					try (Scanner textReader = new Scanner(file)) {
	
			
						int lineNumber = 0;
						
						while( textReader.hasNextLine()) {
					
							String nextLineOfFile = textReader.nextLine();
							lineNumber++;
							int wordToSearchLength = wordToSearch.substring(0).length();
							
								if (nextLineOfFile.contains(wordToSearch.substring(0)) && wordToSearch.substring(0).length() == wordToSearchLength) {
								System.out.println( lineNumber + ")"  + nextLineOfFile);
							}
				
						}
					}	
			}	
			
//		try (Scanner textReader = new Scanner(file)) {
//			
//			int lineNumber = 0;
//			while( textReader.hasNextLine()) {
//				
//				String nextLineOfFile = textReader.nextLine();
			//	lineNumber++;
			//	if (nextLineOfFile.contains(wordToSearchToUpperCase.substring(0,1) {}
//				System.out.println(( lineNumber + ")"  + nextLineOfFile));
//					}
//			}
//
//		System.out.println("What is the search word you are looking for?");
//		String wordToSearch = userInput.nextLine();
//		
		
//		try (Scanner wordInput = new Scanner(file)) {
//			while( wordInput.hasNextLine() && lineNumber < 5000 ) {
//				
//				String nextLineOfFile = textReader.nextLine();
//				lineNumber++;
//				
//				System.out.println(( lineNumber + ")"  + nextLineOfFile.toUpperCase()));
//					}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
}
	
	

