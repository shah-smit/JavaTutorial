package com.tutorial.four;

public class StringClassTest {
	public static void main(String[] args)
	{
		String a = "abc";
		String ab = a.substring(1,3);
		System.out.println(ab);
		if(a.substring(1,3) == "bc")
		{
			System.out.println("TRUE");
		}
		if(ab.equals("bc"))
		{
			System.out.println("TRUE1");
		}
		String name = "smit";
		if(name == "smit")
		{
			System.out.println(name);
		}
		System.out.println(name.substring(1, 2) == "s");
		
		String n = "3.2";
		double n1 = Double.parseDouble(n);
		System.out.println("Double of n is"+n1);
		
		
	}
}
