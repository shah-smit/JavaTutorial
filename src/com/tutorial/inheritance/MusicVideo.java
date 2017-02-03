package com.tutorial.inheritance;

public class MusicVideo extends Video{
	String Artist;
	String Category;
	
	public MusicVideo(String title, int length, String artist, String category) {
		super(title,length);
		Artist = artist;
		Category = category;
	}
	
	void Show() //overload
	{
		super.Show();
		System.out.println("Artist: "+Artist+" Category: "+Category);
	}
	
}
