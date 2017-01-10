package com.tutorial.SIMInterestGroup;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainActivity {
	public static List<User> users = new ArrayList<User>();
	public static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean run = true;
		int option = 10;
		while(option != 0)
		{
			Menu.Display(""+((users.size()*100)/200.00)+"% user database filled!");
			System.out.print("Enter your option: ");
			option = in.nextInt();
			in.nextLine();
			switch(option)
			{
				case 0:
					System.out.println("You have pressed Quit!");
					run = false;
					break;
				case 1:
					AddMember();
					break;
				case 2:
					EditMember();
					break;
				case 3:
					DeleteMember();
					break;
				case 4:
					Display();
					break;
				case 10:
					break;
				default: 
					System.out.println("Wrong input, please try again");
					break;
			}
		}
		
		in.close();
	}

	private static void AddMember() {
		User newUser = new User();
		System.out.print("Enter the id: ");
		newUser.id = in.nextInt();
		in.nextLine();
		System.out.print("Enter the Name: ");
		newUser.name = in.nextLine();
		System.out.print("Enter the Mobile: ");
		newUser.handPhone = in.nextLine();
		System.out.print("Enter the Birth Date: ");
		Date DOB = new Date();
		String[] date = in.nextLine().split("/");
		DOB.date = Integer.parseInt(date[0]);
		DOB.month = Integer.parseInt(date[1]);
		DOB.year = Integer.parseInt(date[2]);
		newUser.DOB = DOB;
		users.add(newUser);
	}

	private static void EditMember() {
		int foundIndex = getUserIndex();
		User user = users.get(foundIndex);
		System.out.print("Enter the Name: ");
		user.name = in.nextLine();
		System.out.print("Enter the Mobile: ");
		user.handPhone = in.nextLine();
		System.out.print("Enter the Birth Date: ");
		Date DOB = new Date();
		String[] date = in.nextLine().split("/");
		DOB.date = Integer.parseInt(date[0]);
		DOB.month = Integer.parseInt(date[1]);
		DOB.year = Integer.parseInt(date[2]);
		user.DOB = DOB;
		users.set(foundIndex, user);
	}

	private static void DeleteMember() {
		int foundIndex = getUserIndex();
		User user = users.get(foundIndex);
		user.deleted = true;
		users.set(foundIndex, user);
	}

	private static void Display() {
		if(users.size() == 0)
		{
			System.out.println("No Users Found");
		}
		int count = 0;
		for(int i=0; i<users.size(); i++)
		{
			if(!users.get(i).deleted)
			{
				System.out.println(users.get(i));
			}
			else
			{
				count++;
			}
		}
		if(count > 0)
		{
			System.out.println("Deleted User count: "+count);
		}
	}
	
	public static int getUserIndex()
	{
		System.out.print("Enter the id you want to edit: ");
		int id = in.nextInt();
		in.nextLine();
		int foundIndex = 0;
		for(int i=0; i<users.size(); i++)
		{
			if(id == users.get(i).id)
			{
				foundIndex =  i;
				break;
			}
		}
		return foundIndex;
	}
	

}
