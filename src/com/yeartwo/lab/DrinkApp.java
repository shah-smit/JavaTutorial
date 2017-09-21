package com.yeartwo.lab;

public class DrinkApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Drink latte = new Drink("latte");
		latte.setDrinkCostPrice(2.0);
		latte.setDrinkSellPrice(3.50);
		latte.setDrinkQuantitySold(30);
		
		Drink mocca = new Drink("mocca");
		mocca.setDrinkCostPrice(2.0);
		mocca.setDrinkSellPrice(3.50);
		mocca.setDrinkQuantitySold(30);
		
		mocca.updateQuantitySold(10);
		
		Drink espresso = new Drink("espresso");
		espresso.setDrinkCostPrice(2.0);
		espresso.setDrinkSellPrice(3.50);
		espresso.setDrinkQuantitySold(30);
		
		System.out.println(latte);
		System.out.println(mocca);
		System.out.println(espresso);
		
		System.out.println();
		
		System.out.println("Latte Profit: "+latte.computeProfit());
		System.out.println("Mocca Profit: "+mocca.computeProfit());
		System.out.println("Espresso Profit: "+espresso.computeProfit());
		
		System.out.println();
		
		System.out.print("This profit: ");
		System.out.print(latte.computeProfit()+mocca.computeProfit()+espresso.computeProfit());
	}

}
