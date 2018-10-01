package com.tutorial.datastructures;

public class QueueWithArray {

	int[] array;
	int frontIndex = -1;
	int rearIndex = -1;
	
	public QueueWithArray(int n){
		array = new int[n];
		for(int i=0; i<n; i++) array[i] = Integer.MIN_VALUE;
	}
	
//	public void enqueue(int newItem) throws Exception{
//		
//		if(frontIndex == -1 && rearIndex == -1){
//			array[0] = newItem;
//			frontIndex = 0;
//			rearIndex = 0;
//		} 
//		else{
//			if(rearIndex == (array.length-1)){
//				int count = 0;
//				rearIndex = 0;
//				while(array[rearIndex] != Integer.MIN_VALUE && count <= (array.length-1)){
//					rearIndex++;
//					count++;
//				}
//				if(count != (array.length-1)) array[rearIndex] = newItem;
//				else throw new Exception("Queue is Full");
//			}
//			else{
//				array[rearIndex+1] = newItem;
//				rearIndex++;
//			}
//		}
//	}
	
	public void enqueue(int newItem)throws ArrayIndexOutOfBoundsException{
		int index = rearIndex+1;
		if(index > array.length-1) index = 0;
		
		if(array[index] == Integer.MIN_VALUE){
			array[index] = newItem;
			rearIndex = index;
			if(frontIndex == -1) frontIndex = 0;
		}
		else{
			throw new ArrayIndexOutOfBoundsException("Queue Is Full!");
		}
	}
	
	
	
	
	
	
	public int dequeue(){
		if(frontIndex != -1){
			int prev = array[frontIndex];
			array[frontIndex] = Integer.MIN_VALUE;
			if(++frontIndex >= array.length) frontIndex = 0;
			return prev;
		}
		return -1;
	}
	

	public static void main(String[] args) {
		QueueWithArray q = new QueueWithArray(4);
		try{
			q.enqueue(4);
			q.enqueue(5);
			q.enqueue(10);
			q.enqueue(11);
			System.out.println(q.dequeue());
			q.enqueue(50);
			System.out.println(q.dequeue());
			System.out.println(q.dequeue());
			System.out.println(q.dequeue());
			System.out.println(q.dequeue());
		}
		catch(Exception ex){
			System.out.println(ex.getMessage());
		}
	}

}
