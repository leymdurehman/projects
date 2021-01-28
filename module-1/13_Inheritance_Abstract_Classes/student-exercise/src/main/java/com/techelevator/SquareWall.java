package com.techelevator;

public class SquareWall extends RectangleWall {
	//private int height;
	//private int length;
	private String name;
	private String color;
	private int sideLength;
	//public SquareWall(String name, String color, int length, int height, int sideLength) {
		
	// }
	//@Override	
	public SquareWall(String name, String color, int sideLength) {
		super(name, color, sideLength, sideLength);
			this.name = name;
			this.color = color;
			this.sideLength = sideLength;
		}	
		
		
	
	

	public String getName() {
		return this.name;
	}
	public String getColor() {
		return this.color;
	}
	public int getSideLength() {
		return this.sideLength;
	}
	
	public int getArea() {
		
		return this.sideLength*this.sideLength;
		
	}
@Override
public String toString() {
		
		
		
		String getString = new String(name + " (" + this.sideLength + "x" + this.sideLength+ ") " + "square");
		
		
		return getString;
	}	

	
	
	
	
}
