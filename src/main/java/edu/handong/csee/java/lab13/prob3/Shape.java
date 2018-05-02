package edu.handong.csee.java.lab13.prob3;

// abstract class Shape that print out area and perimeter.
public abstract class Shape {
	
	public abstract double area();
	public abstract double perimeter();
	
	// method that print out area and perimeter.
	public void display()
	{
		System.out.println("Area: " + area() + "\nPerimeter: " + perimeter() + "\n");
	}

}
