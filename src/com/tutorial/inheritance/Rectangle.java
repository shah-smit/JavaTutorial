package com.tutorial.inheritance;

public class Rectangle {
	private double length;
	private double width;
	
	public Rectangle(double len, double wid){
		this.length = len;
		this.width = wid;
	}
	
	public double getArea(){
		return length*width;
	}
	
	public void dimensions(){
		System.out.println("Length: "+length);
		System.out.println("Width: "+width);
	}
}
