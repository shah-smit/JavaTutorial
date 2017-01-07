package com.tutorial.recursion;

public class SquareNumber {

	public static void main(String[] args) {
		int answer = square(4);
		System.out.println(answer);
	}
	
	public static int square(int n)
	{
		if(n <= 1)return 1;
		return square(n-1) + (2*n -1) ;
	}

}
