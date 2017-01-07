package com.tutorial.algorithmns;

public class SelectionSort {

	public static void main(String[] args) {
		
		int []numbers = {3,5,2};
		
		for(int i = 0; i<numbers.length;i++)
		{
			int lowestIndex = searchMinIndex(numbers,i);
			if(lowestIndex != i)
			{
				int temp = numbers[i];
				numbers[i] = numbers[lowestIndex];
				numbers[lowestIndex] = temp;	
			}
						
		}			
		
		//print out the sorted array
		for(int i = 0; i<numbers.length;i++)
		{	
			System.out.print(numbers[i]+",");
		}
		
		String []names = {"ball","apple","pear","cat"};
		
		for(int i = 0; i<names.length;i++)
		{
			int lowestIndex = searchMinIndex(names,i);
			if(lowestIndex != i)
			{
				String temp = names[i];
				names[i] = names[lowestIndex];
				names[lowestIndex] = temp;	
			}
						
		}			
		
		//print out the sorted array
		for(int i = 0; i<names.length;i++)
		{	
			System.out.print(names[i]+",");
		}

	}
	
	static int searchMinIndex(int []numbers, int fromIndex)
	{
		int lowestNum = numbers[fromIndex];
		int lowestIndex = fromIndex;
	
		for(int i = fromIndex;i<numbers.length;i++)
		{
			if(lowestNum>numbers[i])
			{
				lowestNum = numbers[i];
				lowestIndex = i;
			}
	
		}
	
		return lowestIndex;				
	} 
	
	static int searchMinIndex(String []numbers, int fromIndex)
	{
		String lowestNum = numbers[fromIndex];
		int lowestIndex = fromIndex;
	
		for(int i = fromIndex;i<numbers.length;i++)
		{
			if(lowestNum.compareTo(numbers[i]) > 0)
			{
				lowestNum = numbers[i];
				lowestIndex = i;
			}
		}
	
		return lowestIndex;				
	}

}
