package com.tutorial.recursion;

public class CubeNumber {
	public static void main(String[] args)
	{
		int answer = cube(2);
		System.out.println(answer);
	}

	private static int cube(int n) {
		if(n<=1)return 1;
		else return cube(n-1) + 3*(SquareNumber.square(n)) - 3*n + 1; 
	}
}
