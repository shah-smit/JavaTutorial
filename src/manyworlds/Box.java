package manyworlds;

import java.awt.Color;
import java.awt.Graphics;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Random;

public class Box implements Gooable, Serializable {

	private static final long serialVersionUID = 1L;

	// The width and height of this gooable
	int width, height;

	// Position and velocities
	int x, y, vx, vy, vMax;

	// Colour of interior fills and lines
	Color color;

	// Random object
	Random random;

	// List of any contained gooables
	ArrayList<Gooable> gooables;

	public Box(int outerWidth, int outerHeight, int vm, int mWidth,
			int mHeight, long seed) {

		random = new Random(seed);
		init(outerWidth, outerHeight, vm, mWidth, mHeight);
	}

	public Box(int outerWidth, int outerGeight, int vm, int mWidth,
			int mHeight, Random r) {

		random = r;
		init(outerWidth, outerGeight, vm, mWidth, mHeight);
	}

	public void init(int outerWidth, int outerHeight, int vm, int w, int h) {

		x = random.nextInt(outerWidth);
		y = random.nextInt(outerHeight);

		vMax = vm;

		width = w;
		height = h;

		vx = 1 + random.nextInt(vMax);
		if (random.nextDouble() > 0.5)
			vx *= -1;

		vy = 1 + random.nextInt(vMax);
		if (random.nextDouble() > 0.5)
			vy *= -1;

		color = new Color(random.nextInt(256), random.nextInt(256), random
				.nextInt(256));

		gooables = new ArrayList<Gooable>();
	}

	public void addGooable(Gooable g) {
		gooables.add(g);
	}

	// Coordinates (x, y) of this gooable
	// (ox, oy) coordinate origin of caller
	public void draw(Graphics g, int ox, int oy) {

		g.setColor(color);
		
		// Uncomment if you want to see the bounding box
		// g.drawRect(ox + x, oy + y, width, height);

		// Draw any contained gooables
		for (Gooable gooable : gooables)
			gooable.draw(g, ox + x, oy + y);
	}

	// This gooable moves inside a rectangle of size outerWidth x outerHeight
	public void move(int outerWidth, int outerHeight) {

		// Move the box
		x += vx + vx * (random.nextDouble() - 0.5);
		y += vy + vy * (random.nextDouble() - 0.5);

		x = x % outerWidth;
		if (x < -width)
			x += outerWidth;

		y = y % outerHeight;
		if (y < -height)
			y += outerHeight;

		// Move any contained gooables 
		for (Gooable gooable : gooables)
			gooable.move(width, height);
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void setX(int i) {
		x = i;
	}

	public void setY(int i) {
		y = i;
	}

	public void setBoxWidth(int i) {
		width = i;
	}

	public void setBoxHeight(int i) {
		height = i;
	}

	public int getHeight() {
		return height;
	}

	public int getWidth() {
		return width;
	}

	public void setHeight(int i) {
		height = i;
	}

	public void setWidth(int i) {
		width = i;
	}
}
