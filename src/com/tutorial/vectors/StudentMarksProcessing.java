package com.tutorial.vectors;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Vector;

public class StudentMarksProcessing {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(new File("studentmarks.txt"));
			Vector<StudentMark> vc = new Vector<StudentMark>();
			while(sc.hasNextLine())
			{
				String line = sc.nextLine();
				String[] record = line.split("\\|");
				StudentMark sm = new StudentMark(record[0],record[1],record[2],record[3]);
				vc.add(sm);
			}
			sc.close();
			
			double total = 0;
			for(StudentMark sm:vc)
			{
				System.out.println(sm);
				total += sm.getTotalScore();
			}
			
			System.out.println("Average Students Mark: "+total/vc.size());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
