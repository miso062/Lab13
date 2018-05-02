package edu.handong.csee.java.lab13.prob6;

// class that set x,y and return x,y and implement CapitalPrintable
public class UpPoint implements CapitalPrintable {
	
	private int x, y;
	
	// method that set the x,y
	public UpPoint(int x, int y)
	{
		// set entered x, y to x, y value
		this.x = x;
		this.y = y;
	}
	
	// method that return the String representing x, y
	public String toString()
	{
		return "x : " + x + " y : " + y;
	}
}
