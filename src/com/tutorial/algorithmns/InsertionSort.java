package com.tutorial.algorithmns;

public class InsertionSort {

	public static void main(String [ ] args)
	{
		int []numbers = {1,2,4,3,5,7,9};
		int []sorted = new int[numbers.length];
		
		insertionSort(numbers);
//		for(int i=0;i<numbers.length;i++)
//		{			
//			int z = findWhereToInsert(numbers[i],i,sorted);
//			System.out.println(z);
//			shuffle(z,i-1,sorted);
//			sorted[z] = numbers[i];
//		}
		
		for(int i = 0; i<numbers.length;i++)
		{	
			System.out.print(sorted[i]+",");
		}
	} 

	 public static void insertionSort(int array[]) {  
	        int n = array.length;  
	        for (int j = 1; j < n; j++) {  
	            int key = array[j];  
	            int i = j-1;  
	            while ( (i > -1) && ( array [i] > key ) ) {  
	                array [i+1] = array [i];  
	                i--;  
	            }
	            System.out.println(j);
	            array[i+1] = key;  
	        }  
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
