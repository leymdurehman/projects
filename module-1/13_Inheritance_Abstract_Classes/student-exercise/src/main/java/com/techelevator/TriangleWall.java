package com.techelevator;

public class TriangleWall extends Wall{

	private int height;
	private int base;
	private String color;
	private String name;

	public TriangleWall(String name, String color, int base, int height) {
		super(name, color);
	this.name = name;
	this.color = color;
	this.base = base;
	this.height = height;
	}

	@Override
	public int getArea() {
		int area = (this.base * this.height) / 2;
		
	
		return area;
	}

	public int getHeight() {
		return height;
	}

	public int getBase() {
		return base;
	}

	public String getColor() {
		return color;
	}

	public String getName() {
		return name;
	}
	
	public String toString() {
			
			
			
			String getString = new String(name + " (" + this.base + "x" + this.height+ ") " + "triangle");
			
			
			return getString;
		}	
}
