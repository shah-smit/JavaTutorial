package com.tutorial.recursion;

public class Exponent {

	public static void main(String[] args) {
		int answer = expot(4,3);
		System.out.println(answer);
	}

	private static int expot(int n, int m) {
		if(m == 0)
		{
			return 1;
		}
		else
		{
			return n * expot(n,m-1);
		}
	}

}
