package com.studyguide.problems;

import java.util.ArrayList;
import java.util.Vector;

public class VectorMaze {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Object> v = new Vector<Object>();
		v.add(new Integer(4));
		v.add("4");
		v.addElement((int)v.get(0)+Integer.parseInt(v.get(1).toString()));
		v.addElement((Integer)v.get(0)+(String)v.get(1));
		System.out.println(v.get(2));
		System.out.println(v.get(3));
	
		Vector<String> s = new Vector<String>();
		s.addElement("baa");
		s.addElement("baa");
		System.out.println(s.size());
		
		ArrayList<String> a = new ArrayList<String>();
		a.add("baa");
		a.add("baa");
		System.out.println(a.size());
	}

}
