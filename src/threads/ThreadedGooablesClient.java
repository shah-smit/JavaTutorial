package threads;

import java.awt.Color;
import java.io.*;
import java.net.*;
import java.util.ArrayList;

import serialisation.Gooable;
import serialisation.RestartableGooWorld;

public class ThreadedGooablesClient {
	
	private int port = 6006;

	public void go(String host) {
		
		try {
			System.out.println("Contacting " + host + " on port " + port);
			
			Socket socket = new Socket("localhost", port);
			ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
			ArrayList<Gooable> gooables = (ArrayList<Gooable>)ois.readObject();
			ois.close();
			socket.close();
			
			boolean FSE = false;
			RestartableGooWorld gooWorld = new RestartableGooWorld(500, 500, FSE);

			gooWorld.addGooables(gooables);
			gooWorld.background(Color.BLACK);
			gooWorld.smooth();
			gooWorld.go();
		} catch (UnknownHostException e) {
		} catch (IOException e) {
		}
		catch(ClassNotFoundException e){
		}
	}

	public static void main(final String[] args) {
		
		int numClients = 5;
		for(int i = 0; i < numClients; i++){
			
			Thread t = new Thread(new Runnable(){
				public void run(){
					new ThreadedGooablesClient().go(args[0]);
				}
			});
			t.start();
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
	}
}
