package com.tutorial.algorithmns;

import java.util.HashSet;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet hs = new HashSet();
	}

	/**
	 * MergeSort(A, start, end)
	 * check if start < end
	 * find middle
	 * MergeSort(A, start, middle)
	 * MergeSort(A, middle+1, end)
	 * Merge(A, start, middle, end)
	 */
	
	
	/**
	 * Merge(A, start, middle, end)
	 * Create two temp array
	 * first temp will handle the first half array i.e. size =  mid - start + 1
	 * second temp will handle the second half array i.e. size = end - mid
	 * Copy the data from main Array(A) to left array and right array respectively.
	 */
}
