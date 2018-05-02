package edu.handong.csee.java.lab13.prob5;

// Insert Scanner
import java.util.Scanner;

public class Prob5 {
	
	// method that check that two array is similar
	public static boolean equals(int[][] m1, int[][] m2)
	{
		int count = 0;
		if(m1.length != m2.length) // if the number of row is different, return false
			return false;
		// Compare all items in the two array.
		for (int i = 0; i < m1.length; i++)
		{
			for (int j = 0; j < m1[i].length; j++)
			{
				if (m1[i][j] != m2[i][j]) // if the array's element is different, Add one to the count.
					count++;
			}
		}
		
		if (count <= 3) // if the count is smaller than 3 or same to 3, return true. 
			return true;
		else // if the count if bigger than 3, return false
			return false;
	}

	public static void main(String[] args) {
		
		int n1, n2 = 0;
		// instantiate Scanner
		Scanner keyboard = new Scanner(System.in);
		
		// get first array's row size from user
		System.out.print("Enter row size(maximum 5): ");
		// set entered number to n1
		n1 = keyboard.nextInt();
		
		// get first array's column size from user
		System.out.print("Enter column size(maximum 5): ");
		// set entered number to n2
		n2 = keyboard.nextInt();
		
		// Declare double array that has n1 and n2 as rows and columns
		int[][] m1 = new int[n1][n2];
		
		// get second array's row size from user
		System.out.print("Enter row size(maximum 5)");
		// set entered number to n1
		n1 = keyboard.nextInt();
		
		// get second array's column size from user
		System.out.print("Enter column size(maximum 5): ");
		//set entered number to n2
		n2 = keyboard.nextInt();
		
		// Declare double array that has n1 and n2 as rows and columns
		int [][] m2 = new int[n1][n2];
		
		// get first array's element from user
		System.out.print("Enter List1: ");

		// Input the entered numbers into the array in order.
		for(int i = 0; i < m1.length; i++)
			for(int j = 0; j < m1[i].length; j++)
				m1[i][j] = keyboard.nextInt();
		
		// get first array's element from user
		System.out.print("Enter List2: ");

		// Input the entered numbers into the array in order.
		for(int i = 0; i < m2.length; i++)
			for(int j = 0; j < m2[i].length; j++)
				m2[i][j] = keyboard.nextInt();
		
		// print out all element of the first array.
		for(int i = 0; i < m1.length; i++) 
		{
			for(int j = 0; j < m1[i].length; j++)
				System.out.print(m1[i][j] + " ");
			System.out.println();
		}
		
		System.out.println();
		
		// print out all element of the first array.
		for(int i = 0; i < m2.length; i++)
		{
			for(int j = 0; j < m2[i].length; j++)
				System.out.print(m2[i][j] + " ");
			System.out.println();
		}
		
		System.out.println();
		
		if(equals (m1, m2)) // If the row size is different or the number of different values between the two arrays are greater than 3
			// print out sentence that represent two array is similar
			System.out.println("The two arrays are approximately identical.");
		else
			// print out sentence that represent two array is different! 
			System.out.println("The two arrays are not identical.");
	}
}
