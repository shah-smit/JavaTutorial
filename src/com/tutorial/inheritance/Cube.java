package com.tutorial.inheritance;

public class Cube extends Rectangle {
	public double height;
	
	public Cube(double len, double wid,double height) {
		super(len, wid);
		this.height = height;
	}
	
	public double getSurfArea(){
		return getArea()*height;
	}
	
	public void dimensions(){
		super.dimensions();
		System.out.println("Height "+height);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cube myCube = new Cube(2.0,2.0,2.0);
		myCube.dimensions();
	}

}
