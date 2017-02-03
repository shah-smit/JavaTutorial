package com.tutorial.exceptionhandling;

import java.util.Scanner;

public class NullPointerExceptionTest {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
			String[] names = new String[5];
			
			names[0] = "A";
			names[1] = "B";
			names[3] = "D";
			names[4] = "E";
			
			for(int i=0; i<5; i++)
			{
				System.out.println(names[i]);
			}
			
			for(int i=0; i<5; i++)
			{
				try
				{
					System.out.println(names[i].length());
				}
				catch(NullPointerException ex)
				{
					System.out.println("Its a null value");
				}
				
			}
		in.close();
	}

}
