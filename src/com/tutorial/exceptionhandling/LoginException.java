package com.tutorial.exceptionhandling;

public class LoginException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	LoginException(String str){
		super(str);
	}
	
	public String getMessage(String s){
		return "Login Failed. You are not allowed entry,"+s;
	}
}
