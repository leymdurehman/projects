package com.techelevator;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		
		
		

				// Create Scanner
				Scanner input = new Scanner(System.in);
		

				// Prompt the user to enter a decimal integer
				System.out.print("Please enter in a series of decimal values (separated by spaces):");
				
				String[] decimals = input.nextLine().split(" "); 
				
				int[] decimalInputs = new int[decimals.length]; 
				
		//		int decimalss = Integer.parseInt(decimals);

				// Convert the decimal number to a binary number
				
				
				//String binary = "";	// Holds the binary value
				
				for( int i = 0; i < decimals.length; i++) {
					
					decimalInputs [i] = Integer.parseInt(decimals[i]); 
				}
				
				//12 155 6
				String binary = "";
				
				for (int x= 0; x < decimalInputs.length; x++) {
					binary = "";
					for (int i = decimalInputs[x]; i > 0; i /= 2) {
					
						binary = (i % 2) + binary; 
					
					}
					System.out.println(decimalInputs[x] + " in binary is" + binary + ".");
				}

			}
	

	}
	