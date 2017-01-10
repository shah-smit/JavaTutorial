package com.tutorial.inheritance;

public class Video {
	String Title;
	int Length;
	boolean Available;
	
	Video(String title, int length)
	{
		Title = title;
		Length = length;
		Available = true;
	}
	
	void Show()
	{
		System.out.println("Title: "+Title+" Length: "+Length+" Available: "+Available);
	}
	
	void Show(boolean isTrue)//override
	{
		System.out.println("Title: "+Title+" Length: "+Length+" Available: "+isTrue);
	}

}
