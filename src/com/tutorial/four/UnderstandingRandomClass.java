package com.tutorial.four;

import java.util.Random;
import java.util.Scanner;

public class UnderstandingRandomClass {
	
	public static void main(String[] args)
	{
		System.out.println("UnderstandingRandomClass Started!");
		Random r = new Random();
		int guess = r.nextInt(10);
		Scanner in = new Scanner(System.in);
		System.out.print("Try to guess the number I’m thinking of ");
		double x = 0;
		x =in.nextDouble();
		in.close();
		

		if (guess<x)
		{  
			System.out.print("Guess too high "); 
		}
		else if (guess>x)
		{   
			System.out.print("Guess too low ");  
		}	
		else 
		{    
			System.out.println("Correct Guess! ");
		}
		 System.out.println("The number is: " + guess);

	}
}
