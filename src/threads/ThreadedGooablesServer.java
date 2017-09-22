package threads;

import java.io.*;
import java.net.*;

public class ThreadedGooablesServer {

	final int PORT = 6006;
	
	public class ClientHandler implements Runnable {

		Socket socket;

		public ClientHandler(Socket clientSocket) {
			socket = clientSocket;
		}

		public void run() {

			try {
				ObjectOutputStream oos = new ObjectOutputStream(socket
						.getOutputStream());

				ObjectInputStream ois = new ObjectInputStream(
						new FileInputStream("gooables.ser"));

				oos.writeObject(ois.readObject());

				ois.close();
				oos.close();
				socket.close();

			} catch (IOException e) {
			} catch (ClassNotFoundException e) {
			}
		}
	}

		
	public void go() {

		boolean running = true;

		try {

			ServerSocket serverSocket = new ServerSocket(PORT);
			System.out.println("Gooable Server started on port " + PORT);

			while (running) {

					Socket clientSocket = serverSocket.accept();
					Thread t = new Thread(new ClientHandler(clientSocket));
					t.start();
			}

			serverSocket.close();
			System.out.println("Server closed");

		} catch (IOException e) {
		}
	}


		
	public static void main(String[] args) {

		ThreadedGooablesServer server = new ThreadedGooablesServer();
		server.go();
	}
}
