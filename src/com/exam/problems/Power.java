package com.exam.problems;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	//x^n
	public static int pow(int x, int n)
	{
		if(x == 0) return 1;
		else return x*(n--);
	}

}
