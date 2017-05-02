package com.tutorial.filereaderwriter;


import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class CopyFileInCapitals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String file1 = "test.txt";
		String file2 = "capitalmarks.txt";
		
		
		try{
		      String input = file1;
		      String output = "newFileCaptial.txt";

		      FileReader fr = new FileReader(input);
		      FileWriter fw = new FileWriter(output);
		      int t = fr.read();
		      while(t != -1){
		        if(t >=97 && t <=122)
		        {
		          fw.write(Character.toUpperCase((char)t));
		        }
		        else fw.write((char)t);
		        t=fr.read();
		      }

		      fr.close();
		      fw.close();
		    }
		    catch(Exception ex){}
		  }
}
