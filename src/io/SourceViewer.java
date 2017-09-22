package io;

import java.io.*;
import java.net.*;

public class SourceViewer {

	public static void main(String args[]) {

		try {
			
			URL u = new URL(args[0]);
			Reader r = new BufferedReader(new InputStreamReader(u.openStream()));
			
			int c = -1;
			while ((c = r.read()) != -1) {
				System.out.print((char) c);
			}
			
		} catch (MalformedURLException e) {
			System.err.println(e);
		} catch (IOException e) {
			System.err.println(e);
		}
	}
}
