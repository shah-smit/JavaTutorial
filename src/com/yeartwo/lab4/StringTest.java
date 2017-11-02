package com.yeartwo.lab4;
/**
 * Lab 4 Task 1
 * This class is a introduction to the String i.e. a non-primitive object.
 * == Sign checks for the reference for the non-prmitive types
 * new keywords allocates a new memory to the object thus the reference of two object (created via new keyword) will not be same
 * .equals on the other side checks for the value a NOT the reference.
 * */
public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Apple";
		String str2 = "Apple";
		
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
		
		String str3 = new String("Apple");
		String str4 = new String("Apple");
		
		System.out.println(str3 == str4);
		System.out.println(str3.equals(str4));
		
		System.out.println(str1 == str3);
		System.out.println(str1.equals(str3));
	}

}
