package edu.handong.csee.java.lab13.prob3;
// Insert scanner
import java.util.Scanner;

// class that contain the main
public class MAIN {

	public static void main(String[] args) {
		
		double n1,n2;
		// instantiate Scanner
		Scanner keyboard = new Scanner(System.in);
		
		// get the radius from user.
		System.out.print("Enter raius: ");
		// set next double number to n1.
		n1 = keyboard.nextDouble();
		// instantiate the Circle and set n1 to Circle1's radius.
		Circle c1 = new Circle(n1);
		
		// print out the circle1's radius
		System.out.print("Raidus: " + c1.get_Radius());
		// print out the circle1's area and perimeter.
		c1.display();
		
		// get the length and width from user.
		System.out.println("Enter length and width: ");
		// set next double number to n1
		n1 = keyboard.nextDouble();
		// set next double number to n1
		n2 = keyboard.nextDouble();
		// instantiate the Rectangle, set n1 to length and set n2 to width
		Rectangle r1 = new Rectangle(n1, n2);
		
		// print out the rectangle1's length and width
		System.out.println("Length: " + r1.get_Length());
		System.out.println("Width: " + r1.get_Width());
		// print out the rectangle1's area and perimeter.
		r1.display();
	}

}
