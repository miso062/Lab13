package edu.handong.csee.java.lab13.prob6;

// class that contain main program
public class Prob6 {
	
	public static void main(String[] args) {
		
		// instantiate UpPoint p1, p4 and DownPoint p2, p3
		UpPoint p1 = new UpPoint(3, 3);
		DownPoint p2 = new DownPoint(2, 5);
		DownPoint p3 = new DownPoint(4, 7);
		UpPoint p4 = new UpPoint(9, 12);
		
		// print from p1 to p4
		Printer.print(p1);
		Printer.print(p2);
		Printer.print(p3);
		Printer.print(p4);
	}
}
