package com.tutorial.methods;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

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
		System.out.println(a('a'));
		
		ArrayList<Integer> check = new ArrayList<Integer>();
		check.add(10);
		check.add(12);
		check.add(13);
		check.add(14);
		check.add(15);
		check.add(16);
		check.add(17);
		check.add(18);
		check.add(19);
		check.add(20);
		System.out.println(binarySearch(check,20));
		
		try(Scanner sc = new Scanner(System.in)){
			try{
				System.out.println();
			}
			finally{
				sc.close();
			}
		}
		finally{}
	}
	
	public static boolean binarySearch(ArrayList<Integer> a, int thing)
	{
		boolean thingFound = false;
		int len = a.size();

		int upperBound = len;
		int lowerBound = 0;
		
		while(!thingFound)
		{
			if(upperBound <= lowerBound)
			{
				break;
			}

			int midPoint = (lowerBound + upperBound) / 2;
			
			if(thing < a.get(midPoint))
			{
				upperBound = midPoint - 1;
			}
			
			else if(thing > a.get(midPoint))
			{
				lowerBound = midPoint + 1;
			}

			else if(thing == a.get(midPoint))
			{
				thingFound = true;
			}
		}
		return thingFound;
	}
	
	public static char a(int x)
	{
		return (char)(x+1);
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
