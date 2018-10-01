package com.tutorial.algorithmns;

public class TowerOfHanoi {

	public static void main(String[] args) {
		move(3,'A','B','C');

	}
	
	public static void move(int numberOfDics, char start, char end, char intermediate){
		if(numberOfDics == 0) return;
		move(numberOfDics-1,start,intermediate,end);
		System.out.println("Moving Disc: "+numberOfDics+" from: "+start+" to: "+end);
		move(numberOfDics-1,intermediate,end,start);
	}

}
