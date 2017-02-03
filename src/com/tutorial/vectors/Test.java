package com.tutorial.vectors;

import java.util.Vector;

public class Test {
	static Vector<Integer> stringVector = new Vector<Integer>();
	public static void main(String[] args) {
		//Vecotr will put 1 in the integer object first and then will add it in the array!
		stringVector.add(1);
		stringVector.addElement(2);
		stringVector.addElement(501);
		stringVector.addElement(21);
		stringVector.addElement(218);
		
		
		System.out.println("Size: "+stringVector.size());
		printVector();
		
		System.out.println("Remove element at index 0");
		stringVector.removeElementAt(0);
		printVector();
		
		
		System.out.println("Replace index 0 with '3'");
		stringVector.setElementAt(3, 0);
		printVector();
		
		System.out.println("Largest: "+largest(stringVector));
	}
	
	public static void printVector()
	{
		System.out.println("**********************");
		for(int i=0; i<stringVector.size(); i++)
		{
			System.out.println(stringVector.get(i));
		}
		System.out.println("**********************");
	}
	
	public static int largest(Vector <Integer> v){
		int largestsofar;
		
		if (v.size()>0){
			largestsofar= v.elementAt(0);
	
			for (int i=0;i<v.size();i++){	
				if (largestsofar< v.elementAt(i)){	
	                              			largestsofar= v.elementAt(i);
				}
			}
	
			return largestsofar;
		}
			
		return 0;
	} 


}
