package simpleobjects;

import goo.Goo; // A
import java.awt.Graphics;

public class GooDrop extends Goo { // B

	VerticalBounceDrop drop;

	public GooDrop(int width, int height) { // C

		super(width, height);

		int xpos = width/2;
		int ypos = 0;
		int xvel = 0;
		int yvel = 1;
		int size = 10;

		drop = new VerticalBounceDrop(xpos, ypos, xvel, yvel, size); 
	}

	public void draw(Graphics g) { // D

		drop.move(getWidth(), getHeight());
		drop.draw(g);
	}
}