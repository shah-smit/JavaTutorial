package com.tutorial.recursion;

public class RecursiveTests {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int answer  = fact(4);
		System.out.println(answer);
	}
	
	public static int fact(int n)
	{
		System.out.println("at start of fact: "+n);
		if(n==0) 
		{
			System.out.println("inside IF: "+n);
			return 1;
		}
		else
		{
			System.out.println("inside else: "+n*fact(n-1));
			return n*fact(n-1);
		} 
	}

}
