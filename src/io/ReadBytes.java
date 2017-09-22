package io;

import java.io.*;
import java.util.Arrays;

public class ReadBytes {

	InputStream in;
	int bytesToRead;
	byte[] byteArray;

	public ReadBytes(InputStream in, int numBytes) {

		this.in = in;
		bytesToRead = numBytes;

		byteArray = new byte[bytesToRead];

		try {
			go();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public byte[] getByteArray(){
		
		return byteArray;
	}

	public void go() throws IOException {

		int bytesRead = 0;
		int bytesAvailable = 0;
		while (bytesRead < bytesToRead && bytesAvailable != -1) {
			
			bytesAvailable = in
					.read(byteArray, bytesRead, bytesToRead - bytesRead);
			bytesRead += bytesAvailable;
		}
	}

	public static void main(String[] args) {

		InputStream in = System.in;
		int numBytesToRead = 32;
		
		ReadBytes rb = new ReadBytes(in, numBytesToRead);
		
		byte[] byteArray = rb.getByteArray();
		System.out.println(byteArray.length + " bytes read");
		System.out.println(Arrays.toString(byteArray));
	}
}
