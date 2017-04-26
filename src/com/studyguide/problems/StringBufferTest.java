package com.studyguide.problems;

public class StringBufferTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Smit";
		String fname = "Smit";
		if(name.equals(fname)) System.out.println("name.equals(fname) "+true);
		if(name == fname) System.out.println("name == fname "+true);
		
		StringBuffer sb = new StringBuffer("Smit");
		
		StringBuffer sb1 = new StringBuffer("Smit");
		System.out.print("name == sb.toString() "); if(name==sb.toString()) System.out.println(true); else System.out.println(false);
		System.out.print("sb.toString() == sb1.toString() "); if(sb.toString()==sb1.toString()) System.out.println(true); else System.out.println(false);
		System.out.print("sb == sb1 "); if(sb == sb1) System.out.println(true); else System.out.println(false);
		System.out.println("sb.equals(sb1) "+(sb.equals(sb1)));
		
		StringBuffer sb2 = sb1; //assigning sb1 to sb2
		if(sb1 == sb2) System.out.println("sb1 == sb2 "+true); //will result true because sb1 and sb2, are referring to the same location.
		sb1.append("s"); //appending sb1 by adding s to the sb1 value. sb1 and sb2 are looking at the same memory location so both the values will be changed.
		System.out.println(sb1);
		System.out.println(sb2);
		if(sb1 == sb2) System.out.println("sb1 == sb2 "+true); //will result true because sb1 and sb2, are referring to the same location.
		sb2.append("s"); //appending sb2 by adding s to the sb2 value. sb1 and sb2 are looking at the same memory location so both the values will be changed.
		System.out.println(sb1);
		System.out.println(sb2);
		if(sb1 == sb2) System.out.println("sb1 == sb2 "+true); //will result true because sb1 and sb2, are referring to the same location.
		
		String s = "s";
		String sn = new String(s);
		String snw = sn;
		sn += "s";
		
		
		if(s == sn) System.out.println("true"); else System.out.println("false");
		if(sn == snw) System.out.println("true"); else System.out.println("false");
	
	}

}
