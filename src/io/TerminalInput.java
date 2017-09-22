package io;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TerminalInput {
	
	public static void main(String[] args) {
		try {
			BufferedReader inputStream = new BufferedReader(
					new InputStreamReader(System.in));
			String inputLine = null;
			while ((inputLine = inputStream.readLine()) != null) {
				System.out.println(inputLine);
			}
			inputStream.close();
		} catch (java.io.IOException e) {
			System.err.println(e);
		}
	}
}
