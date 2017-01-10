package com.tutorial.card;

public class EzLinkCard extends Card {
	double Balance;
	
	EzLinkCard(String cardNumber, double Balance) {
		super(cardNumber);
		this.Balance = Balance;
	}
	
	void topUp(double value)
	{
		Balance += value;
	}
	
	void deduct(double value)
	{
		Balance -= value;
	}
	
	void display()
	{
		super.display();
		System.out.println("Balance: "+Balance);
	}
	
}
