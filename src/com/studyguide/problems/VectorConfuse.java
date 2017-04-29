package com.studyguide.problems;
import java.util.*;
public class VectorConfuse {

	public static void main(String[] args) {
		Vector<Object> v = confuse();
		for(int i=0; i<v.size();i++)
		{
			System.out.println(v.elementAt(i));
		}
	}
	
	public static Vector<Object> confuse()
	{
		Vector<Object> v = new Vector<Object>();
		v.addElement("hello");
		v.addElement(v);
		v.addElement("Bye");
		return v;
	}

}
