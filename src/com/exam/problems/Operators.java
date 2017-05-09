package com.exam.problems;

public class Operators {
	public static void main(String[] args){
		System.out.println((2>1) && (5<1) ||((5>3) || (1>2)));
		double x = Double.NEGATIVE_INFINITY;
		System.out.println(Integer.parseInt("100",8));
		
		up:
		for(int i=0; i<10;i++){
			low:
			for(int j=0;j<5;j++)
			{
				if(i == 5 && j ==4){
					break up;
				}
				if(j==1) continue;
				if(i==4) break low;
				System.out.println(i+" "+j);
			}
		}
	}
}
