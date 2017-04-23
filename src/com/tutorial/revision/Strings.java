package com.tutorial.revision;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "123";
		String s2 = s1;
		String s3 = new String("123");
		String s4 = new String("123");
		String s5 = "123";
		
		System.out.println(s1.equals(s5));
		System.out.println(s2.equals(s4));
		System.out.println(s3.equals(s3));
		System.out.println(s4.equals(s2));
		System.out.println(s5.equals(s1));
		
		
	}

}
