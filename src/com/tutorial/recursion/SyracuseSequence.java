package com.tutorial.recursion;

public class SyracuseSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Syracuse(16);
	}
	
	public static void Syracuse(int n)
	{
		System.out.println(n);
		if(n ==1){ return;}
		else
		{
			if(n%2 == 0) Syracuse(n/2);
			else Syracuse((3*n)+1);
		}
	}

}
