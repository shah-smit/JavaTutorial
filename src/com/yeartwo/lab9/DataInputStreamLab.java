package com.yeartwo.lab9;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class DataInputStreamLab {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		DataInputStream DIS = null;
		try {
			DIS = new DataInputStream(new FileInputStream("test.txt"));
			InputStreamReader isr = new InputStreamReader(DIS);
			BufferedReader br = new BufferedReader(isr);
			String x = null;
			while((x = br.readLine()) != null){
				System.out.println(x);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DIS.close();
		}
	}

}
