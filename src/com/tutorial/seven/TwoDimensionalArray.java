package com.tutorial.seven;

import java.util.Scanner;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the number of data you want to put in: ");
		int n = in.nextInt();
		System.out.print("Enter the another number of data you want to put in: ");
		int m = in.nextInt();
		int numbers[][] = new int[n][m];
		
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<m; j++)
			{
				System.out.print("Enter "+ (i+1) + " value ");
				numbers[i][j] = in.nextInt();
			}
			
		}
		
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<m; j++)
			{
				System.out.print(numbers[i][j] + " ");
			}
			System.out.println();
		}
		in.close();
	}

}
