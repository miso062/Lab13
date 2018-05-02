package edu.handong.csee.java.lab13.prob4;

// class Cat that inherited Animal and implement Pet
public class Dog extends Animal implements Pet {
	
	// method that return animal's kind and food
	public String food()
	{
		return "(Dog!)" + "Sausage";
	}

}
