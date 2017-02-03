package com.tutorial.five;

import java.util.Random;
import java.util.Scanner;

public class Question20 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Think of a number between 0 and 1000");
		int noOfGuesses = 0;
		int random = 0;
		int randomOrigin = 0;
		int randomBound = 1000;
		
		while(noOfGuesses<10)
		{
			Random rd = new Random();
			random = rd.nextInt(randomBound);
			rd.ints(randomOrigin, randomBound);
			System.out.println("Computer thought of: "+random);
			
			int userInput = in.nextInt();
			if(userInput == 1)
			{
				randomOrigin = random;
				randomBound = 1000;
				
			}
			else if(userInput == 2)
			{
				randomOrigin = 0;
				randomBound = random;
			}
			else 
			{
				System.out.println("Computer Wins");
				break;
			}
			System.out.format("Think of a number between %d and %d \n", randomOrigin, randomBound);
			noOfGuesses++;
		}
		
		if(noOfGuesses == 10)
		{
			System.out.println("User Wins");
		}
		in.close();
	}

}
