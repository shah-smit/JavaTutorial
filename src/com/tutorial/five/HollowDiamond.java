package com.tutorial.five;

import java.util.Scanner;

public class HollowDiamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Enter any height: ");
		int  height = in.nextInt();
		
		int totalHeight = height*2-1;
		int printLeftStar = totalHeight/2;
		boolean printLeftStarAdd = false;
		int printRightStar = totalHeight/2;
		boolean printRightStarSub = false;
		
		for(int i=0; i<totalHeight; i++)
		{
			
			for(int j=0; j<totalHeight; j++)
			{
				if(printLeftStar == j || printRightStar == j) 
				{
					System.out.print("*");
				}
				else
					System.out.print(" ");
			}
			if(printLeftStar == 0)
			{
				printLeftStarAdd = true;
			}
			if(printRightStar == totalHeight-1)
			{
				printRightStarSub = true;
			}
			
			if(printLeftStarAdd)
			{
				printLeftStar++;
			}
			else
			{
				printLeftStar--;
			}
			
			if(printRightStarSub)
			{
				printRightStar--;
			}
			else
			{
				printRightStar++;
			}
			
			System.out.println("");
		}
		in.close();
	}

}

