package edu.handong.csee.java.lab13.prob3;

// class Circle that inherited the Shape
public class Circle extends Shape{
	
	private double radius;
	
	// Constructor that set the Circle's radius.
	public Circle(double r)
	{
		radius = r;
	}
	
	// method that calculate and return the area
	public double area()
	{
		return Math.PI * Math.pow(radius, 2); // pi * r * r
	}
	
	// method that calculate and return the perimeter
	public double perimeter()
	{
		return 2.0 * Math.PI * radius; // 2 * pi * radius
	}

	// method that get radius
	public double get_Radius()
	{
		return radius;
	}

}
