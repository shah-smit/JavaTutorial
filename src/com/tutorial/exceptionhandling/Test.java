package com.tutorial.exceptionhandling;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		String s = "smit";
		try {
			divide(5,1);
			
			login(s);
			System.out.print("Login Successful");
		} catch (DivideByZeroException e) {
			e.printStackTrace();
		}catch (LoginException e) {
			System.err.println(e.getMessage(s));
		}
	}
	
	public static void divide(int num, int den) throws DivideByZeroException{
		if(den == 0) throw new DivideByZeroException("Denominator cannot be Zero");
		else System.out.println(num/den);
	}
	
	public static void login(String str) throws LoginException{
		if(!str.equals("secret")) throw new LoginException("Login Failed");
	}

}
