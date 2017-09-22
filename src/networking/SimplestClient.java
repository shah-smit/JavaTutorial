package networking;

import java.io.*;
import java.net.*;

public class SimplestClient {
	
	private int port = 6006;

	public void go(String host) {
		try {
			System.out.println("Contacting " + host + " on port " + port);
			
			Socket socket = new Socket("localhost", port);
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					socket.getInputStream()));
			
			System.out.println(reader.readLine());
			
			socket.close();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new SimplestClient().go(args[0]);
	}
}
