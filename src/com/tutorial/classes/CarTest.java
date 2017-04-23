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
//		System.out.print("Slowest Car:");
		
		Car newCar = BMW;
		newCar.color = "black";
		int x = 50;
		String name = "smit";
		String newName = name;
		newName = "shah";
		alter(newCar,x,name);
		Car doubleCar = newCar;
		doubleCar.color = "red";
		int[] a = {1,2,3,4};
		int[] b = a;
		a[0] = 10;
		b[1] = 20;
		System.out.println(newCar.color+""+x+""+name+""+newName);
		
		System.out.println(b[0]+" <  > "+a[1]);
	
		
		System.out.println(true && false); //false
		System.out.println(true || false); //true
	}
	
	static void alter(Car x, int i,String s)
	{
		x.color ="alter";
		i = 1;
		s = "alteredName";
	}

}
