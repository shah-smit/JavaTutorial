package com.tutorial.seven;

import java.util.Scanner;

public class DisplayNumbersWithRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the length of the array: ");
		int n = in.nextInt();
		int num[] = new int[n];
		
		for(int i=0; i<n; i++)
		{
			
			System.out.print("Enter the value for the index "+(i+1)+": ");
			int m = in.nextInt();
			while(!(m>=80&&m<=120))
			{
				System.out.print("Enter the value greater than 80 and less than 120 for the index "+(i+1)+": ");
				m = in.nextInt();
			}
			num[i] = m;
		}
		
		int count  = 0;
		for(int i=0; i<n; i++)
		{
			if(num[i]>100)
			{
				count++;
			}
			System.out.println("Value at index "+(i+1) + " is: "+num[i]);
		}
		System.out.println("Numbers greater than 100 is "+count);
		in.close();

	}

}
