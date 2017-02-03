package com.tutorial.vectors;

public class StudentMark {
	private String name;
	private int id;
	private double examMark;
	private double cwk;
	
	public StudentMark(String name, int id, double examMark, double cwk)
	{
		this.name = name;
		this.id = id;
		this.examMark = examMark;
		this.cwk = cwk;
	}
	
	public StudentMark(String name, String id, String examMark, String cwk)
	{
		this.name = name;
		this.id = Integer.parseInt(id);
		this.examMark = Integer.parseInt(examMark);
		this.cwk = Integer.parseInt(cwk);
	}
	
	public double getTotalScore()
	{
		return examMark + cwk;
	}
	
	public char getGrade()
	{
		double total = getTotalScore();
		if(total <= 35) return 'F';
		else return 'A';
	}
	
	public String toString(){
		return "Name: "+name;
	}
	
	public static void main(String[] args)
	{
		StudentMark sm = new StudentMark("A",1,60,40);
		System.out.println(sm);
	}
}
