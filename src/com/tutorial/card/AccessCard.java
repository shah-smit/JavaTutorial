package com.tutorial.card;

public class AccessCard extends Card{
	private String Name;
	int Security;
	
	AccessCard(String cardNumber,String name, int secuirty) {
		super(cardNumber);
		Name = name;
		Security = secuirty;
	}
	
	String getName()
	{
		return Name;
	}
	
	void setName(String newName)
	{
		Name = newName;
	}
	
	void setSecurity(int security)
	{
		Security = security;
	}
	
	boolean checkExpired(int val)
	{
		if(val > getYearExpired()) return false;
		return true;
	}
	
	boolean checkClearance(int security)
	{
		if(security > this.Security && checkExpired(2017)) return true;
		return false;
	}
	
	void display()
	{
		super.display();
		System.out.println("Name: "+Name+ " Security"+Security);
	}

}
