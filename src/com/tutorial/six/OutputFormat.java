package com.tutorial.six;

public class OutputFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double price = 19.8;
		System.out.print("$");
		System.out.printf("%6.2f", price);
		System.out.println(" each");

		System.out.print("$");
		System.out.printf("%10.3f", price);
		System.out.println(" each");

		System.out.print("$");
		System.out.printf("%2.1f", price);
		System.out.println(" each");
		
		String aString = "abc";
		System.out.println("String output:");
		System.out.println("Start1234567890");
		System.out.printf("Start%sEnd %n",aString);
		System.out.printf("Start%4sEND \n", aString);
		System.out.printf("Start%2sEND \n", aString);
		
		String heading = "Exam";
		String heading2 = "Exam Result";
		String course = "Java";
		char grade = 'A';
		String course2 = "Python";
		char grade2 = 'C';
		String course3 = "VB .Net";
		char grade3 = 'A';
		System.out.println();
		System.out.printf("%-15s %15s %n", heading,heading2);
		for(int i=0; i<30; i++){ System.out.print("-");}
		System.out.println();
		
		System.out.printf("%-15s %10c %n",course,grade);
		System.out.printf("%-15s %10c %n",course2,grade2);
		System.out.printf("%-15s %10c %n",course3,grade3);
		for(int i=0; i<30; i++){ System.out.print("-");}
		System.out.println();
	}

}
