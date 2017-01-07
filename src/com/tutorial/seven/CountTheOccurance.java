package com.tutorial.seven;

import java.util.Random;

public class CountTheOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rnd = new Random();
		int anyNum = rnd.nextInt(10);
		int numbers[] = new int[anyNum];
		
		for(int i=0; i<anyNum; i++)
		{
			numbers[i] = rnd.nextInt(9);
			System.out.format("The number randomly picked %d for the index %d\n", numbers[i],i);
		}
		
		int pickedNum = rnd.nextInt(10);
		
		int count = 0;
		for(int i=0; i<anyNum; i++)
		{
			if(numbers[i]==pickedNum)
			{
				count++;
			}
		}
		System.out.format("the num %d occured %d times in the array", pickedNum,count);
	}

}
