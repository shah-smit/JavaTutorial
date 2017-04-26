package com.studyguide.problems;

import java.io.*;

public class UpperCaseOccurances {

	public static void main(String[] args) {
		try{
			FileReader fr = new FileReader("test.txt");
			int x = fr.read();
			int lowerBound = (int)'A';
			int upperBound = (int)'Z';
			int occurances = 0;
			while(x != -1)
			{
				if(x >= lowerBound && x <= upperBound) occurances++;
				x = fr.read();
			}
			System.out.println(occurances);
			fr.close();
		}
		catch(FileNotFoundException ex)
		{
			System.out.println("File Not Found");
		}
		catch(Exception ex)
		{
			System.out.println("Something went wrong");
		}
		

	}

}
