package simpleevents;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import referencetypes.GooDropsInColour;
import referencetypes.Drop;

public class ControlledGooDrops extends GooDropsInColour {

	private boolean stop = false;

	public ControlledGooDrops(int w, int h, int nd) {

		super(w, h, nd);
	}

	public Drop makeDrop(int xpos, int ypos, 
                             int xvel, int yvel, int size) {

		Random random = getRandom();
		Color color = new Color(random.nextInt(256), random.nextInt(256),
				random.nextInt(256));
		return new ControlDrop(xpos, ypos, xvel, yvel, size, color);
	}

	public void slow(float s) {

		Drop[] drops = getDrops();
		for (Drop drop : drops) {
			((ControlDrop) drop).setModifier(s);
		}
	}

	public void draw(Graphics g) {

		if (!stop)
			super.draw(g);
		else {

			Drop[] drops = getDrops();
			for (Drop d : drops) {
				d.draw(g);
			}
		}
	}

	public void setStop(boolean stop) {
		this.stop = stop;
	}

	public boolean getStop() {
		return stop;
	}
}
