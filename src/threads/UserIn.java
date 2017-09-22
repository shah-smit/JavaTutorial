package threads;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.SocketException;
import java.util.ArrayList;

public class UserIn {

	ArrayList<CommandLineListener> listeners;

	public UserIn() {
		listeners = new ArrayList<CommandLineListener>();
		go();
	}

	public UserIn(CommandLineListener l) {
		listeners = new ArrayList<CommandLineListener>();
		listeners.add(l);
		go();
	}

	public void addListener(CommandLineListener l) {
		listeners.add(l);
	}

	public void go() {

		final BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));

		Thread t = new Thread(new Runnable() {
			public void run() {
				try {
					boolean running = true;
					while (running) {
						String s = reader.readLine();
						for (CommandLineListener l : listeners)
							l.userIn(s);
						if (s.equalsIgnoreCase(".close")){
							running = false;
						}
					}
				} catch (SocketException e) {
				} catch (IOException e) {
				}
			}
		});
		t.start();
	}
}
