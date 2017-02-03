package com.tutorial.five;

import java.util.Scanner;

public class IsPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Enter any num to check if it is a prime or not: ");
		int num = in.nextInt();
		boolean isPrime = true;
		for(int i=2; i<num; i++)
		{
			if(num%i == 0)
			{
				isPrime = false;
			}
		}
		System.out.print(num+" ");
		if(isPrime)
		{
			System.out.print("is a Prime number");
		}
		else
		{
			System.out.print("is not a Prime number");
		}
		in.close();
	}

}
