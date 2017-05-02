package com.tutorial.five;

import java.util.Vector;

public class PatternTwo {
	
	public static Vector<String> q(Vector<String> b){
		Vector<String> a = new Vector<String>();
		int small = 0;
		
		if(b.size() > 0){
			small = b.get(0).length();
		}
		
		
		for(int i=0; i<b.size(); i++)
		{
			if(small > b.get(i).length()){
				small = b.get(i).length();
			}
		}
		
		for(int i=0; i<b.size(); i++)
		{
			if(small == b.get(i).length()){
				a.add(b.get(i));
			}
		}
		
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int totalHeight = 4;
		for(int i=totalHeight-1; i>=0; i--)
		{
			
			for(int j=0; j<totalHeight; j++)
			{
					if(j < i)
					{
						System.out.print(" ");
					}
					else
					{
						System.out.print("*");
					}
			}
			System.out.println();
		}
	}

}
