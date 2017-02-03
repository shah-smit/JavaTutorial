package com.tutorial.advanceclasses;

public class EZLinkCard {
	String cardNumber;
	double balance;
	
	public EZLinkCard(String cardNumber, double balance) {
		this.cardNumber = cardNumber;
		this.balance = balance;
	}
	
	public EZLinkCard(){}
	
	void topup(double add)
	{
		balance += add;
	}
	
	void deduct(double deductValue)
	{
		balance -= deductValue;
		if(balance <= 0) balance = 0;
	}
	
	void display()
	{
		System.out.println(toString());
	}
	
	public String toString()
	{
		return "The Card: "+cardNumber+ " has a balance of "+balance;
	}
	

}
