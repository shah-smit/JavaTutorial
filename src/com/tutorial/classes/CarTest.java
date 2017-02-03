package com.tutorial.classes;

public class CarTest {

	public static void main(String[] args) {

		Car toyota = new Car("TOYOTA 1032","red",0);
		toyota.accelerate(80);
		
		Car BMW = new Car("BMW 999","blue",0);
		
		Car[] cars = {toyota,BMW};
		
		Car slowestCar = cars[0];
		for(int i=0; i<cars.length; i++)
		{
			
			if(slowestCar.speed > cars[i].speed)
			{
				slowestCar = cars[i];
			}
		}
		System.out.print("Slowest Car:");
		slowestCar.display();
	}

}
