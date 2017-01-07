package com.tutorial.seven;

import java.util.Scanner;

public class DisplayNamesWithOnlyString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		System.out.print("Enter the number of names u want to enter: ");
		int n = in.nextInt();
		in.nextLine();
		String names[] = new String[n];
		
		for(int i=0; i<n; i++)
		{
			System.out.print("Enter the value for the index "+(i+1)+": ");
			while (!in.hasNext("[A-Za-z]+")) {
		        System.out.print("Nope, that's not it!: ");
		        in.nextLine();
		    }
			names[i] = in.nextLine();
		}
		
		for(int i=0; i<n; i++)
		{
			System.out.println("Hello from the other side says "+names[i]);
		}
		in.close();
	}

}
