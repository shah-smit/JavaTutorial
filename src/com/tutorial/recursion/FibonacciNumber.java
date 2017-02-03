package com.tutorial.recursion;

public class FibonacciNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int answer = fiboNumber(7);
		System.out.print(answer);
	}

	private static int fiboNumber(int i) {
		if(i<=1)
		{
			return i;
		}
		else
		{
			return fiboNumber(i-1) + fiboNumber(i-2);
		}
	}

}
