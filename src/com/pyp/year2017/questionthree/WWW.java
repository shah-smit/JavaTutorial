package com.pyp.year2017.questionthree;

import java.util.ArrayList;

public class WWW {

	public static void main(String[] args) {
		ArrayList<Vehicle> a = new ArrayList<Vehicle>();
		a.add(new Vehicle());
		a.add(new Bicycle());
		a.add(new MountainBicycle());
		ArrayList<Bicycle> b = new ArrayList<Bicycle>();
		//b.add(new Vehicle()); Error
		b.add(new Bicycle());
		b.add(new MountainBicycle());
		
	}

}
