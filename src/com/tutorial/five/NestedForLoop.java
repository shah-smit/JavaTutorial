package com.tutorial.five;

import java.util.Scanner;

public class NestedForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Enter any height: ");
		int  height = in.nextInt();
		System.out.print("Enter any width: ");
		int  width = in.nextInt();
		
		for(int i=0; i<height; i++)
		{
			for(int j=0; j<width; j++)
			{
				if(j<=i)
				{
					System.out.print("*");	
				}
			}
			System.out.println("");
		}
		in.close();
	}

}
