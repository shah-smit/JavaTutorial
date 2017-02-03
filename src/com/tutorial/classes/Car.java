package com.tutorial.classes;

public class Car {
	public String lincenseNo;
	public String color;
	public int speed;
	
	Car(String lincenseNo, String color, int speed)
	{
		this.lincenseNo = lincenseNo;
		this.color = color;
		this.speed = speed;
	}
	
	public Car() {
		// TODO Auto-generated constructor stub
	}

	public void accelerate(int val)
	{
		speed = speed + val;
		if(speed > 120)
		{
			speed = 120;
		}
	}
	
	public void brake(int val)
	{
		speed = speed - val;
		if(speed < 0)
		{
			speed = 0;
		}
	}
	
	public void horn()
	{
		System.out.println("Porr Porr");
	}
	
	public void display()
	{
		System.out.print(" Car "+lincenseNo);
		System.out.print(" Color "+color);
		System.out.println(" Speed "+speed);
	}

}
