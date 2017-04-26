package com.studyguide.problems;

public class StringBuilderTest {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Smit");
		StringBuffer sr = new StringBuffer(sb);
		String name = "Smit";
		if(sb.toString() == name){ System.out.println(true);}
		if(sb.toString() == sr.toString()){ System.out.println(true);}
		
		if(sb.toString().equals(name)){ System.out.println(true);}
		if(sb.toString().equals(sr.toString())){ System.out.println(true);}

	}

}
