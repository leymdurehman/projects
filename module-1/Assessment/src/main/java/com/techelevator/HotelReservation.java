package com.techelevator;

public class HotelReservation {

	
private String name;

private int numberOfNights;

private double estimatedTotal;
	
	
public HotelReservation(String name, int numberOfNights) {
	
	this.name = name;
	this.numberOfNights = numberOfNights;
	
	
	
}


public String getName() {
	return this.name;
}


public int getNumberOfNights() {
	return this.numberOfNights;
}


public double getEstimatedTotal() {
	
	double estimatedTotal = numberOfNights * (59.99);
	
	return estimatedTotal;
}	
	
public String toString() {

	String name = this.getName().toString();
	String getEstimatedTotal = Double.toString(this.getEstimatedTotal());
	

	return "RESERVATION - {" + name + "} - {"+ getEstimatedTotal + "}";
	
	
	
}	
}
