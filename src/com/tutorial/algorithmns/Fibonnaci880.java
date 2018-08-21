package com.tutorial.algorithmns;

public class Fibonnaci880 {
	static long[] a;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int f = 8;
		int ff = 10;
		long start = System.nanoTime();
		
		
		a = new long[81];
		start = System.nanoTime();
		System.out.println(fib(8));
		System.out.println(System.nanoTime() - start);

		a = new long[81];
		start = System.nanoTime();
		System.out.println(fib(80));
		System.out.println(System.nanoTime() - start);
		a = new long[81];
		start = System.nanoTime();
		System.out.println(fibIterate(8));
		System.out.println(System.nanoTime() - start);
		a = new long[81];
		start = System.nanoTime();
		System.out.println(fibIterate(80));
		System.out.println(System.nanoTime() - start);
	}
	
	public synchronized static long fib(int n){
		if(n <= 0) return 1;
		else{
			return fib(n-1) + fib(n-2);
		}
	}
	
	public synchronized static long fibdyn(int n){
		if(n <= 0) return 1;
		else{
			if(a[n] != 0) return a[n];
			else {
				a[n] = fib(n-1)+fib(n-2);
				return a[n];
			}
		}
	}
	
	public synchronized static long fibIterate(int n){
		long low = 1;
		long high = 1;
		for(int i=0; i<n; i++){
			long oldhigh = high;
			high = low + high;
			low = oldhigh;
		}
		return high;
	}
	

}
