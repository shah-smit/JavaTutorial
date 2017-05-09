package com.exam.problems;

public class EmailChecker {
	public static String domain;
	public static String username;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String email = "smit.@trabble.com";
		if(!valid(email)){ System.out.println("Invalid email entered: "+email);}
		else{ System.out.println("Username: "+username+" Domain: "+domain);}
	}
	
	public static boolean valid(String email){
		boolean isValid = true;
		
		int indexAt = email.indexOf('@');
		int indexDot = email.indexOf('.');
		if(indexAt <= 0 || indexDot <= 0){ isValid = false;}
		else{
			username = email.substring(0, indexAt);
			domain = email.substring(indexAt+1);
			if(username.indexOf('@') >= 0|| username.indexOf('.') >=0 || domain.indexOf('@') >= 0){ isValid = false; }
		}
		
		return isValid;
	}

}
