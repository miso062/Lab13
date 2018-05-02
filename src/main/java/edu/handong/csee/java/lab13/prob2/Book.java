package edu.handong.csee.java.lab13.prob2;

// class book that set a book name and id, return the book's information, and print out the book's information. 
public class Book {
	
	private static int idCount = 0;
	private String BookName;
	private int id;
	
	// Constructor that set the book name and book id.
	public Book(String Name)
	{
		// set the entered name to book name
		this.BookName = Name;
		idCount++;
		// set the idCount to id
		id = idCount;
	}
	
	// method that return the String that represent book's id and name.
	public String toString()
	{
		return "\n\tId: " + id + "\n\tBook Name: " + BookName;
	}
	
	// method that print the book's id and name.
	public void show()
	{
		// print out the book's name and id
		System.out.println("<<<Book>>>" + this.toString());
	}

}
