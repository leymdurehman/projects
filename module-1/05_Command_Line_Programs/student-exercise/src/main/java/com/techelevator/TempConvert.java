package com.techelevator;

import java.util.Scanner;

public class TempConvert {
	
	

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner( System.in );
		
		
		System.out.print("Please enter the temperature:");
		String numInput = input.nextLine();
		double numAmount = Double.parseDouble(numInput);
		
		System.out.print("Is the temp in (C), or (F):");
		String tempInput = input.nextLine();
		
			if ( tempInput.equals("F")) {
				
				double celsius = (numAmount - 32) / 1.8;
				
				int celsiusC = (int) celsius;
				int tempAmt = (int) numAmount;
				
					System.out.printf( celsiusC + " C is " + tempAmt + "F."); }
			
		   else if  ( tempInput.equals("C")) {
				
				double fahrenheit = numAmount * 1.8 + 32;
				
				int fahrenF = (int) fahrenheit;
				int tempAmt = (int) numAmount;
				
					System.out.printf( fahrenF + " F is " + tempAmt + "C.");
			}
		
		
		
		//double tenderedAmount = Double.parseDouble(tenderedInput);
		
	
		
		
//		
//		
//		
//		
//		double changeAmount = (tenderedAmount - billAmount);
//		
//		System.out.printf("%s %s %.2f", "The change required is", "$", changeAmount);
//		
//		
//		
//		
//		
		
		
		
		
	}
		

	}


