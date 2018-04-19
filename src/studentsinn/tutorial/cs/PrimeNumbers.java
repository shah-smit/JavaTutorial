package studentsinn.tutorial.cs;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		//Initialization
		int N = 0;
		int i = 2;
		int[] arr = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		N = sc.nextInt();
		
		arr = new int[N];
		arr[N-1] = 1;
		N--;
		while(N>0){
			i++;
			boolean isPrime = true;
			for(int j=2; j<100;j++){
				if(j == i) continue;
				if(i%j == 0) {
					isPrime = false;
				}
			}
			if(isPrime) {
				arr[N-1] = i;
				N--;
			}
		}
		for(int j=arr.length-1; j>=0; j--){
			System.out.println(arr[j]);
		}
		sc.close();
	}

}
