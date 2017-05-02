package com.tutorial.filereaderwriter;

import java.io.FileReader;
import java.io.IOException;

public class Print99thCharacter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader fr = new FileReader("words");
		int count = 1;
		int x = fr.read();
		while(x != -1 && count != 99)
		{
			x = fr.read();
			count++;
		}
		System.out.println((char)x);
	}

}
