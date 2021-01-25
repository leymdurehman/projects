package com.techelevator;

public class FruitTree {

	
//	instance variables / properties / attributes -- add 'state' to the class
	// each one keeps track of its own separate state
	
	
private String typeOfFruit;
private int piecesOfFruitLeft;





//constructor initializes an object of that class - so it can be used 
//		- Instantiates the args it can take -- defaults to no args if no constructor is defined

public FruitTree(String typeOfFruit, int startingPiecesOfFruit) {
	
	this.typeOfFruit = typeOfFruit;
	this.piecesOfFruitLeft = startingPiecesOfFruit;


}


//methods - getters and setters



	public String getTypeOfFruit() {
	
		this.typeOfFruit = typeOfFruit;
	
		return this.typeOfFruit;
	
	
}
	public int getPiecesOfFruitLeft() {
		
		this.piecesOfFruitLeft = piecesOfFruitLeft;
		
		return this.piecesOfFruitLeft;
   
	}
	
	
// this is a derived property ? or 	
	public boolean pickFruit( int numberOfPiecesToRemove) {
		
		if (piecesOfFruitLeft >= numberOfPiecesToRemove) {
			
			piecesOfFruitLeft = piecesOfFruitLeft - numberOfPiecesToRemove;
			
			return true;
			
		} else 
			
			return false;
		
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
