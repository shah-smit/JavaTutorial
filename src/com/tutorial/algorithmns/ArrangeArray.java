package com.tutorial.algorithmns;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ArrangeArray {

	public static void main(String[] args) throws Exception {
		ArrangeArray aa = new ArrangeArray();

		// Generating random array of size 50
//		int[] a = randomArray(5);
//		long t = System.currentTimeMillis();
//		aa.algo(a);
//		System.out.println(System.currentTimeMillis() - t);
//		
//		int[] b = randomArray(50);
//		t = System.currentTimeMillis();
//		aa.algo(b);
//		System.out.println(System.currentTimeMillis() - t);
//		
//		int[] c = randomArray(500);
//		t = System.currentTimeMillis();
//		aa.algo(c);
//		System.out.println(System.currentTimeMillis() - t);
//		
//		int[] d = randomArray(5000);
//		t = System.currentTimeMillis();
//		aa.algo(d);
//		System.out.println(System.currentTimeMillis() - t);
//		
//		int[] e = randomArray(50000);
//		t = System.currentTimeMillis();
//		aa.algo(e);
//		System.out.println(System.currentTimeMillis() - t);
//		
//		int[] f = randomArray(500000);
//		t = System.currentTimeMillis();
//		aa.algo(f);
//		System.out.println(System.currentTimeMillis() - t);
		
		//This doesn't work.
//		int[] g = randomArray(5000000);
//		long t = System.currentTimeMillis();
//		aa.algo(g);
//		System.out.println(System.currentTimeMillis() - t);
	}

	public void algo(int[] a) throws Exception {
		// As known there are three unique values, there are three objects of
		// ItemCount
		ItemCount x = null;
		ItemCount y = null;
		ItemCount z = null;

		// Linear search to scan through every element of the array and
		// appending the objects according.
		// Tracking the count with the item
		
		for (int i = 0; i < a.length; i++) {
			int temp = a[i];
			System.out.print(temp + " ");
			if (x == null)
				x = new ItemCount(temp);
			else if (x.item == a[i])
				x.increment();
			else if (y == null)
				y = new ItemCount(temp);
			else if (y.item == a[i])
				y.increment();
			else if (z == null)
				z = new ItemCount(temp);
			else if (z.item == a[i])
				z.increment();
			// As the problem is only expected to receive values with utmost
			// three unique values.
			else {
				throw new Exception("More than 3 unique values");
			}
		}
		System.out.println();

		// Initializing the resultant array to be displayed to the user.
		// It is the same size as the inputed array{a}.
		int[] res = new int[a.length];

		if (x.count >= y.count && x.count >= z.count) {
			// System.out.println(x.item + " is highest with count of
			// "+x.count);
			for (int i = 0; i < x.count; i++) {
				res[i] = x.item;
			}
			if (y.count >= z.count) {
				// System.out.println(y.item + " is second highest with count of
				// "+y.count);
				// System.out.println(z.item + " has lowest count of "+z.count);
				for (int i = 0; i < y.count; i++) {
					res[x.count + i] = y.item;
				}
				for (int i = 0; i < z.count; i++) {
					res[x.count + y.count + i] = z.item;
				}
			} else if (z.count >= y.count) {
				// System.out.println(z.item + " is second highest with count of
				// "+z.count);
				// System.out.println(y.item + " has lowest count of "+y.count);
				for (int i = 0; i < z.count; i++) {
					res[x.count + i] = z.item;
				}
				for (int i = 0; i < y.count; i++) {
					res[x.count + z.count + i] = y.item;
				}
			}
		} else if (y.count >= x.count && y.count >= z.count) {
			// System.out.println(y.item + " is highest with count of
			// "+y.count);
			for (int i = 0; i < y.count; i++) {
				res[i] = y.item;
			}

			if (x.count >= z.count) {
				// System.out.println(x.item + " is second highest with count of
				// "+x.count);
				// System.out.println(z.item + " has lowest count of "+z.count);
				for (int i = 0; i < x.count; i++) {
					res[y.count + i] = x.item;
				}
				for (int i = 0; i < z.count; i++) {
					res[y.count + x.count + i] = z.item;
				}
			} else if (z.count >= x.count) {
				// System.out.println(z.item + " is second highest with count of
				// "+z.count);
				// System.out.println(x.item + " has lowest count of "+x.count);
				for (int i = 0; i < z.count; i++) {
					res[y.count + i] = z.item;
				}
				for (int i = 0; i < x.count; i++) {
					res[y.count + z.count + i] = x.item;
				}
			}
		} else if (z.count >= x.count && z.count >= y.count) {
			// System.out.println(z.item + " is highest with count of
			// "+z.count);
			for (int i = 0; i < z.count; i++) {
				res[i] = z.item;
			}
			if (x.count >= y.count) {
				// System.out.println(x.item + " is second highest with count of
				// "+x.count);
				// System.out.println(y.item + " has lowest count of "+y.count);
				for (int i = 0; i < x.count; i++) {
					res[z.count + i] = x.item;
				}
				for (int i = 0; i < y.count; i++) {
					res[z.count + x.count + i] = y.item;
				}
			} else if (y.count >= x.count) {
				// System.out.println(y.item + " is second highest with count of
				// "+y.count);
				// System.out.println(x.item + " has lowest count of "+x.count);
				for (int i = 0; i < y.count; i++) {
					res[z.count + i] = y.item;
				}
				for (int i = 0; i < x.count; i++) {
					res[z.count + y.count + i] = x.item;
				}
			}
		}
		for (int i = 0; i < res.length; i++) {
			System.out.print(res[i] + " ");
		}
		System.out.println();
	}

	public static int[] randomArray(int n) {
		Random rand = new Random();

		int x = rand.nextInt(n) + 1;
		int y = rand.nextInt(n) + 1;
		int z = rand.nextInt(n) + 1;
		int a[] = new int[(x + y + z)];

		for (int i = 0; i < x; i++) {
			a[i] = 0;
		}
		for (int i = 0; i < y; i++) {
			a[x + i] = 1;
		}
		for (int i = 0; i < z; i++) {
			a[x + y + i] = 2;
		}
		shuffleArray(a);
		return a;
	}

	// https://stackoverflow.com/questions/1519736/random-shuffling-of-an-array
	static void shuffleArray(int[] ar) {
		// If running on Java 6 or older, use `new Random()` on RHS here
		Random rnd = ThreadLocalRandom.current();
		for (int i = ar.length - 1; i > 0; i--) {
			int index = rnd.nextInt(i + 1);
			// Simple swap
			int a = ar[index];
			ar[index] = ar[i];
			ar[i] = a;
		}
	}

	class ItemCount {
		int item;
		int count;

		ItemCount(int item) {
			this.item = item;
			this.increment();
		}

		void increment() {
			count += 1;
		}

		public String toString() {
			return item + ":" + count;
		}

	}

}
