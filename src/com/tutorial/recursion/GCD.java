package com.tutorial.recursion;

public class GCD {

	public static void main(String [] inputs)
	{
		int answer = gcd(8,14);
		System.out.println(answer);
	}
	
	static int gcd(int n,int m)
	{
		if (n==m) //end point
		{ 
			return n;
		}
		else if (n>m)
		{
			return gcd(n-m,m);
		}
		else 
		{	
			return gcd(n,m-n);
		}
	} 


}
