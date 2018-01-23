package com.yeartwo.lab10;

public class ThreadTest {
	
	public static void main(String[] args){
		ThreadSubClass tsc = new ThreadSubClass("ThreadSubClass 1");
		ThreadSubClass tsc2 = new ThreadSubClass("ThreadSubClass 2");
		
		//Runs Concurrently
		tsc.start();
		tsc2.start();
		
		ThreadImplementsRunnable tir = new ThreadImplementsRunnable("ThreadImplementsRunnable 1");
		ThreadImplementsRunnable tir2 = new ThreadImplementsRunnable("ThreadImplementsRunnable 2");
		
		//Runs Sequentially
		tir.run();
		tir2.run();
		
		Thread t1 = new Thread(tir);
		Thread t2 = new Thread(tir2);
		
		//Runs Concurrently
		t1.start();
		t2.start();
	}

}
