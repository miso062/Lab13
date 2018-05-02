package edu.handong.csee.java.lab13.prob3;

// class Rectangle that inherited the Shape
public class Rectangle extends Shape {
	
	private double length;
	private double width;
	
	// Constructor that set the Rectangle's length and width.
	public Rectangle(double length, double width)
	{
		// set the entered length, width to Rectangle's length, width.
		this.length = length;
		this.width = width;
	}
	
	// method that calculate and return the area
	public double area()
	{
		return length * width;
	}
	
	// method that calculate and return the perimeter 
	public double perimeter()
	{
		return 2*(length+width);
	}
	
	// method that get length
	public double get_Length()
	{
		return length;
	}
	
	// method that get width
	public double get_Width()
	{
		return width;
	}
}
