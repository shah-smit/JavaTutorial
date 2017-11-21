package com.yeartwo.lab.five.task.interfaceabstract;

public class Submarine implements Swimable {

	@Override
	public void swim() {
		throw new IllegalArgumentException("Method not implmeneted");
	}
	
	public static void main(String[] args){
		Submarine sub = new Submarine();
		sub.swim();
	}

}
