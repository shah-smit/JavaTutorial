package com.exam.problems;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPalindrome("rac!car"));
	}
	
	public static boolean isPalindrome(String s){
		boolean palindrome = true;
		  for(int i=0; i<s.length()/2;i++){
		    char start = s.charAt(i);
		    if(!Character.isLetter(start)) continue;
		    char end = s.charAt(s.length()-1-i);
		    System.out.println(start+" "+end);
		    if(start != end) {palindrome=false; break; }
		  }
		  return palindrome;
		}

}
