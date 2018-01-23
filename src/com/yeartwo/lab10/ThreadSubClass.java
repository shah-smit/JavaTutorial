package com.yeartwo.lab10;

public class ThreadSubClass extends Thread {
	
	ThreadSubClass(String name){
		super(name);
	}
	
	public void run() {
		for(int i=0; i<5; i++){
			try {
				int rd = (int) (Math.random()*10);
				System.out.println("Name: "+getName()+ "\t Random: "+rd+"\t Iteration: "+i);
				sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} catch (Exception e){
				e.printStackTrace();
			}
		}
	}

}
