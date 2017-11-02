package com.yeartwo.lab4;

public class AntApp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ant a1 = new Ant(15,5);
		increaseHeight1(a1);
		System.out.println("increaseHeight1: "+a1.getHeight());//pass by reference
		
		increaseHeight2(a1.getHeight());
		System.out.println("increaseHeight2: "+a1.getHeight());//pass by value
	}

	
	public static void increaseHeight1(Ant a){
		int h = a.getHeight();
		h += 5;
		a.setHeight(h);
	}
	
	public static void increaseHeight2(int height){
		height += 1;
	}
}
