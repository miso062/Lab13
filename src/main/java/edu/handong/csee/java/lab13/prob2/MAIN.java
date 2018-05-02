package edu.handong.csee.java.lab13.prob2;

public class MAIN {
	
	public static void main(String[] args)
	{
		Book book = new Book("Simple Book");
		Science science = new Science("Hello Physics!", "ScienceWorld"); // Name, publisher
		History history1 = new History("What Is history?","E.H.Carr");
		History history2 = new History("The South Korea", "Judis");
		
		book.show();
		science.show();
		history1.show();
		history2.show();
	}

}
