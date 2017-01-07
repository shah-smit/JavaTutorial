package com.tutorial.five;

public class PatternFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int totalHeight = 4;
		for(int i=0; i<totalHeight; i++)
		{	
			printStar(totalHeight,i);
		}
		for(int i=totalHeight; i>=0; i--)
		{	
			printStar(totalHeight,i);
			
		}
	}
	static void printStar(int totalHeight, int i)
	{
		for(int j=0; j<=totalHeight+i; j++)
		{
			if(j>=totalHeight-i && j<=totalHeight+i)
			{
				System.out.print("*");
			}
			else
			{
				System.out.print(" ");
			}
		}
		System.out.println("");
	}

}
