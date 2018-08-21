package com.tutorial.algorithmns;


public class MergeArray {

	public static void main(String[] args) {
		int[] a = {1,3,7,11,13};
		int[] b = {2,4,9,10,12};
		
		System.out.println("-- Merge --");
		int[] ab = merge(a,b,new int[a.length+b.length]);
		for(int i=0; i<ab.length; i++){
			System.out.print(ab[i]+" ");
		}
		System.out.println();
		System.out.println("-- Sort --");
		int[] ac = mergesort(a,b,new int[a.length+b.length]);
		for(int i=0; i<ac.length; i++){
			System.out.print(ac[i]+" ");
		}

	}
	
	public static int[] merge(int[] a, int[] b, int[] c){
		if(a.length <= 0 && b.length <= 0) return c;
		else{
			if(a.length > 0){
				addItem(c,a[a.length-1]);
				a = shrink(a);
			}
			else{
				addItem(c,b[b.length-1]);
				b = shrink(b);
			}
			return merge(a,b,c);
		}
	}
	public static int[] mergesort(int[] a, int[] b){
		return null;
	}
	
	public static int[] mergesort(int[] a, int[] b, int[] c){
		if(a.length <= 0 && b.length <= 0) return c;
		else{
			if(a.length <= 0){
				addItem(c,b[0]);
				b = shrink(b,b[0]);
			}
			else if(b.length <= 0){
				addItem(c,a[0]);
				a = shrink(a,a[0]);
			}
			else if(a[0] < b[0]){
				addItem(c,a[0]);
				a = shrink(a,a[0]);
			}
			else if(a[0] > b[0]){
				addItem(c,b[0]);
				b = shrink(b,b[0]);
			}
			return mergesort(a,b,c);
		}
	}
	
	public static void addItem(int[] c, int item){
		for(int i=0; i<c.length; i++){
			if(c[i] == 0){
				 c[i] = item;
				 break;
			}
		}
	}
	
	public static int[] shrink(int[] a){
		int[] shrinkedA = new int[a.length-1];
		for(int i=0; i<shrinkedA.length; i++){
			shrinkedA[i] = a[i];
		}
		return shrinkedA;
	}
	
	public static int[] shrink(int[] a, int item){
		int[] shrinkedA = new int[a.length-1];
		for(int i=0, j=0; i<a.length && j<shrinkedA.length; i++){
			
			if(a[i] == item){
				continue;
			}
			else {
				shrinkedA[j] = a[i];
				j++;
			}
		}
		return shrinkedA;
	}

}
