package com.tutorial.four;

import java.util.Scanner;

public class MathClassTest {
	
	public static void main(String args[])
	{
		double temp;
		System.out.println("exp(1.0) is "  + Math.exp(1.0));     
		System.out.println("exp(10.0) is " + Math.exp(10.0));     
		System.out.println("exp(0.0) is "  +  Math.exp(0.0));
		System.out.println("log(1.0) is "    + Math.log(1.0));    
		System.out.println("log(10.0) is "   + Math.log(10.0));     
		System.out.println("log(Math.E) is " + Math.log(Math.E));


		System.out.print("Enter any value:");
		Scanner in = new Scanner(System.in);
		double value = in.nextDouble();
		
		System.out.println("Absolute Method: "+Math.abs(value));
		System.out.println("Floor Method: "+Math.floor(value));
		
		System.out.print("Enter any another value:");
		double value2 = in.nextDouble();
		System.out.print("Enter any another another value:");
		double value3 = in.nextDouble();
		System.out.print("Enter any another value:");
		double value4 = in.nextDouble();
		in.close();
		double[] arraysint = {value, value2, value3, value4};
		int num = 4;
		for (int i = 0; i < ( num - 1 ); i++) {
		      for (int j = 0; j < num - i - 1; j++) {
		        if (arraysint[j] < arraysint[j+1]) 
		        {
		           temp = arraysint[j];
		           arraysint[j] = arraysint[j+1];
		           arraysint[j+1] = temp;
		        }
		      }
		    }
		for (int i = 0; i < num; i++) 
		      System.out.println(arraysint[i]);
		
		
		
	}

}
