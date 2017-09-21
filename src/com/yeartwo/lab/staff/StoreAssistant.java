package com.yeartwo.lab.staff;

public class StoreAssistant extends Staff {
	
	public StoreAssistant(String id, int totalWorkHours) {
		// TODO Auto-generated constructor stub
		this.staffId = id;
		this.totalWorkHours = totalWorkHours;
	}

	void viewDetails()
	{
		System.out.println("*** Store Assistant ***");
		System.out.println("Staff ID: "+this.staffId);
		System.out.println("Total Work Hours: "+this.totalWorkHours);
		System.out.println("Salary: "+this.computeSalary());
	}
}
