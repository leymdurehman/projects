package com.techelevator.shapes;

public class Rectangle {
	
	// State
	
	
	private int length;			// these are
	private int width;			//	member variables  - they maintain the state of the class
	
	
	/*  How to instantiate aRectangle Object (how to build a Rectangle)
					// make a constructor method 
	// the no argument default constructor is implicitly used by java unless an
	explixit constructor is set. meaning, if this is the only constructor needed, then it doesnt need to be selectes
	
	public Rectangle() {}
	
	String s = new String("")
	String s2 = new String(new char[4])
	
	*/
	public Rectangle() {}
	
	public Rectangle(int length, int width) {
		
		this.length = length;
		this.width = width;
		
		
		
	}
	
	// Behavior
	//public methods provide the way others use the object
	
	public boolean isLargerThan(Rectangle other) {
		
		return this.getArea() > other.getArea();
	}
	
	@Override 
	// to assure its the proper object type in this case : Rectangle
	
	public boolean equals(Object other) {
		Rectangle otherRectangle = (Rectangle)other;
		return (otherRectangle.getLength() == this.length && otherRectangle.getWidth() == this.width);
		
	}
	
	@Override
	public String toString() {
		
		return this.width + "x" + this.length + "-" + this.getArea(); 
	
	}	
	
	public boolean isLargerThan ( int otherWidth, int otherLength) {
		
		return this.getArea() > (otherWidth * otherLength);
		
		
		
	}
	//
	
	public int getLength() {
		
		return this.length;
		
	}
	
	public int getWidth() {
		
		return this.width;
	}
	
	// Setter provides access to publically set the value of a member variable -- "void" will not return data - it does work!
	
	public void setLength(int length) {
		
		
		this.length = Math.abs(length);
		
	}	
	
	public void setWidth(int width) {
		
		this.width = Math.abs(width);
		
		
	}
	
	
/* A derivd property is one that is calculated as needed
		it is not sotred as a member variable, but is calculcated (derived) from
also getters and setters are the properties of class-		^ exsisting member variable */
	
	public int getArea() {
		
		return this.width * this.length;
	}

	//behavior  -- methods/functions (setters and getters are methods)
	// - methods should be short ( 10 lines or less - but this is v small)
	
	
	
	
	
	
	
	
	

}
