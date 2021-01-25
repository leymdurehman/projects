package com.techelevator;

public class HomeworkAssignment {
	
	// State  (data - member variables)
	
	private int possibleMarks;
	private int earnedMarks;
	private String submitterName;
	private String letterGrade; //derived
//	private final String[] aBCD = {
//		"A", "B", "C", "D", "F"							
//	};
/*
 * GETTERS AND SETTERS PROVIDE PUBLIC ACCESS TO THE PRIVATE MEMBER VARIABLES
 *  
 *  
 *  */
	
public int getPossibleMarks() {
	
	return this.possibleMarks;
	
}
	
public int getEarnedMarks() {
	
	return this.earnedMarks;
	
}
	
public void setEarnedMarks(int earnedMarks) {
	
	this.earnedMarks = earnedMarks;
	
}
	
public String getSubmitterName(){
	
	return this.submitterName;
}	


/*
 *  derived property -> a getter that instead of returning a member variable it returns a calculation taken from member variables
 *  */

public String getLetterGrade() {
		
	this.letterGrade = letterGrade;
	
	double gradeCalc = (((double)this.earnedMarks / (double)this.possibleMarks) * 100);
	
	System.out.println(gradeCalc);
	
	if (gradeCalc >= 90){
		return this.letterGrade = "A";
	
	} else if ( gradeCalc >= 80 && gradeCalc < 90 ) {
	return this.letterGrade = "B";
		
	} else if ( gradeCalc >= 70 && gradeCalc < 80 ) {
	return this.letterGrade = "C";
	
	} else if ( gradeCalc >= 60 && (gradeCalc) < 70 ) {
	return this.letterGrade = "D";
	
	} else {
	return	this.letterGrade = "F";
	
	}
	
}	
	


// Instantiate the class w the constructor - 

public HomeworkAssignment(int possibleMarks, String submitterName) {
	//this.earnedMarks
	this.possibleMarks = possibleMarks;
	this.submitterName = submitterName;
}
//getLetterGrade(possibleMarks);
	
	



	
}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

