package com.tutorial.methods;

public class Factorial {
	public static int number;
	
	public static int getFactorial()
	{
		int sum = 1;
		for(int i=1; i<=number;i++)
		{
			sum *= i;
		}
		
		return sum;
	}

}
