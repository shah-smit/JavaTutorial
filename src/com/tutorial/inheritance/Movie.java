package com.tutorial.inheritance;

public class Movie extends Video{
	String Director;
	String Rating;
	
	public Movie(String title, int length, String director, String rating) {
		super(title,length);
		Director = director;
		Rating = rating;
	}
	
	void Display()
	{
		super.Show();
		System.out.println("Director: "+Director+" Rating: "+Rating);
	}
	
}
