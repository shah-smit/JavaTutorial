package com.tutorial.algorithmns;

public class IA2018 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		proc(new int[]{37,11,52,7},0,3);
	}
	
	public static void proc(int[] data, int lo, int hi){
		if(lo < hi){
			if(data[lo] < data[lo+1]){
				int t = data[lo+1];
				data[lo+1] = data[lo];
				data[lo] = t;
			}
		}
		proc(data,lo+1, hi);
		if(lo == 0)
			proc(data,0,hi-1);
		
//		printNumbers(data);
	}
	
	 private static void printNumbers(int[] input) {
	        
	        for (int i = 0; i < input.length; i++) {
	            System.out.print(input[i] + ", ");
	        }
	        System.out.println("\n");
	    }

}
