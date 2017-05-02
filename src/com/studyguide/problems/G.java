package com.studyguide.problems;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class G {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		double a =1,b=1.0;
		double c;
		c = a/2+b;
		pb(4);
			
		System.out.print("hi smit"+c+1);
		Integer o=new Integer(5); 
		ObjectOutputStream out= new ObjectOutputStream (new FileOutputStream("fred")); 
		out.writeObject(o); 
		out.flush(); 
		out.close(); 
		ObjectInputStream z = new ObjectInputStream(new FileInputStream("fred")); 
		Object x = z.readObject(); 
		System.out.println(x); 
	}
	
	public static void pb(int n){
		if(n!=0){
			pb(n/2);
			System.out.println(n%2);
		}
	}
}
