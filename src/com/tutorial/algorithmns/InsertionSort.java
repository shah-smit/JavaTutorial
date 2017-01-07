package com.tutorial.algorithmns;

public class InsertionSort {

	public static void main(String [ ] args)
	{
		int []numbers = {1,1,1,1,1,3,1,12,3,3,3};
		int []sorted = new int[numbers.length];
			
		for(int i=0;i<numbers.length;i++)
		{			
			int z = findWhereToInsert(numbers[i],i,sorted);
			shuffle(z,i-1,sorted);
			sorted[z] = numbers[i];
		}
		
		//print out the sorted array
		for(int i = 0; i<numbers.length;i++)
		{	
			System.out.print(sorted[i]+",");
		}
		
//		String []names = {"ball","apple","pear","cat"};
//		String []sortedNames =  new String[3];
//			
//		for(int i=0;i<names.length;i++)
//		{			
//			int z = findWhereToInsert(names[i],i,sortedNames);
//			shuffle(z,i-1,sortedNames);
//			sortedNames[z] = names[i];
//		}
//		
//		//print out the sorted array
//		for(int i = 0; i<names.length;i++)
//		{	
//			System.out.print(sortedNames[i]+",");
//		}

	} 

	
	public static int findWhereToInsert(int x,int firstFree,int [] a)
	{
		int pos = 0;
		while(x>a[pos] && pos<firstFree)
			pos++;
	
		return pos;
	} 
	
	public static int findWhereToInsert(String x,int firstFree,String [] a)
	{
		int pos = 0;
		while(x.length() >a[pos].length() && pos<firstFree)
			pos++;
	
		return pos;
	} 

	public static void shuffle(int start, int end, int a[])
	{
		for(int i = end;i>=start;i--)
		{
			a[i+1] = a[i];
		}
	} 
	
	public static void shuffle(int start, int end, String a[])
	{
		for(int i = end;i>=start;i--)
		{
			a[i+1] = a[i];
		}
	} 

}
