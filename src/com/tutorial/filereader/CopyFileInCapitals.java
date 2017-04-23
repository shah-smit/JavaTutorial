package com.tutorial.filereader;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class CopyFileInCapitals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String file1 = "marks.txt";
		String file2 = "capitalmarks.txt";
		
		
		try {
			FileReader fr = new FileReader(file1);
			
			Scanner in = new Scanner(fr);
			
			FileOutputStream fw = new FileOutputStream(file2);
			PrintWriter pw = new PrintWriter(file2);
			
			while(in.hasNext())
			{
				String line = in.nextLine();
				System.out.println(line);
//				byte[] linebytes = line.getBytes();
//				fw.write(linebytes);
				pw.print(line);
			}
			pw.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
