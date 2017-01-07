package com.tutorial.recursion;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverse("hello"));
	}
	
	public static String reverse(String n)
	{
		String r = "";
		for(int i = n.length()-1; i>=0; i--)
		{
			r = r + n.charAt(i);
			System.out.println(r);
		}
		return r;
	}

}
