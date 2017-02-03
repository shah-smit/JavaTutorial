package com.tutorial.exceptionhandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileNotFoundExceptionTest {

	public static void main(String[] args) {
		Scanner in = null;
		try
		{
			in = new Scanner(new File("wordss"));
			String data;
			
			while(in.hasNextLine())
			{
				data = in.nextLine();
				System.out.println(data);
			}
			in.close();
		}
		catch(FileNotFoundException ex)
		{
			System.out.println(ex.getMessage());
		}
		

	}

}
