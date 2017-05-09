package com.tutorial.filereaderwriter;

import java.io.*;
import java.util.Scanner;

public class DifferentReaderWriter {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		long startTime = System.nanoTime();
		
		FileInputStream in = new FileInputStream("test.txt");
		FileOutputStream out = new FileOutputStream("output.txt");
		int c;
		while ((c = in.read()) != -1) 
		{
		out.write(c);
		}
		in.close();
		out.close();
	
		long endTime = System.nanoTime();

		long duration = (endTime - startTime); 
		System.out.println(duration);
		
		startTime = System.nanoTime();
		
		FileReader fr = new FileReader("test.txt");
		FileWriter fw = new FileWriter("output.txt");

		while ((c = fr.read()) != -1) 
		{
			fw.write(c);
		}
		fr.close();
		fw.close();
	
		endTime = System.nanoTime();

		duration = (endTime - startTime); 
		System.out.println(duration);
		
		startTime = System.nanoTime();
		
		Scanner sc = new Scanner(new FileReader("test.txt"));
		PrintWriter pw = new PrintWriter("output.txt");

		while (sc.hasNextLine()) 
		{
			pw.println(sc.nextLine());
		}
		sc.close();
		pw.close();
	
		endTime = System.nanoTime();

		duration = (endTime - startTime); 
		System.out.println(duration);
		
		startTime = System.nanoTime();
		
		sc = new Scanner(new FileInputStream("test.txt"));
		pw = new PrintWriter(new FileOutputStream("output.txt"));

		while (sc.hasNextLine()) 
		{
			pw.println(sc.nextLine());
		}
		sc.close();
		pw.close();
	
		endTime = System.nanoTime();

		duration = (endTime - startTime); 
		System.out.println(duration);

	}
	
	

}
