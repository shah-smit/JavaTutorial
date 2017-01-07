package com.tutorial.recursion;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=2; i<100; i++)
		{
			System.out.println(i+" is prime: "+isPrime(i));
		}
		
	}

	public static boolean isPrime(int n)
	{
		return isPrime(n, n-1);
	}
	
	public static boolean isPrime(int checkNum, int runningNum)
	{
		if(runningNum == 1)return true;
		else if(checkNum % runningNum == 0) return false;
		else return isPrime(checkNum, runningNum-1);
	}
}
