package com.tutorials.miscellaneous;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PrelimTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintFile();
	}
	
	public static void PrintFile(){
		try{
			System.out.println("enter file name:");
			Scanner c = new Scanner(System.in);
			String x = c.nextLine();
			Scanner s = new Scanner(new File(x));
			while(s.hasNextLine()){
				System.out.println(s.nextLine());
			}
			s.close();
			c.close();
		}
		catch(FileNotFoundException ex){
			System.out.print("File not found ");
			PrintFile();
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
		finally{
			System.out.println("In Finally");
		}
	}

}
