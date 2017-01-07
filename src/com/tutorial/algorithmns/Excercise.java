package com.tutorial.algorithmns;

public class Excercise {

	public static void main(String[] args) {
		int[] numbers = {4,6,2,1,5,88,2,12,1331,312,1212,41241,1,1,24,535,212};
		BubbleSort(numbers);
		SelectionSort(numbers);
		InsertionSort(numbers);
	}

	private static void BubbleSort(int[] numbers) {
		boolean swap = true;
		while(swap)
		{
			swap = false;
			for(int i=1; i<numbers.length; i++)
			{
				int j = i-1;
				if(numbers[i]<numbers[j])
				{
					int temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp;
					swap = true;
				}
			}
		}
		
		print("BubbleSort: ",numbers);
	}

	private static void SelectionSort(int[] numbers) {
		for(int i=0; i<numbers.length; i++)
		{
			for(int j=i; j<numbers.length; j++)
			{
				if(numbers[i]>numbers[j])
				{
					int temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp;
				}
			}
		}
		print("SelectionSort",numbers);
	}
	
	private static void InsertionSort(int[] numbers) {
		int[] sortedNumbers = new int[numbers.length];
		for(int i=0; i<numbers.length; i++)
		{
			
		}
		print("InsertionSort",sortedNumbers);
	}
	
	private static void print(String ifany,int[] numbers) {
		System.out.print(ifany+" ");
		
		for(int i=0; i<numbers.length; i++)
		{
			System.out.print(numbers[i]+" ");
		}
		System.out.println();
	}

}
