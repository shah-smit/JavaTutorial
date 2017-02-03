package com.tutorial.six;

import java.util.Scanner;

public class Exercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a string");
		String aString = in.nextLine();
		
		int aCounter = 0;
		
		for(int i=0; i<aString.length();i++)
		{
			char aChar = aString.charAt(i);
			if(aChar == 'a')
			{
				aCounter++;
			}
		}
		System.out.println("Number of a is "+aCounter);
		
		System.out.print("Enter a string to count vowels ");
		String bString = in.nextLine();
		
		char[] vowels = {'a','e','i','o','u'};
		int[] vowelsCount = new int[vowels.length];
		
		for(int i=0; i<bString.length(); i++)
		{
			char bChar = bString.charAt(i);
			for(int j=0; j<vowels.length; j++)
			{
				if(bChar == vowels[j])
				{
					vowelsCount[j] = vowelsCount[j]+1;
				}
			}
		}
		for(int i=0; i<vowelsCount.length; i++)
		{
			System.out.println(vowels[i]+ " :"+vowelsCount[i]);
		}
		
		System.out.print("Enter two whole number with a space: ");
		int a = in.nextInt();
		int b = in.nextInt();
		int result = 0;
		for(int i=0; i<Math.min(a, b); i++)
		{
			result += Math.max(a, b);
		}
		System.out.println(result);
		
		System.out.print("Enter two whole number with a space: ");
		result = 0;
		
		
		for(int i=0; i<Math.min(a, b); i++)
		{
			result += Math.max(a, b);
		}
		System.out.println(result);
		in.close();
	}

}
