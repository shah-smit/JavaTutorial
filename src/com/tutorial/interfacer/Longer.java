package com.tutorial.interfacer;

public class Longer implements ordering
{
	public boolean compare(Object s, Object t)
	{
		if(t.toString().length() > s.toString().length())
		{
			return true;
		}
		else return false;
	}
	
	public static void main(String[] args)
	{
		Longer lg = new Longer();
		Object b = new Object();
		b = "Smit";
		
		Object c = new Object();
		c = "Shaing";
	}
}
