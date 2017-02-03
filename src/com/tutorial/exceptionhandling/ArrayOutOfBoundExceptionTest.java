package com.tutorial.exceptionhandling;

public class ArrayOutOfBoundExceptionTest {

	public static void main(String[] args) {
		try
		{
			int[] num = {1,2,3,4};
			
			for(int i=0; i<8; i++)
			{
				System.out.println(num[i]);
			}
		}
		catch(IndexOutOfBoundsException ex)
		{
			System.out.println("h"+ex);
		}

	}

}
