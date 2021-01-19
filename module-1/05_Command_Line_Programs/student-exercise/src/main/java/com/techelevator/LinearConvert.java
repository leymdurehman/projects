package com.techelevator;

import java.util.Scanner;

public class LinearConvert {

	public static void main(String[] args) {

				
				
				Scanner input = new Scanner( System.in );
				
				
				System.out.print("Please enter the length:");
				String numInput = input.nextLine();
				double numAmount = Double.parseDouble(numInput);
				
				System.out.print("Is the measurement in (m)eter, or (f)eet?");
				String measureInput = input.nextLine();
				
					if ( measureInput.equals("f")) {
						
						double meters = (numAmount * 0.3048);
						
						int metersFinal = (int) meters;
						int feetFinal = (int) numAmount;
						
							System.out.printf( feetFinal + "f is " + metersFinal + "m."); }
					
				   else if  ( measureInput.equals("m")) {
						
						double feet = (numAmount * 3.2808399);
						
						Math.round(feet); // rounds to nearest integer
						
						int feetFinal = (int) feet;
						int metersFinal = (int) numAmount;
						
						
						
							System.out.printf( metersFinal + " m is " + feetFinal + "f.");
					}
				
		
		
		
		
		
		
		

	}

}
