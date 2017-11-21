package com.yeartwo.lab.five.task.one;

public class SeaBirdColony {

	public static void main(String[] args) {
		Dale dale = new Dale();
		Yale yale = new Yale();
		
		// Character var = new Character();//cannot do this, because Character class is a Abstract Class.
		Character var = new Dale(); 
		var.greet("It should be from character");
		
		var = dale;
		var.greet("It should be from dale");
		
		var = yale;
		var.greet("It should be from yale");
		
		yale.greet("Hi");
		yale.greet((Object) "Hi");
		
		dale.greet("Hi");;
		
		IGreet.greet(1);
	}

}
