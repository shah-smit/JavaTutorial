package com.tutorial.tests;

public class Tutorial5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(minOf3(2,3,6));
		int val1 = 5;
		int val2 = 5;
		int val3 = 5;
		
		if(val1 == val2 && val2 == val3 && val3 == val1)
		{
			System.out.println("check");
		}
	}
	
	static int min(int a, int b)
	{
		if(a < b){ return a; }
		else return b;
	}
	
	static int minOf3(int a, int b, int c)
	{
		int smallest = min(a,b);
		if(smallest > c){ smallest = c; }
		
		return smallest;
	}

}
