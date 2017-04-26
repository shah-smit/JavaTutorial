package com.tutorial.filereaderwriter;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ManyFiles {

	public static void main(String[] args) throws FileNotFoundException {
		for(int i=0; i<args.length; i++)
		{
			String fileName = args[i];
			FileReader fr= new FileReader(fileName);
			Scanner in = new Scanner(fr);
			printFile(in);
		}
	}
	
	public static void printFile(Scanner in)
	{
		while(in.hasNext())
		{
			String line = in.nextLine();
			System.out.println(line);
		}
	}

}
