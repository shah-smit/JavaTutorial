package com.yeartwo.lab.five.task.one;

public interface IGreet {
	public abstract void greet(String str);
	
	public static void greet(int n){
		System.out.println("Greetings from GreetInterface");
	}
}
