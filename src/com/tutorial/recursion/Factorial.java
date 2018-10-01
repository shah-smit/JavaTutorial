package com.tutorial.recursion;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(f(500));
	}
	
	public static int f(int n){
		if(n<=0) return 1;
		else return n*f(n-1);
	}

}
