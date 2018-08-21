package com.tutorial.recursion;

public class Division {
	public static void main(String[] args){
		System.out.println(div(4,3,0));
	}
	
	public static int div(int x, int y, int count){
		if(x <= 0) return count;
		else {
			if(x-y >= 1) count++;
			return div(x-y, y, count);
		}
	}
}
