package com.tutorial.advanceclasses;

import java.util.Random;
import java.util.Scanner;

public class EZLinkCardMain {

	public static void main(String[] args) {
		EZLinkCard[] ezCards = new EZLinkCard[10];
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the id of the card to see the value: ");
		String id = in.nextLine();
		
		for(int i=0; i<ezCards.length; i++)
		{
			
			if(i == 0)
			{
				ezCards[i] = new EZLinkCard("4567",20.0);
			}
			else if(i == 3)
			{
				ezCards[i] = new EZLinkCard("4321",25.0);
			}
			else if(i == 7)
			{
				ezCards[i] = new EZLinkCard("9876",28.0);
			}
			else
			{
				Random rd = new Random();
				ezCards[i] = new EZLinkCard(Math.abs(rd.nextInt(10000))+"",Math.abs(rd.nextDouble()+rd.nextInt(1000)));
			}
		}
		for(int i=0; i<ezCards.length; i++)
		{
			
			ezCards[i].deduct(1.20);
			System.out.println(ezCards[i]);
		}
		
		int foundIndex = Search(id,ezCards);
		if(foundIndex != -1)
		System.out.println("Found card: "+ezCards[foundIndex]);
		else
			System.out.println("No Card Found");
		in.close();
	}
	
	public static int Search(String value, EZLinkCard[] ezcards)
	{
		int foundIndex = -1;
		for(int i=0; i<ezcards.length; i++)
		{
			if(ezcards[i].cardNumber.equalsIgnoreCase(value))
			{
				foundIndex = i;
				break;
			}
		}
		return foundIndex;
	}

}
