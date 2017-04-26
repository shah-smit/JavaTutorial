package com.tutorial.filereaderwriter;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Exercise {

	public static void main(String[] args) throws FileNotFoundException {
		FileReader fr = new FileReader("test.txt");
		Scanner in = new Scanner(fr);
		int count = 0;
		while(in.hasNext())
		{
			count++;
			String line = in.nextLine();
			if(count == 3)
			{
				System.out.println("Line 3: "+line);
			}
			if(count % 2 == 0)
			{
				System.out.println("Even Line(s): "+line);
			}
			StringTokenizer st = new StringTokenizer(line);
			System.out.println(st.nextToken());
		}
		
		in.close();
		

	}

}
