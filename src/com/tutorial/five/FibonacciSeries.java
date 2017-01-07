package com.tutorial.five;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int previousNum1 = 1;
		int previousNum2 = 2;
		int currentNum = 1;
		double sum = 0;
		
		for(int i=1; i<=20; i++)
		{
			if(i ==1 || i ==2)
			{
				currentNum = 1;
			}
			else
			{
				currentNum += previousNum1 + previousNum2;
				previousNum2 = previousNum1;
				previousNum1 = currentNum;
			}
			sum+=currentNum;
			System.out.println(currentNum+" ");
		}
		System.out.println();
		System.out.println(sum/20);

	}

}
