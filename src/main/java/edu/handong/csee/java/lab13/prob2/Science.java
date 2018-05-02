package edu.handong.csee.java.lab13.prob2;

// class Science that inherited the Book
public class Science extends Book {
	
	private String publisher;
	
	// Constructor that set the science book's name and publisher.
	public Science(String Name, String Publisher)
	{
		// reuses the code in super classes to set book's name
		super(Name);
		// set the entered publisher to book's publisher
		this.publisher = Publisher;
	}
	
	// method that return the String that represent book's name and publisher.
	public String toString()
	{
		return super.toString() + "\n\tPublisher: " + publisher;
	}
	
	// method that print the book's name and publisher.
	public void show()
	{
		System.out.println("<<<Science>>>" + this.toString());
	}

}
