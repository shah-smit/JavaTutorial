package com.tutorial.six;

import java.util.Scanner;

public class InputFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Enter 2 String seperate by blank space:");
		String string1 = in.next();
		String string2 = in.next();
		System.out.println(string1 + " " + string2);
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter 2 String seperate by blank space:");
		int n = keyboard.nextInt();
		keyboard.nextLine();
		String s1 = keyboard.nextLine();
		String s2 = keyboard.nextLine();
		System.out.printf("n: %d s1: %s s2: %s", n,s1,s2);
		in.close();
		keyboard.close();

	}

}
