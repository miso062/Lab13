package edu.handong.csee.java.lab13.prob4;

// Insert scanner
import java.util.Scanner;

public class Master {

	// method that print out the pet's kind and food.
	public void feed(Pet pet)
	{
		System.out.println("feed: " + pet.food());
	}
	
	public static void main(String[] args) {

		String cat_name, dog_name;

		// instantiate the Master, Cat, Dog, and Scanner!
		Master master = new Master();
		Cat cat = new Cat();
		Dog dog = new Dog();
		Scanner keyboard = new Scanner(System.in);
		
		// get cat name and dog name from user.
		System.out.println("Enter the cat name and dog name: ");
		// set first entered word to cat_name
		cat_name = keyboard.next();
		// set second entered word to dog_name
		dog_name = keyboard.next();
		
		// set the cat_name to cat's name
		cat.setName(cat_name);
		// get the cat's name
		cat.getName();
		// print the pet's kind and food! - cat
		master.feed(cat);
		
		// set the dog_name to dog's name
		dog.setName(dog_name);
		// get the dog's name
		dog.getName();
		// print the pet's kind and food - dog
		master.feed(dog);
	}
}
