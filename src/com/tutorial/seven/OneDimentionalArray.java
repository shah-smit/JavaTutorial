package com.tutorial.seven;

import java.util.Scanner;

public class OneDimentionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the number of data you want to put in: ");
		int n = in.nextInt();
		int numbers[] = new int[n];
		
		for(int i=0; i<n; i++)
		{
			System.out.print("Enter "+ (i+1) + " value ");
			numbers[i] = in.nextInt();
		}
		
		for(int i=0; i<numbers.length; i++)
		{
			System.out.println("Value at "+ (i+1) + " "+numbers[i]);
		}
		
		int largest = numbers[0];
		for(int i=0; i<numbers.length; i++)
		{
			if(numbers[i]>largest)
			{
				largest = numbers[i];
			}
		}
		System.out.println("Largest number found: "+largest);
		
		int smallest = numbers[0];
		for(int i=0; i<numbers.length; i++)
		{
			if(numbers[i]<smallest)
			{
				smallest = numbers[i];
			}
		}
		System.out.println("Smallest number found: "+smallest);
		
		for(int i=0; i<numbers.length; i++)
		{
			for(int j=i; j<numbers.length; j++)
			{
				if(numbers[j]>numbers[i])
				{
					int temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp;
				}
			}
		}
		for(int i=0; i<numbers.length; i++)
		{
			System.out.println("Value at "+ (i+1) + " "+numbers[i]);
		}
		in.close();

	}

}
