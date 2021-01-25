package com.techelevator;

public class Airplane {
	
//	Instance variables
//	Attribute	Data Type	Get		Set			Description
	
//	planeNumber			string	X		The six-character plane number.
//	totalFirstClassSeats	int	X			The total number of first class seats.
//	bookedFirstClassSeats	int	X			The number of already booked first class seats.
//availableFirstClassSeats(derived)inX	The number of available first class seats.
//	totalCoachSeats			int	X			The total number of coach seats.
//	bookedCoachSeats		int	X			The number of already booked coach seats.
//availableCoachSeats(derived)intX			The number of available coach seats.

//	
	
	
//	Instance variables
	private	String planeNumber;
	private int totalFirstClassSeats;
	private int bookedFirstClassSeats;
	//private int availableFirstClassSeats; 
	private	int totalCoachSeats;
	private int bookedCoachSeats;
	//private	int availableCoachSeats;

// constructor

	
public Airplane( String planeNumber, int totalFirstClassSeats, int totalCoachSeats) {
	
	this.planeNumber = planeNumber;
	this.totalFirstClassSeats = totalFirstClassSeats;
	this.totalCoachSeats = totalCoachSeats;
	
	
}
	
	
	
// getters and setters
	
	
public	String getPlaneNumber () {
		
	return this.planeNumber;
	
}

public int getTotalFirstClassSeats() {
	
	return this.totalFirstClassSeats;
	
}

public int getBookedFirstClassSeats() {
	
	return this.bookedFirstClassSeats;
}


public int getAvailableCoachSeats() {       	/*  <---- derived property */
	

	
	return this.totalCoachSeats - this.bookedCoachSeats;
}


public int getAvailableFirstClassSeats() {  /*  <----- derived property */
	
	
	
	return this.totalFirstClassSeats - this.bookedFirstClassSeats;
} 

public	int getTotalCoachSeats() {
	
	return this.totalCoachSeats;
}

public int getBookedCoachSeats() {
	
	return this.bookedCoachSeats;
}


	public boolean reserveSeats(boolean forFirstClass, int totalNumberOfSeats) {

	if ( forFirstClass == true && (totalNumberOfSeats <= (this.totalFirstClassSeats - this.bookedFirstClassSeats))) {
	
		this.bookedFirstClassSeats = this.bookedFirstClassSeats + totalNumberOfSeats;
	
return true;
		
	} else if ( forFirstClass == false && (totalNumberOfSeats <= this.totalCoachSeats - this.bookedCoachSeats)) {
		
		this.bookedCoachSeats = this.bookedCoachSeats + totalNumberOfSeats;
		
		return true;		
	} else 								
		return false;
}
	
	
	
/*if totalNumberOfSeats > (bookedCoachSeats + bookedFirstClassSeats )) { */	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
