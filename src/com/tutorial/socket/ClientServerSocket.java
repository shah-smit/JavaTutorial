package com.tutorial.socket;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class ClientServerSocket {

	public static void main(String[] args) {
		try {
			ServerSocket ss = new ServerSocket(7005);
			System.out.println(ss.getLocalSocketAddress());
			while(true){
				Socket client = ss.accept();
				Thread t = new Thread(() -> {
					try {
						System.out.println("Connection");
						BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
						bw.write(new Date()+" \n");
						Thread.sleep(2000);
						bw.write(new Date()+" \n");
						Thread.sleep(2000);
						bw.write(new Date()+" \n");
						Thread.sleep(2000);
						bw.write(new Date()+" \n");
						bw.close();
						client.close();
					} catch (IOException | InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				});
				t.start();
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
