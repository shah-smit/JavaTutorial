package com.tutorial.card;

public class Card {
	String CardNumber;
	private int YearExpired;
	
	Card(String cardNumber)
	{
		this.CardNumber = cardNumber;
	}
	
	int getYearExpired()
	{
		return YearExpired;
	}
	
	void setYearExpired(int yearExpired)
	{
		YearExpired = yearExpired;
	}
	
	void display()
	{
		System.out.println("CardNumber: "+CardNumber+" YearExpired:"+YearExpired);
	}
}
