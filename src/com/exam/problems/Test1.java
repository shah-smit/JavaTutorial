package com.exam.problems;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean b = (3==4);
		System.out.println(b);
		
		int[][] a = new int[3][3];
		for(int i=0; i<3; i++){
			for(int j=0; j<3; j++)
			{
				System.out.println(a[i][j]);
				if(a[i][i] + a[i][j] == 2*a[i][j]){
					return;
				}
				System.out.println(a[i][j]);
			}
		}
		int x = min(min(5,10),5);
	}
	
	static int min(int x, int y){
		return x;
	}

}
