package edu.handong.csee.java.lab13.prob4;

// class animal that set a animal's name and print out the animal's name. 
public class Animal {
	
	private String name;
	
	// method that set animal's name
	public void setName(String name)
	{
		// set the entered name to animal's name
		this.name = name;
	}
	
	// method that get and print the animal's name
	public void getName()
	{
		// print out the animal's name
		System.out.println("Name: "+name);
	}

}
