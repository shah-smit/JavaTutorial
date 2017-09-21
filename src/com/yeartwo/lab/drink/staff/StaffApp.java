package com.yeartwo.lab.drink.staff;

public class StaffApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StoreAssistant daniel = new StoreAssistant("Daniel1234",12);
		daniel.totalWorkHours = 12;
		
		StoreSupervisor george = new StoreSupervisor("George9876",3);
		george.totalAdminHours = 14;
		
		daniel.viewDetails();
		george.viewDetails();
	}

}
