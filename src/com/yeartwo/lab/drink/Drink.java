package com.yeartwo.lab.drink;

public class Drink {
	String drinkID;
	double drinkCostPrice;
	public double getDrinkCostPrice() {
		return drinkCostPrice;
	}
	public void setDrinkCostPrice(double drinkCostPrice) {
		this.drinkCostPrice = drinkCostPrice;
	}
	public double getDrinkSellPrice() {
		return drinkSellPrice;
	}
	public void setDrinkSellPrice(double drinkSellPrice) {
		this.drinkSellPrice = drinkSellPrice;
	}
	public int getDrinkQuantitySold() {
		return drinkQuantitySold;
	}
	public void setDrinkQuantitySold(int drinkQuantitySold) {
		this.drinkQuantitySold = drinkQuantitySold;
	}
	double drinkSellPrice;
	int drinkQuantitySold;
	
	Drink(){
		this.drinkID = "";
		this.drinkSellPrice = this.drinkCostPrice = 0.0d;
		this.drinkQuantitySold = 0;
	}
	
	Drink(String drinkID){
		this.drinkID = drinkID;
		this.drinkSellPrice = this.drinkCostPrice = 0.0d;
		this.drinkQuantitySold = 0;
	}
	
	void updateQuantitySold(int qty)
	{
		this.drinkQuantitySold += qty;
	}
	
	double computeProfit()
	{
		double profit = (this.drinkSellPrice - this.drinkCostPrice)*this.drinkQuantitySold;
		return profit;
	}
	
	public String toString()
	{
		return "ID: "+this.drinkID + " Sell Price: "+this.drinkSellPrice+ " Cost Price: "+this.drinkCostPrice;
	}
}
