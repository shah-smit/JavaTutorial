package com.studyguide.problems;

import java.util.Random;

public class RollADice {
	
	static int roll(){
		Random rd = new Random();
		return rd.nextInt(6)+1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean found = false;
		int count = 0;
		while(!found){
			count ++;
			
			int a = roll();
			int b = roll();
			int c = roll();
			
			if(a == 1 && b == 1 && c == 1){ 
				found = true;
			}
		}
		System.out.println(count);
	}

}
