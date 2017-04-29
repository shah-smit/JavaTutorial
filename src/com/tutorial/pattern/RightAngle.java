package com.tutorial.pattern;

public class RightAngle {

	public static void main(String[] args) {
		draw(4);
	}
	
	public static void draw(int n)
	{
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				if(j<i) System.out.print(" ");
				else System.out.print("*");
			}
			System.out.println();
		}
	}

}
