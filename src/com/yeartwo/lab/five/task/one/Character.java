package com.yeartwo.lab.five.task.one;
/*
 * Abstract class can't make an instance of an abstract class
 * */
public abstract class Character {
	
	abstract void greet(String str);//All the subclasses must invoke this method.
	
	void greet(int n){
		System.out.println("Greetings from Character");
	}

}
