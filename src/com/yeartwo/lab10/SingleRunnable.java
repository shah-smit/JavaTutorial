package com.yeartwo.lab10;

public class SingleRunnable implements Runnable {
	String name;
	
	SingleRunnable(String name){
		this.name = name;
	}
	
	@Override
	public void run() {
		for(int i=0; i<10; i++){
			System.out.println("Name: "+getName() + "\n Count: "+i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		setName("Bravo Thread");
		
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	
	public static void main(String[] args) {
		Thread t = new Thread(new SingleRunnable("Thread 1"));
		Thread t1 = new Thread(new SingleRunnable("Thread 2"));
		t.run();
		t1.run();
	}

}
