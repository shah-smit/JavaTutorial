package com.tutorial.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientSocket {
	public static void main(String[] args){
		try {
			Socket s = new Socket("0.0.0.0",7005);

			BufferedReader sc = new BufferedReader(new InputStreamReader(s.getInputStream()));
			
			String s1 = sc.readLine();
			while(s1 != null){
				System.out.println(s1);
				s1 = sc.readLine();
			}
			s.close();
			sc.close();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
}
