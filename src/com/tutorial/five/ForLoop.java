package com.tutorial.five;

import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number:");
		int n = in.nextInt();
		in.close();
		n = 2;
		
		for(int i=0; i<n; i++)
		{
			System.out.print("*");
		}

	}

}
