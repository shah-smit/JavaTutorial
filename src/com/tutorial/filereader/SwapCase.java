package com.tutorial.filereader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class SwapCase {

	public static void main(String[] args) throws FileNotFoundException {
			FileReader fr = new FileReader("test.txt");
			Scanner in = new Scanner(fr);
			
			while(in.hasNext()){
				String line = in.nextLine();
				for(int i=0; i<line.length(); i++)
				{
					char a = swapChar(line.charAt(i));
					System.out.println(a);
				}
			}
			System.out.println(swapChar('b'));
			in.close();
	}
	
	public static char swapChar(char a)
	{
		int val = (int)a;

		if(val >= 97)
		{
			val -= 32;
			return ((char)(val));
		}
		else if(val >= 65 && val < 97)
		{
			val += 32;
			return ((char)(val));
		}
		else
		{
			return '\0';
		}
	}

}
