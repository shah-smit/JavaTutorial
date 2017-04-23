package com.tutorial.revision;

import java.util.Scanner;
import java.util.Vector;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner in = new Scanner(System.in);
//		String input = in.nextLine();
//		input = removeSpace(input);
//		String rev = reverse(input);
//		System.out.println(input.equals(rev));
		long time = System.nanoTime();
		fizzBuzz();
		long end_time = System.nanoTime();
		System.out.println((end_time - time)/1000000);
	}
	
	public static String reverse(String original)
	{
		StringBuffer sb = new StringBuffer(original);
		return sb.reverse().toString();
	}
	
	public static String removeSpace(String original)
	{
		String[] args = original.split(" ");
		original = "";
		for(String arg : args){
			original += arg;
		}
		return original;
	}
	
	public static void exceptionCheck() throws MyException
	{
		Vector<String> vc = new Vector<String>();
		try{
	
		vc.add("Smit");
		vc.add("Shah");
		//vc.add("Shah");
		vc.setElementAt("Chetsn", 2);
		}
		catch(Exception ex)
		{
			throw new MyException();
		}
		System.out.println(vc.size());
	}
	
	public static void fizzBuzz()
	{
		
		for(int i = 1; i<=1000; i++)
			if(i%3==0 || i%5 ==0)
			{
				if(i%3 ==0) System.out.print("Fizz");
				if(i%5==0) System.out.print("Buzz");
				System.out.println();
			}
			else System.out.println(i);
		
		
	}

}
