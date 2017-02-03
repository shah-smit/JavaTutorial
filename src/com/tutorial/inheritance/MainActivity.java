package com.tutorial.inheritance;

public class MainActivity {

	public static void main(String[] args) {
		Movie movie = new Movie("Mitty",120,"Ben Stiller","5 stars");
		movie.Display();
		
		MusicVideo musicVideo = new MusicVideo("Mitty",120,"Ben Stiller","POP");
		musicVideo.Show();
	}

}
