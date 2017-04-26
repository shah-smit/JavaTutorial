package com.tutorial.filereaderwriter;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		try
		{
			FileReader fr = new FileReader("test.txt");
			int x = 1;
			int n =0;
			while(x != -1)
			{
				x = fr.read();
				if(x != -1) n = n+1;
			}
			System.out.println(n);
			fr.close();
		}
		catch(FileNotFoundException ex){ }
		catch(IOException ex){ }
	}
}