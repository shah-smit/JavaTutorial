package com.tutorial.five;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int i = 0;
		
		while(i != -1)
		{
			System.out.println("Enter a number or -1 to exit");
			i = in.nextInt();
			System.out.println("The number is "+i);
		}
		System.out.println("End of program");
		in.close();
	}

}
