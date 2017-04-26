package com.studyguide.problems;

import java.io.FileReader;
import java.util.Scanner;

public class WordFinder {

	public static void main(String[] args) {
		
	}
	
	public static boolean wordExist(String word){
		boolean found = false;
		try{
			FileReader fr = new FileReader("words");
			Scanner sc = new Scanner(fr);
			
			while(sc.hasNext()){
				String line = sc.nextLine();
				if(line.equals(word))
				{
					found = true;
					break;
				}
			}
			sc.close();
			fr.close();
		}
		catch(Exception ex)
		{
			System.out.println("something went wrong");
		}
		return found;
	} 

}
