package com.techelevator;

import java.util.Scanner;

public class CatPackingCalcuator {
	/* 1.Take user input	
	
	 * 2.
	 * 3.
	 * 
	 */

	public static void main(String[] args) {
		
		double averageVolumeOfHouseCat = 0.083;
		double estimatePackingDensityOfCat = 0.5;
		
		
		
		Scanner input = new Scanner( System.in );
		
		System.out.print("What is the length of the containter in feet:");
		String lengthOfContainer = input.nextLine();
		double containerLengthInFeet = Double.parseDouble(lengthOfContainer);
		
		System.out.print("What is the width of the containter in feet:");
		String widthOfContainer = input.nextLine();
		double containerWidthInFeet = Double.parseDouble(widthOfContainer);
		
		System.out.print("What is the height of the containter in feet:");
	    String  heightOfContainer = input.nextLine();
	    double containerHeightInFeet = Double.parseDouble(heightOfContainer);
	   
	    double containerVolume =  containerLengthInFeet
	    						* containerWidthInFeet
	    						* containerHeightInFeet;
	    
	    double catsByVolume = containerVolume / averageVolumeOfHouseCat;
	    double packedCats = catsByVolume * estimatePackingDensityOfCat;
	    double catsInBox = packedCats * containerVolume;
	    System.out.println(catsInBox);	
	    
		System.out.printf("%-15s %-15s %-15s %-25s %n" ,"Height", "Width", "Length","Cats in Box");
		System.out.println("----------------------------------------------------------------------");
		System.out.printf("%-15s %-15s %-15s %-25s" ,containerLengthInFeet, containerWidthInFeet, containerHeightInFeet, catsInBox);
	}	
}


