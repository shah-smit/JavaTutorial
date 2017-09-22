package threads;

import java.io.*;
import java.net.*;

public class InteractiveThreadedGooablesServer implements CommandLineListener {

	final int PORT = 6006;
	private boolean running = false;
	final int TIME_OUT = 1000;
	
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

		running = true;

		try {

			ServerSocket serverSocket = new ServerSocket(PORT);
			serverSocket.setSoTimeout(TIME_OUT);
			System.out.println("Gooable Server started on port " + PORT);

			while (running) {

				try {
					Socket clientSocket = serverSocket.accept();
					Thread t = new Thread(new ClientHandler(clientSocket));
					t.start();
				} catch (SocketTimeoutException e) {
				}
			}

			serverSocket.close();
			System.out.println("Server closed");

		} catch (IOException e) {
		}
	}

	public void close(){
		running = false;
	}
	
	public void userIn(String s){
		if(s.equalsIgnoreCase(".close"))
			close();
	}
	
	public static void main(String[] args) {

		InteractiveThreadedGooablesServer server = new InteractiveThreadedGooablesServer();
		new UserIn(server);
		server.go();
	}
}
