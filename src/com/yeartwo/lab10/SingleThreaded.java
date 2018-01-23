package com.yeartwo.lab10;

public class SingleThreaded extends Thread {

	SingleThreaded(){
		super("Alpha Thread");
	}
	
	SingleThreaded(String name){
		super(name);
	}
	
	public void run(){
		for(int i=0; i<10; i++){
			System.out.println("Name: "+getName() + "\n Count: "+i);
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		setName("Bravo Thread");
	}
	
	public static void main(String[] args){
		System.out.println("current: "+Thread.currentThread());
		SingleThreaded st = new SingleThreaded();
		System.out.println("after: "+st);
		st.run();
		System.out.println("after after: "+st);
	}

}
