package networking;

import java.io.*;
import java.net.*;

public class GooablesServer {

	private int port = 6006;

	public void go() {

		try {

			ServerSocket serverSocket = new ServerSocket(port);
			System.out.println("Gooable Server started on port " + port);

			Socket socket = serverSocket.accept();

			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(
					"gooables.ser"));

			ObjectOutputStream oos = new ObjectOutputStream(socket
					.getOutputStream());

			Object obj = ois.readObject();
			oos.writeObject(obj);

			ois.close();
			oos.close();

			serverSocket.close();
			socket.close();

			System.out.println("Server closed");

		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new GooablesServer().go();
	}
}
