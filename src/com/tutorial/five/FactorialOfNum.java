package com.tutorial.five;

import java.util.Scanner;

public class FactorialOfNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Enter any positive num: ");
		int num = in.nextInt();
		
		int factorial = 1;
		
		for(int i=1; i<=num; i++)
		{
			factorial *= i;
		}
		System.out.println("The factorial of "+num+" is "+factorial);
		in.close();
	}

}
