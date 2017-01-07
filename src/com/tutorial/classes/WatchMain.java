package com.tutorial.classes;

public class WatchMain {

	public static void main(String[] args) {
		Watch tomWatch = new Watch("Casio","Red",45.5);
		Watch aliceWatch = new Watch("Olympus","Black",799.0);
		Watch johnWatch = new Watch("Swatch","Purple",149.0);
		
		Watch[] watches = {tomWatch, aliceWatch, johnWatch};
		
		Watch expensiveWatch = new Watch();
		Watch cheapWatch = watches[0];
		
		for(int i=0; i<watches.length; i++)
		{
			if(expensiveWatch.price < watches[i].price)
			{
				expensiveWatch = watches[i];
			}
			
			if(cheapWatch.price > watches[i].price)
			{
				cheapWatch = watches[i];
			}
		}
		System.out.print("Expensive Watch:");
		expensiveWatch.display();
		System.out.print("Cheap Watch:");
		cheapWatch.display();
	}

}
