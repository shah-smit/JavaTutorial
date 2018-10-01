package com.tutorial.recursion;

public class SquareNumber {

	public static void main(String[] args) {
		int answer = squarenum(4);
		System.out.println(answer);
	}
	
	public static int square(int n)
	{
		if(n <= 1)return 1;
		return square(n-1) + (2*n -1) ;
	}
	
	public static int squarenum(int n){
		int sum = 0;
		for(int i=1; i<=n; i++){
			sum += n;
		}
		return sum;
	}

}
