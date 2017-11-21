package com.yeartwo.lab.five.task.one;

public class Yale extends Character implements IGreet{
	public void greet(String str){
		System.out.println("I am yale. Good to see you!"+str);
	}
	
	public void greet(Object str){
		System.out.println("I am yale. "+str);
	}
}
