package com.studyguide.excercise;

public class SortingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sort(2,1);
	}
	
	static void sort(int a, int b)
	{
		int nums[] = {a,b};
		sort(nums);
		for(int i=0; i<nums.length; i++)
		{
			System.out.println(nums[i]);
		}
	}
	
	static void sort(int nums[]){
		
		for(int i=0; i<nums.length; i++)
		{
			for(int j=i; j<nums.length; j++)
			{
				if(nums[i] > nums[j])
				{
					int temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
				}
			}
		}
		
		//return nums;
	}

}
