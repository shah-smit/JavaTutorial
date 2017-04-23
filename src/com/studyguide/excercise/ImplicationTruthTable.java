package com.studyguide.excercise;

public class ImplicationTruthTable {

	public static void main(String[] args) {
		boolean[] p = {false,false,true,true};
		boolean[] q = {false,true,false,true};
		
		for(int i=0; i<p.length; i++)
		{
			System.out.printf("%b | %b | %b \n", p[i],q[i], ((!p[i]) || q[i]));
		}
	}

}
