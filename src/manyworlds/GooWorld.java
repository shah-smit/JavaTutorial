package manyworlds;

import goo.Goo;

import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

import threads.ObjectClient;

public class GooWorld extends Goo {

	ArrayList<Gooable> gooables;
	ArrayList<Gooable> departures;
	ArrayList<Gooable> arrivals;
	ObjectClient objectClient;
	boolean connected;

	int exitHoleSize;
	int exitHoleX, exitHoleY, exitCentreX ,exitCentreY;
	double exitRadiusSquared;

	int entryHoleSize;
	int entryHoleX, entryHoleY;
	
	Color entryHoleColor, exitHoleColor;

	Random random;

	long then = System.currentTimeMillis();

	class ManyWorldsObjectClient extends ObjectClient {

		public void receive(Object obj) {
			arrivals.add((Gooable) obj);
		}
	}

	public GooWorld(int w, int h, boolean b, long seed) {

		super(w, h, b);
		
		background(new Color(0, 0, 0, 96));
		
		gooables = new ArrayList<Gooable>();
		departures = new ArrayList<Gooable>();
		arrivals = new ArrayList<Gooable>();

		objectClient = new ManyWorldsObjectClient();
		objectClient.go();

		random = new Random(seed);
		exitHoleSize = 100;
		exitHoleX = random.nextInt((getWidth() - exitHoleSize));
		exitHoleY = random.nextInt((getHeight() - exitHoleSize));
		exitCentreX = exitHoleX + exitHoleSize / 2;
		exitCentreY = exitHoleY + exitHoleSize / 2;
		exitRadiusSquared = exitHoleSize * exitHoleSize / 8.0;
		
		entryHoleSize = 100;
		entryHoleX = random.nextInt((getWidth() - exitHoleSize));
		entryHoleY = random.nextInt((getHeight() - exitHoleSize));
		
		exitHoleColor = new Color(50, 50, 50, 128);
		entryHoleColor = new Color(50, 50, 50, 128);
	}

	public void addGooable(Gooable g) {

		gooables.add(g);
	}

	private void tunnelOut() {

		if (!departures.isEmpty()) {
			for (Gooable g : departures) {
				if (objectClient.send(g))
					gooables.remove(g);
				else{
					connected = false;
				}
			}
			departures.clear();
		}
	}

	private void tunnelIn() {

		if (!arrivals.isEmpty()) {
			for (Gooable g : arrivals) {
				g.setX(entryHoleX + entryHoleSize / 2);
				g.setY(entryHoleY + entryHoleSize / 2);
				gooables.add(g);
			}
			arrivals.clear();
		}
	}

	public void draw(Graphics g) {

		g.setColor(exitHoleColor);
		g.fillOval(exitHoleX, exitHoleY, exitHoleSize, exitHoleSize);

		g.setColor(entryHoleColor);
		g.fillOval(entryHoleX, entryHoleY, entryHoleSize, entryHoleSize);
		
		if (objectClient.isConnected()) {
			
			tunnelOut();
			tunnelIn();
		}
		
		for (Gooable gooable : gooables) {

			gooable.move(getWidth(), getHeight());
			
			int x = gooable.getX() + gooable.getWidth() / 2;
			int y = gooable.getY() + gooable.getHeight() / 2;
			
			int a = x - exitCentreX;
			int b = y - exitCentreY;
			
			if(a*a + b * b < exitRadiusSquared)
				departures.add(gooable);

			gooable.draw(g, 0, 0);
		}
	}

	public ArrayList<Gooable> getGooables() {

		return gooables;
	}

	public void addGooables(ArrayList<Gooable> g) {

		gooables = g;
	}
}
