package com.tutorial.algorithmns;


public class BubbleSort {

	public static void main(String[] args) {
		
		int[] numbers = {1,4,2,7,4};
		numbers = bubbleSort(numbers);
		for(int i=0; i<numbers.length;i++)
		{
			System.out.println(numbers[i]);
		}
		
		String[] names = {"ball","apple","pear","cat"};
		names = bubbleSort(names);
		for(int i=0; i<names.length;i++)
		{
			System.out.println(names[i]);
		}
	}
	
	public static int[] bubbleSort(int[] array)
	{
		boolean swap = true;
		
		while(swap)
		{
			swap = false;
			for(int i=1; i<array.length; i++)
			{
				if(array[i-1]>array[i])
				{
					int temp = array[i-1];
					array[i-1] = array[i];
					array[i] = temp;
					swap = true;
				}
			}
		}
		return array;
	}
	
	public static double[] bubbleSort(double[] array)
	{
		boolean swap = true;
		
		while(swap)
		{
			swap = false;
			for(int i=1; i<array.length; i++)
			{
				if(array[i-1]>array[i])
				{
					double temp = array[i-1];
					array[i-1] = array[i];
					array[i] = temp;
					swap = true;
				}
			}
		}
		return array;
	}
	
	public static String[] bubbleSort(String[] array)
	{
		boolean swap = true;
		
		while(swap)
		{
			swap = false;
			for(int i=1; i<array.length; i++)
			{
				if(array[i-1].compareTo(array[i]) > 0)
				{
					String temp = array[i-1];
					array[i-1] = array[i];
					array[i] = temp;
					swap = true;
				}
			}
		}
		return array;
	}

}
