package com.techelevator;

public class RectangleWall extends Wall{

protected int length;
protected int height;
private String name;
private String color;

public int getLength() {
	return this.length;
}


public int getHeight() {
	return this.height;
}


public String getName() {
	return name;
}


public String getColor() {
	return color;
}
//		
//	public RectangleWall(String name, String color) {
//		super(name, color); 
//	}

	
	public RectangleWall(String name, String color, int length, int height) {
		super(name, color);
		this.length = length;
		this.height = height;
		this.name = name;
		this.color = color;
	}


	@Override
	public int getArea() {
		
		return this.length*this.height;
	}
	
	public String toString() {
		
		//int i = (this.length * this.height);
		
		String getString = new String(name + " (" + this.length + "x" + this.height+ ") " + "rectangle");
		
		
		return getString;
	}	

		
}



	
	
	
	


