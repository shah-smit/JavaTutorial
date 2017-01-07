package com.tutorial.algorithmns;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		//Sorted names and score
		String []names = {"Edward","James","John","May","Peter"};
		int []testScore = {67,99,57,88,78};
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter name:");
		String name = in.nextLine();
		
		int z = binarySearchPos(name, names);
		if(z!=-1)
		{
			System.out.println("Score of "+name+ " is "+testScore[z]);
		}
		else
		{
			System.out.println("Name not found");
		} 
		in.close();
	}
	
	public static int binarySearchPos(String name, String [] a)
	{
		int first=0,last=a.length-1;
		int mid=0;
		while(first<=last)
		{
			mid = first + (last-first)/2; //it is an integer division here.
			if(name.equals(a[mid]))    //found!!
			{	
				return mid; //return immediately, the loop stops here
			}
			else if(name.compareTo(a[mid])<0)
			{	
				last = mid - 1;
			}
			else
			{
				first = mid + 1;			
			}
		}	
			
		return -1;
	} 


}
