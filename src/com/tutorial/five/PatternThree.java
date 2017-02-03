package com.tutorial.five;

public class PatternThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int totalHeight = 10;
		for(int i=0; i<totalHeight; i++)
		{	
			for(int j=1; j<=totalHeight+i; j++)
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

}
