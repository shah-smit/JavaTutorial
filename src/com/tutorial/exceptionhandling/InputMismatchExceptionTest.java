package com.tutorial.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchExceptionTest {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		try
		{
			in.nextInt();
		}catch(InputMismatchException ex)
		{
			System.out.println("Mist Match Exp");
		}
		in.close();
	}

}
