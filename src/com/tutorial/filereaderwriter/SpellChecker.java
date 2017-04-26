package com.tutorial.filereaderwriter;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class SpellChecker {

	public static void main(String[] args) throws FileNotFoundException {
		FileReader fr = new FileReader("test.txt");
		Scanner in = new Scanner(fr);
		while(in.hasNext())
		{
			String line = in.nextLine();
			String[] words = line.split(" ");
			
			for(int i=0; i<words.length; i++)
			{
				if(!inDictionary(words[i]))
				{
					System.out.println("not found: "+words[i]);
				}
			}
		}
		in.close();
	}

	private static boolean inDictionary(String string) throws FileNotFoundException {
		Scanner dict = new Scanner(new FileReader("words"));
		while(dict.hasNext())
		{
			String newWord = dict.nextLine();
			if(string.equalsIgnoreCase(newWord))
			{
				dict.close();
				return true;
			}
		}
		dict.close();
		return false;
	}

}
