package com.tutorial.filereaderwriter;

import java.io.FileReader;
import java.io.IOException;

public class CountLinesInFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader fr = new FileReader("test.txt");
		int x = fr.read();
		int countLine = 0;
		while(x != -1)
		{
			if((char)x == '.' || (char)x == '?'){
				countLine++;
			}
			x = fr.read();
		}
		System.out.println(countLine);
	}

}
