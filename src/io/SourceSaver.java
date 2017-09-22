package io;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.MalformedURLException;
import java.net.URL;

public class SourceSaver {

	private static void writeToFile(String fileName, String text) {

		try {
			FileWriter writer = new FileWriter(fileName);
			writer.write(text);
			writer.close();
		} catch (IOException e) {
			System.out.print(e);
		}
	}

	public static void main(String args[]) {

		StringBuilder builder = new StringBuilder();
		try {
			URL u = new URL("http://" + args[0]);
			Reader r = new BufferedReader(new InputStreamReader(u.openStream())); // IO

			int c = 0;
			while ((c = r.read()) != -1) { // throws IO exception
				builder.append((char) c);
			}

			String site = args[0];
			if (site.contains("http://")) {

			}
			String file = args[0] + ".html";
			writeToFile(file, builder.toString());
			new Viewer().go("./" + file);
		}

		catch (MalformedURLException e) { // a subclass of IOException
			System.err.println(e);
		} catch (IOException e) {
			System.err.println(e);
		}

	}

}
