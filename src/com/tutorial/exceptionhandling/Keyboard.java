package com.tutorial.exceptionhandling;

import java.util.*;

public class Keyboard {
	
	public static void main(String[] args)
	{
		System.out.println(Keyboard.readDouble("Enter a double!"));
		System.out.println(Keyboard.readInt("Enter a Integer!"));
	}

	  public static String readString(String prompt) {
	    System.out.print(prompt);
	    Scanner in = new Scanner(System.in);
	    String enteredVal = in.nextLine();
	    in.close();
	    return enteredVal;
	  }

	 public static double readDouble(String prompt) {
		double value = 0;
		boolean valid = false;
		
		while(!valid)
		{
			try
			{
				String input = readString(prompt);
				value = Double.parseDouble(input);
				valid = true;
			}
			catch(NumberFormatException ex)
			{
				System.out.println(ex.getMessage());
			}
			catch(Exception ex)
			{
				System.out.println(ex.getMessage());
			}
		}
		
		
		return value;
	}

	public static int readInt(String prompt) {
		int value = 0;
		boolean valid = false;
		
		while(!valid)
		{
			try
			{
				String input = readString(prompt);
				value = Integer.parseInt(input);
				valid = true;
			}
			catch(NumberFormatException ex)
			{
				System.out.println(ex.getMessage());
			}
		}
		
		
		return value;
	}
}
