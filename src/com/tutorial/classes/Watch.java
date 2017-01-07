package com.tutorial.classes;

public class Watch {
	public String brand;
	public String color;
	public double price;
	
	Watch(){}
	
	public Watch(String brand, String color, double price) {
		this.brand = brand;
		this.color = color;
		this.price = price;
	}
	
	public void display()
	{
		System.out.print(" Brand: "+brand);
		System.out.print(" Color: "+color);
		System.out.println(" Price: "+price);
	}
	
}
