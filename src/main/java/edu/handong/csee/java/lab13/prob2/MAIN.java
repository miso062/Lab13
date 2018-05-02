package edu.handong.csee.java.lab13.prob2;

// MAIN class that contain the main
public class MAIN {
	
	public static void main(String[] args)
	{	
		// instantiate the book, science, and two history! 
		Book book = new Book("Simple Book");
		Science science = new Science("Hello Physics!", "ScienceWorld"); // Name, publisher
		History history1 = new History("What Is history?","E.H.Carr"); // Name, Author
		History history2 = new History("The South Korea", "Judis");
		
		// print out book's information! 
		book.show();
		science.show();
		history1.show();
		history2.show();
	}

}
