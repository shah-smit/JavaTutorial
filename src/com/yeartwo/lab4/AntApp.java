package com.yeartwo.lab4;
/**
 * Lab 4 Task 2
 * This main app is using the Ant class.
 * == Sign checks for the reference for the non-prmitive types. 
 * new keywords allocates a new memory to the object thus the reference of two object (created via new keyword) will not be same
 * copyme is actually creating a 'new' copy with the same value.
 * .equals on the other side checks for the value a NOT the reference.
 * */
public class AntApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ant a1 = new Ant(15,2);
		Ant a2 = a1.copyme();
		Ant a3 = a2;
		
		System.out.println("a1 == a2: "+(a1 == a2)); //false because a1 and a2 are pointing to a different reference in memory
		System.out.println("a2 == a3: "+(a2 == a3)); //true because a2 and a3 are sharing the same reference in the memory
		System.out.println("a1 == a3: "+(a1 == a3)); //false because a1 and a3 are pointing to a different reference in memory
		
		System.out.println("a1 equals a2: "+(a1.equals(a2))); //true because a1 and a2 has the same values.
		System.out.println("a2 equals a3: "+(a2.equals(a3))); //true because a2 and a3 has the same values.
		System.out.println("a1 equals a3: "+(a1.equals(a3))); //true because a1 and a3 has the same values.
	}

}
