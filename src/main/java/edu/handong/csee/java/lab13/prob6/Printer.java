package edu.handong.csee.java.lab13.prob6;

// class that check a type of objects and change the object to upper case.
public class Printer {
	
	// method that check a type of object and change object to upper case
	public static void print(Object object)
	{
		// set entered object's string to str
		String str = object.toString();
		
		// check the object's type is CapitalPrintable
		if(object instanceof CapitalPrintable)
			// change the object's string to upper case
			str = str.toUpperCase();
		// print out str
		System.out.println(str);
	}
}
