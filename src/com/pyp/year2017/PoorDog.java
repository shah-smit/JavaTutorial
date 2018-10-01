package com.pyp.year2017;

public class PoorDog {
	private double age;
	private String name;
	
	public double getAge(){
		return age;
	}
	
	public String getName(){
		return name;
	}
	
	public static void main(String[] args) {
		PoorDog one = new PoorDog();
		System.out.println("Dog name is "+ one.getName());
		System.out.println("Dog age is "+ one.getAge());
	}

}
