package com.tutorial.methods;

public class HarmonicSum {
	public static int number;
	
	public static float getHarmonicSum()
	{
		float sum = 1;
		
		for(int i=2; i<=number;i++)
		{
			sum += (float)1/i;
		}
		return sum;
	}

}
