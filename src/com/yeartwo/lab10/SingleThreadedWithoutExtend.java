package com.yeartwo.lab10;

public class SingleThreadedWithoutExtend {

	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		
		System.out.println("Current Thread: "+t);
		
		t.setName("Bravo Name");
		
		System.out.println(t);
			for(int i=0; i<10; i++){
				System.out.println("Name: "+t.getName() + "\n Count: "+i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
	}

}
