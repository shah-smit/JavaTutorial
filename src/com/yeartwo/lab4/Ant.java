package com.yeartwo.lab4;

public class Ant {
	private int height;
	private int age;
	
	public Ant(){
		//height = 1; age = 1;
		this(1,1);
	}
	
	public Ant(int h, int a){
		height = h;
		age = a;
	}
	
	public int getHeight() {
		return height;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	public int getage() {
		return age;
	}
	
	public void setage(int age) {
		this.age = age;
	}
	
	public Ant copyme(){
		return new Ant(height,age);
	}
	
	public boolean equals(Ant a){
		return (a.height == height && a.age == age);
	}

}
