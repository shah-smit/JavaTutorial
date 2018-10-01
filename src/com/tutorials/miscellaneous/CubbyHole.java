package com.tutorials.miscellaneous;

class CubbyHole{
	  private int contents;
	  private boolean available = false;
	  
	  public int get(){
		available = false;
		return contents;
	  }
	  
	  public void put(int value){
		contents = value;
		available = true;
	  }
	}

	class Consumer extends Thread{
	  private CubbyHole cubbyhole;
	  private int number;
	  
	  public Consumer(CubbyHole c, int number){
		cubbyhole = c;
		this.number = number;
	  }
	  
	  public void run(){
		int value = 0;
		for (int i = 0; i < 10; i++){
		  value = cubbyhole.get();
		  System.out.println("Consumer #" + this.number + " got: " + value);
	/*
		  try{//delay a bit after get (consume) to allow next put (produce)
			sleep((int)(Math.random() * 100));
		  } catch (InterruptedException e){ }
	*/
		}
	  }
	}

	class Producer extends Thread{
	  private CubbyHole cubbyhole;
	  private int number;
	  
	  public Producer(CubbyHole c, int number){
		cubbyhole = c;
		this.number = number;
	  }
	  
	  public void run(){
		for (int i = 0; i < 10; i++){
		  cubbyhole.put(i);
		  System.out.println("Producer #" + this.number + " put: " + i);
	/*
		  try{//delay a bit after put (produce) to allow next get (consume)
			sleep((int)(Math.random() * 100));
		  } catch (InterruptedException e){ }
	*/
		}
	  }
	}

	