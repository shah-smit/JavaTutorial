package threads;

import java.io.*;
import java.net.*;
import java.util.ArrayList;

public class ObjectServer implements CommandLineListener {

	ArrayList<ClientHandler> clientHandlers;
	private boolean running = false;
	final int TIME_OUT = 1000;

	public class ClientHandler implements Runnable {

		ObjectInputStream objInputStream;
		ObjectOutputStream objOutputStream;
		SocketAddress address;
		Socket clientSocket;

		public ClientHandler(Socket sckt) {
			clientSocket = sckt;
			address = clientSocket.getRemoteSocketAddress();
		}

		public void close() {

			try {
				System.out.println("Closing connection to " + address);
				objInputStream.close();
				objOutputStream.close();
			} catch (IOException e) {
			}
		}

		public void run() {
			try {
				objInputStream = new ObjectInputStream(clientSocket
						.getInputStream());
				objOutputStream = new ObjectOutputStream(clientSocket
						.getOutputStream());

				boolean running = true;

				while (running) {
					Object obj = objInputStream.readObject();

					System.out.println("Object received from "
							+ clientSocket.getRemoteSocketAddress());
					tellEveryone(obj, this);
				}
			} catch (EOFException e) {
			} catch (IOException e) {
			} catch (ClassNotFoundException e) {
			} 
			
		}
	}

	public void go() {

		clientHandlers = new ArrayList<ClientHandler>();

		try {

			ServerSocket serverSock = new ServerSocket(5000);
			serverSock.setSoTimeout(TIME_OUT);

			running = true;
			while (running) {

				try {
					Socket clientSocket = serverSock.accept();
					System.out.println("Connected to "
							+ clientSocket.getRemoteSocketAddress());

					ClientHandler ch = new ClientHandler(clientSocket);
					clientHandlers.add(ch);

					new Thread(ch).start();
				} catch (SocketTimeoutException e) {
				}

			}
			serverSock.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void close() {

		running = false;
		for (ClientHandler ch : clientHandlers) {
			ch.close();
		}
	}

	public void userIn(String s) {

		if (s.equalsIgnoreCase(".close"))
			close();
	}

	public void tellEveryone(Object object, ClientHandler sender) {

		for (ClientHandler handler : clientHandlers) {

			if (handler != sender) {

				ObjectOutputStream oos = handler.objOutputStream;

				try {
					oos.writeObject(object);
					oos.flush();

				} catch (SocketException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public static void main(String[] args) {

		ObjectServer server = new ObjectServer();
		new UserIn(server);
		server.go();
	}

}
