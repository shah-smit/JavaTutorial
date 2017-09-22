package threads;

import java.io.*;
import java.net.*;

public class ObjectClient implements CommandLineListener {

	ObjectOutputStream objOutputStream;
	InetSocketAddress address;
	String DEFAULT_HOST = "localhost";
	int DEFAULT_PORT = 5000;
	boolean isConnected = false;
	
	class IncomingReader implements Runnable {

		ObjectInputStream objInputStream;

		public IncomingReader(ObjectInputStream ois) {

			objInputStream = ois;
		}

		public void run() {

			try {
				boolean running = true;
				while (running) {

					Object obj = objInputStream.readObject();
					receive(obj);
				}
			} catch (EOFException e) {
				System.out.println("Lost connection to " + address);
			} catch (SocketException e) {
			} catch (IOException e) {
			} catch (ClassNotFoundException e) {
			}
		}
	}
	
	public void go(){
		go(DEFAULT_HOST, DEFAULT_PORT);
	}

	public void go(String host, int port) {

		address = new InetSocketAddress(host, port);
		try {
			Socket sock = new Socket(host, port);
			objOutputStream = new ObjectOutputStream(sock.getOutputStream());
			ObjectInputStream objInputStream = new ObjectInputStream(sock
					.getInputStream());
			System.out.println("Connected to " + address + " from port "
					+ sock.getLocalPort());
			
			isConnected = true;
			
			Thread readerThread = new Thread(new IncomingReader(objInputStream));
			readerThread.start();

		} catch (UnknownHostException e) {
			isConnected = false;
		} catch (IOException e) {
			System.out.println("Could not connect to " + address);
			isConnected = false;
		}
	}

	public void userIn(String inString) {
		
		if(inString.equalsIgnoreCase(".close"))
			System.exit(0);
		
		send(inString);
	}

	public boolean send(Object obj) {

		try {
			objOutputStream.writeObject(obj);
			objOutputStream.flush();
			return true;
			
		} catch (IOException e) {
			System.out.println("Could not send object");
		} catch (NullPointerException e) {
			System.out.println("Could not send object");
		}
		return false;
	}

	public void receive(Object obj) {

		System.out.println(obj);
	}
	
	public boolean isConnected(){
		
		return isConnected;
	}

	public static void main(String[] args) {

		ObjectClient client = new ObjectClient();
		new UserIn(client);
		
		if (args.length < 2) {
			client.go();
		}
		
		try {
			client.go(args[0], Integer.parseInt(args[1]));
		} catch (NumberFormatException e) {
		}
	}
}
