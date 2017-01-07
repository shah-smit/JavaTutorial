package com.tutorial.seven;

import java.util.Random;

public class MathematicalOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int anyNum = 10;
		int numbers[] = new int[anyNum];
		Random rd = new Random();
		for(int i=0; i<anyNum; i++)
		{
			numbers[i] = rd.nextInt(100);
		}

		int totalSum = 0;
		int evenSum = 0;
		int oddSum = 0;
		int largest = numbers[0];
		int smallest = numbers[0];
		for(int i=0; i<10; i++)
		{
			if(numbers[i]%2 == 0)
			{
				evenSum += numbers[i];
			}
			else if(numbers[i]%2 != 0)
			{
				oddSum += numbers[i];
			}
			
			if(numbers[i]>largest)
			{
				largest = numbers[i];
			}
			if(numbers[i]<smallest)
			{
				smallest = numbers[i];
			}
			
			totalSum += numbers[i];
		}
		if(oddSum > evenSum)
		{
			System.out.println("Sum of Odd is larger than Sum of Even");
		}
		else if(evenSum > oddSum){
			System.out.println("Sum of even is larger than Sum of odd");
		}
		else if(evenSum == oddSum)
		{
			System.out.println("Sum of Even is equal to Sum of Odd");
		}
		System.out.format("largest found %d \nsmallest found %d \ntotal sum found %d \naverage sum found %d \n", largest,smallest,totalSum,(totalSum/anyNum));
		
		double movingAve = (numbers[0]+numbers[1])/2;
		for(int i=2; i<numbers.length;i++)
		{
			movingAve = (movingAve + numbers[i]/(i*1.0)) * ((i)/(i+1.0));
		}
		System.out.println(movingAve);
	}

}
