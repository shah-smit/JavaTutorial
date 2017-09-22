package networking;

import java.io.*;
import java.net.*;

public class SimplestServer {
	
	private int port = 6006;

	public void go() {
		try {
			
			ServerSocket serverSocket = new ServerSocket(port);
			System.out.println("Server started on port " + port);
			
			Socket socket = serverSocket.accept();
			
			PrintWriter writer = new PrintWriter(
					socket.getOutputStream());
			writer.println("Hello Client");
			writer.flush();
			serverSocket.close();
			
			socket.close();
			
			System.out.println("Server closed");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new SimplestServer().go();
	}
}
