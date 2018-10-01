import java.util.Arrays;
import java.util.Random;

public class BinaryHeap {
	static int a[];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hi");
		CreateArray(10);
		int aa[] = a.clone();
		long nano = System.nanoTime();
		for(int i: a){
			System.out.print(i+" ");
		}
		for(int i=(a.length/2); i>=0; i--){
			addRoot(i,a.length);
		}
		System.out.println((System.nanoTime() - nano));
		nano = System.nanoTime();
//		insertionSort(aa);
		System.out.println((System.nanoTime() - nano));
		for(int i: a){
			System.out.print(i+" ");
		}
	}
	
	 public static void insertionSort(int array[]) {  
	        int n = array.length;  
	        for (int j = 1; j < n; j++) {  
	            int key = array[j];  
	            int i = j-1;  
	            while ( (i > -1) && ( array [i] > key ) ) {  
	                array [i+1] = array [i];  
	                i--;  
	            }  
	            array[i+1] = key;  
	        }  
	 }
	
	public static void addRoot(int index, int length){
		int leftChild = index*2;
		int swapIndex = leftChild;
		if(leftChild < length){
			int rightChild = leftChild+1;
			if(leftChild+1 < length && a[leftChild] < a[rightChild]){
				swapIndex = rightChild;
			}
			if(a[index] < a[swapIndex]){
				int t = a[index];
				a[index] = a[swapIndex];
				a[swapIndex] = t;
				addRoot(swapIndex,length);
			}	
		}
	}
	
	public static void CreateArray(int len){
		Random r = new Random();
		int[] array = new int[len];
		for (int a = 0; a < array.length; a++) {
		    if ((a + 1) % 10 != 0) {
		        array[a] = (a + 1) * 10;
		    } else {
		        array[a] = r.nextInt(1000);
		    }
		}
		a = array;
	}

}
