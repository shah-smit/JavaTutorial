package com.tutorial.SIMInterestGroup;

public class User {
	public int id;
	public String name;
	public String handPhone;
	public Date DOB;
	public boolean deleted;
	
	public User()
	{
		deleted = false;
	}
	
	public String toString()
	{
		return " id: "+id+"\n name: "+name+"\n handphone: "+handPhone+"\n DOB: "+DOB.date+"/"+DOB.month+"/"+DOB.year;
	}
}
