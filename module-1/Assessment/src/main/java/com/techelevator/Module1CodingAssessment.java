package com.techelevator;

import java.util.Scanner;

public class Module1CodingAssessment {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); 
	
	//Before Stay	
		
		
		System.out.print("Enter name: ");
		String customerName = input.nextLine();
		System.out.print("Enter how many nights: ");
		int customerNights = input.nextInt();
		
	HotelReservation customerInfo = new HotelReservation(customerName, customerNights);	
		
	System.out.println("Here is your Reservation info: " + customerInfo.toString());	
	input.nextLine();
	// After Stay
	
	System.out.print("Did you use the Minibar? Y or N: ");
	String miniBarUsed = input.nextLine();
	
	
	System.out.println("Does room require cleaning? Y or N: ");	
	String cleaningReq = input.nextLine();
	
	if (miniBarUsed == "Y") {
		
	System.out.print("Your actual Total is: " + customerInfo.getEstimatedTotal()+ getActualTotal(false, true));
	
	} else if (cleaningReq == "Y") {
		
		
	System.out.print("Your actual Total is: " + customerInfo.getEstimatedTotal()+ getActualTotal(true, false));
	
	} else if (miniBarUsed == "Y" && cleaningReq == "Y") {
		
		
	System.out.print("Your actual Total is: " + customerInfo.getEstimatedTotal()+ getActualTotal(true, true));
		
	}	else {
		
		System.out.print("Your actual Total is:  " + (customerInfo.getEstimatedTotal()+ getActualTotal(false, false)));	
	}
	}

	

	
public static double getActualTotal(boolean requiresCleaning, boolean usedMinibar) {
	
	
	double totalFee = 0;
	
	if (requiresCleaning == true && usedMinibar == false) {
		
		return totalFee += 34.99; 
	
	} else if (requiresCleaning == false && usedMinibar == true) {
		
		return	totalFee += 12.99; 
		
	} else if (requiresCleaning == true && usedMinibar == true) {
	
	return	totalFee += 47.98;
		
	}
	return 0;
	
}
	
	
	
	
	
	
	
	
	
	
	
	
}
