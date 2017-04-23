package com.tutorial.strings;

public class Strings {

	public static void main(String[] args) {
				// String data-type - non-Primitive, As it is immutable it will function as pass by value.
				// == will check for the reference of the object in the memory, if they are same, it will return true otherwise false
				// .equals() will check for the value of the object, if they are same, it will return true otherwise false
				String pig = "catch-22"; //will check if any string has the same reference, and will reference pig to it
				String newPig = new String("catch-22"); //new allocation in memory
				String dog = "catch-"+22; //will check if any string has the same reference, and will reference dog to it. thus pig and dog will reference same object
				String newDog = new String("catch-"+22); //new allocation in memory, doesn't matter if the same string exists 
				
				
				System.out.println("String pig = \"catch-22\";");
				System.out.println("String newPig = new String(\"catch-22\");");
				System.out.println("String dog = \"catch-\"+22;");
				System.out.println("String newDog = new String(\"catch-\"+22);");
				
				System.out.println();
				System.out.print("is pig == dog ? ");
				System.out.println(pig == dog); //true Reason: as pig and dog are sharing the same reference
				System.out.println();
				System.out.print("is pig.equals(dog) ? ");
				System.out.println(pig.equals(dog));//true Reason: pig and dog as same value
				System.out.println();
				System.out.print("is newPig == dog ? ");
				System.out.println(newPig == dog); //false Reason: as pig1 is a new allocation i.e. new reference in memory. thus pig1 and dog has difference
				System.out.println();
				System.out.print("is newPig.equals(dog) ? ");
				System.out.println(newPig.equals(dog));//true Reason: pig and dog as same value
				System.out.println();
				System.out.print("is newPig.equals(newDog) ? ");
				System.out.println(newPig == newDog); //false
				System.out.println();
				System.out.print("Animals are equal will concatinate with pig and then compare with dog. thus it will give: ");
				System.out.println("Animals are equal "+pig == dog); //false
				System.out.println();
				System.out.print("(pig == dog) As this in bracket it will compare and result will contacatinated with Animals are equal : ");
				System.out.println("Animals are equal "+(pig == dog)); //Animals are equal true

	}

}
