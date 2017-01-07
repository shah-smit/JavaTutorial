package com.tutorial.five;

public class HarmonicSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sum = 0;
		for(int i=1; i<=50000; i++)
		{
			sum = sum + (1.0 / i);
		}
		System.out.println(sum);
	}

}
