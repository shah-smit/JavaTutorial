package com.tutorial.five;

import java.util.Scanner;

public class RightAngleStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Scanner in = new Scanner(System.in);
				System.out.print("Enter any height: ");
				int  height = in.nextInt();
				
				for(int i=0; i<height; i++)
				{
					for(int j=0; j<i; j++)
					{
							System.out.print("*");	
					}
					System.out.println("");
				}
				in.close();
	}

}
