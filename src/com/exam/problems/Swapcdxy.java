package com.exam.problems;

import java.io.*;

public class Swapcdxy {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		FileReader fr = new FileReader("test.txt");
		BufferedReader br = new BufferedReader(fr);
		int t = br.read();
		
		while(t!=-1)
		{
			if((char)t == 'a') System.out.print('x');
			else if((char)t == 'b') System.out.print('y');
			else System.out.print((char)t);
			t = br.read();
		}

	}

}
