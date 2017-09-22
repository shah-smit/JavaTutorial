package networking;

import java.awt.Color;
import java.io.*;
import java.net.*;
import java.util.ArrayList;

import serialisation.Gooable;
import serialisation.RestartableGooWorld;

public class GooablesClient {
	
	private int port = 6006;

	public void go(String host) {
		
		try {
			System.out.println("Contacting " + host + " on port " + port);
			
			Socket socket = new Socket("localhost", port);
			
			ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
			ArrayList<Gooable> gooables = (ArrayList<Gooable>)ois.readObject();
			
			boolean FSE = false;
			RestartableGooWorld gooWorld = new RestartableGooWorld(500, 500, FSE);

			gooWorld.addGooables(gooables);
			gooWorld.background(Color.BLACK);
			gooWorld.smooth();
			gooWorld.go();
			
			ois.close();
			socket.close();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		catch(ClassNotFoundException e){
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new GooablesClient().go(args[0]);
	}
}
