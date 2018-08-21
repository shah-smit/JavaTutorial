package com.tutorial.hackerrank;

import java.util.ArrayList;

public class SetPartition {

	public static void main(String[] args) {
		int total = 10;
		ArrayList<Integer> given = new ArrayList<>();
		given.add(2);
		given.add(3);
		given.add(5);
		given.add(2);
		given.add(3);
		given.add(5);
//		given.add(7);
//		given.add(8);
//		given.add(5);
//		given.add(9);
		ArrayList<Integer> setA = new ArrayList<>();
		ArrayList<Integer> setB = new ArrayList<>();
		int setASum = 0;
		int setBSum = 0;
		
		for(int i=0; i<given.size(); i++){
			if(setASum + given.get(i) <= total){
				setA.add(given.get(i));
				setASum += given.get(i);
			}
			else if(setASum < total){
				
				boolean isPossible = false;
				for(int x=setA.size()-1; x>=0; x--){
					int sam = setASum - setA.get(x);
					if(sam+given.get(i) == total) {
						int tempI = x;
						
						setBSum += setA.get(tempI);
						setASum -= setA.get(tempI);
						setB.add(setA.remove(tempI));
						
						setA.add(given.get(i));
						setASum += given.get(i);
						isPossible = true;
						break;
					}
					//Only if the list is sorted!!!
					if(sam < total) break;
				}
				if(!isPossible){
					setB.add(given.get(i));
					setBSum += given.get(i);
				}
			}
			else{
				setB.add(given.get(i));
				setBSum += given.get(i);
			}
		}
		
		if(setASum == total && setBSum == total){
			System.out.print("Partition A: { ");
			for(int i: setA) System.out.print(i+" ");
			System.out.print("}");
			
			System.out.println();
			
			System.out.print("Partition B: { ");
			for(int i: setB) System.out.print(i+" ");
			System.out.print("}");
		}
		else{
			System.out.println("Partition cannot be generated");
		}

	}

}
