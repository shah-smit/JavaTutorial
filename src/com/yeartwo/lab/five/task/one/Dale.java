package com.yeartwo.lab.five.task.one;

public class Dale extends Character {
	public void greet(String str){
		System.out.println("I am Dale "+str);
		greet(1);
	}
}
