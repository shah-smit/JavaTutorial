package com.tutorial.recursion;

public class Palindrome {
	public static void main(String[] args){
		System.out.println(IsPalindrome("Smit"));
		System.out.println(IsPalindrome("woow"));
		System.out.println(IsPalindrome("BeB"));
	}
	
	public static boolean IsPalindrome(String s){
		if(s.length() <= 1) return true;
		else if(s.charAt(0)== s.charAt(s.length()-1)) return IsPalindrome(s.substring(1, s.length()-1));
		else return false;
	}
}
