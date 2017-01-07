package com.tutorial.algorithmns;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		String []names = {"John","Peter","James","May","Edward"};
		int []testScore = {57,78,99,88,67};
	
		Scanner in = new Scanner(System.in);
		System.out.print("Enter name:");
		String name = in.nextLine();
	
		boolean found=false;
				
		for(int i=0;i<names.length;i++)
		{	
			if(names[i].equals(name))
			{
				System.out.print("Test score of "+name);
				System.out.println(" :"+testScore[i]);
				// break from the for loop
				found = true;
				break;
			}			
		}
	
		if(!found)
		{
			System.out.print("Name not found");
		} 
		in.close();

	}

}
