package com.studyguide.problems;

public class Date {
	int day;
	int month;
	int year;
	
	Date(int d, int m, int y){
		day = d;
		month = m;
		year = y;
	}
	
	boolean isBefore(Date d){
		if(year < d.year){
			return true;
		}
		else if(year == d.year){
			if(month < d.month) return true;
			else if(month == d.month) {
				if(day < d.day) return true;
				else return false;
			}
			else return false;
		}
		else return false;
	}
}
