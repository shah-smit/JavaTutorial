package com.yeartwo.lab.staff;

public class Staff {
	String staffId;
	int totalWorkHours;
	public String getStaffId() {
		return staffId;
	}
	public void setStaffId(String staffId) {
		this.staffId = staffId;
	}
	public int getTotalWorkHours() {
		return totalWorkHours;
	}
	public void setTotalWorkHours(int totalWorkHours) {
		this.totalWorkHours = totalWorkHours;
	}
	
	double computeSalary(){
		return this.totalWorkHours*15;
	}
}
