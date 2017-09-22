package threads;

import java.io.*;
import java.net.*;

public class ThreadPoolGooablesServer {

	private int port = 6006;
	ServerSocket serverSocket;
	ClientHandler[] handlers;
	final int NUM_THREADS = 10;

	public class ClientHandler implements Runnable {

		ServerSocket serverSocket;
		int threadNumber;

		public ClientHandler(ServerSocket s, int num) {

			serverSocket = s;
			threadNumber = num;
		}

		public void run() {

			while (true) {

				try {
					Socket clientSocket;

					synchronized (serverSocket) {

						System.out.print("Thread: " + threadNumber
								+ " waiting...");
						clientSocket = serverSocket.accept();
					}
					System.out.println("responding  ");

					ObjectOutputStream oos = new ObjectOutputStream(
							clientSocket.getOutputStream());

					ObjectInputStream ois = new ObjectInputStream(
							new FileInputStream("gooables.ser"));

					oos.writeObject(ois.readObject());

					ois.close();
					oos.close();
				} catch (SocketException e) {
					System.out.println(threadNumber + " has been terminated");
				} catch (IOException e) {
					e.printStackTrace();
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public void go() {

		try {

			serverSocket = new ServerSocket(port);
			System.out.println("Gooable Server started on port " + port);

			handlers = new ClientHandler[NUM_THREADS];

			for (int i = 0; i < NUM_THREADS; i++) {

				handlers[i] = new ClientHandler(serverSocket, i);
				Thread t = new Thread(handlers[i]);
				t.start();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		ThreadPoolGooablesServer server = new ThreadPoolGooablesServer();
		server.go();
	}
}
