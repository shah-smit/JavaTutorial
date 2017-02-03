package com.tutorial.methods;

import java.util.Scanner;

public class MainActivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
//		System.out.print("Enter height: ");
//		Rectangle.height = in.nextDouble();
//		System.out.print("Enter Width: ");
//		Rectangle.width = in.nextDouble();
//		
//		System.out.println(Rectangle.getArea());
//		
//		System.out.print("Enter Radius: ");
//		Circle.radius = in.nextDouble();
//		
//		System.out.println(Circle.getArea());
		
		System.out.print("Enter a number to find factorial: ");
		Factorial.number = in.nextInt();
		
		System.out.println(Factorial.getFactorial());
		
		System.out.format("\nThe factorial value that u have entered is Even: %b ",isEven(Factorial.number));
		
		HarmonicSum.number = Factorial.number; 
		System.out.format("\nThe Harmonic Sum of the factorial value is: %f ",HarmonicSum.getHarmonicSum());
		

		in.close();
	}
	
	public static boolean isEven(int value)
	{
		if(value % 2 == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
