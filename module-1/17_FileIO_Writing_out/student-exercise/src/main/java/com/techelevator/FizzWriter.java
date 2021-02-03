package com.techelevator;


import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;



public class FizzWriter {

	public static void main(String[] args) throws IOException {

		File fizzBuzzTextFile = new File("FizzBuzz.txt");
		fizzBuzzTextFile.createNewFile();	
		
		
		try ( PrintWriter printWriter = new PrintWriter( fizzBuzzTextFile ); 
			BufferedWriter bufferedWriter = new BufferedWriter(printWriter)) {
				for (int i = 1 ; i <= 300 ; i++) {	
					if (i < 300) {
					bufferedWriter.write(getResult(i) + "\n" );
					} else
					bufferedWriter.write(getResult(i));
			}
		}
	
		System.out.println("FizzBuzz.txt has been created.");
	}
	
	

	
	private static String getResult(int num) {
		
		String output = String.valueOf(num);
		
		if (num % 3 == 0 && num % 5 == 0 ) {
			output = "FizzBuzz"; 
	
			} else if (num % 3 == 0 || output.contains("3") && num % 5 != 0 ) {
			output = "Fizz";
	
			} else if (num % 5 == 0 || output.contains("5") && num % 3 != 0) {
			output = "Buzz";
	
	}
	 return output;
	}
	
}


