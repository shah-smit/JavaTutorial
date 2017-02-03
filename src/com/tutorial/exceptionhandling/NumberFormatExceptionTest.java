package com.tutorial.exceptionhandling;

import java.util.Scanner;

public class NumberFormatExceptionTest {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		try
		{
			String name = in.nextLine();
			@SuppressWarnings("unused")
			int num = Integer.parseInt(name);
			num = 20;
		}catch(NumberFormatException ex)
		{
			System.out.println("Input is not a number");
		}
		finally
		{
			System.out.println("Completed");
		}
		in.close();
	}

}
