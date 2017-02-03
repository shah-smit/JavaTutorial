package com.tutorial.recursion;

public class Multiplication {

	public static void main(String[] args) {
		int answer = multiply(4,3);
		System.out.println(answer);
	}

	public static int multiply(int i, int j) {
		
		if(i == 0 || j == 0)
		{
			return 0;
		}
		else
		{
			return i + multiply(i, j-1);
		}
	}

}
