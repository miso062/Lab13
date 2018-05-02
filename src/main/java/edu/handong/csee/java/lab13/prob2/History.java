package edu.handong.csee.java.lab13.prob2;

// class History that inherited the Book
public class History extends Book {
	
	private String Author;
	
	// Constructor that set the history book's name and author.
	public History(String Name, String Author)
	{
		// reuses the code in super classes to set book's name
		super(Name);
		// set the entered author to book's author
		this.Author = Author;
	}
	
	// method that return the String that represent book's name and author.
	public String toString()
	{
		return super.toString() + "\n\tAuthor: " + Author;
	}
	
	// method that print the book's name and author.
	public void show()
	{
		System.out.println("<<<History>>>" + toString());
	}

}
