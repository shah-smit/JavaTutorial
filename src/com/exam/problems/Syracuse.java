package com.exam.problems;

public class Syracuse {
	
	public static void main(String[] args)
	{
		syr(14);
	}
	
	public static int syr(int n)
	{
		System.out.println(n);
		if(n <= 1) return 1;
		else if(n%2 == 0) return syr(n/2);
		else return syr(3*n+1);
	}
	
}
