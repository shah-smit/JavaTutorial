package com.yeartwo.lab.five.task.two;

public class EnchanceForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] countries = new String[50];
		countries[0] = "GRERMANY";
		countries[1] = "AUSTRIA";
		countries[2] = "JAPAN";
		countries[3] = "KOREA";
		countries[4] = "RUSSIA";
		
		for(String str: countries){
			if(str == null) break;
			
			if(str.equals("AUSTRIA")){
				System.out.println("Found Austria");
				break;
			}
			
			if(str.length() > 5){
				System.out.println("Found "+str+" is greater than 5 characters");
			}
		}
	}

}
