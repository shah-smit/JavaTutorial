package com.yeartwo.lab.staff;

public class StoreSupervisor extends Staff{
	int totalAdminHours;
	
	public StoreSupervisor(String id, int totalWorkHours) {
		this.staffId = id;
		this.totalWorkHours = totalWorkHours;
	}
	
	double computeSalary(){
		return (this.totalWorkHours*15)+(this.totalAdminHours*20);
	}
	
	void viewDetails()
	{
		System.out.println("*** Store Assistant ***");
		System.out.println("Staff ID: "+this.staffId);
		System.out.println("Total Work Hours: "+this.totalWorkHours);
		System.out.println("Salary: "+this.computeSalary());
	}
}
