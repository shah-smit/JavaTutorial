package com.tutorial.five;

import java.util.Scanner;

public class HollowPatern {

	public static void main(String[] args) {
			Scanner in =  new Scanner(System.in);
			System.out.print("Enter length: ");
			int length = in.nextInt();
			int count =1;
			
			
			for (int i=length;i>0;i--)
			{
				for (int j =0; j<i-1;j++){
					System.out.print(" ");	
				}
				for (int j=0;j<count;j++)
				{
					if(j==0 ||j==count-1)
					{
						System.out.print("*");
					}
					else
					{
						System.out.print(" ");
					}
				}
				count+=2;
				System.out.println();
			}
			
			in.close();
	}

}
