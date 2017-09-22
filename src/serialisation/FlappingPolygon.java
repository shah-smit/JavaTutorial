package serialisation;

import java.awt.Color;
import java.awt.Graphics;
import java.io.Serializable;
import java.util.Random;

public class FlappingPolygon implements Gooable, Serializable {

	private static final long serialVersionUID = 1L;

	// External position, velocity and size
	int ox, oy, vox, voy, maxVox, sizeX, sizeY;

	// Internal position and velocities
	int[] x, y, vx, vy;
	int maxV;

	// Color of interior fills and lines
	Color color;

	// Num interior points
	int nVertices, maxVertices;

	// Random object
	Random random;
	
	public FlappingPolygon(int width, int height, long seed) {

		random = new Random(seed);

		// External param init
		sizeX = 50;
		sizeY = 50;

		ox = random.nextInt(width);
		oy = random.nextInt(height);

		maxVox = 10;

		vox = 1 + random.nextInt(maxVox);
		if (random.nextDouble() > 0.5)
			vox *= -1;

		voy = 1 + random.nextInt(maxVox);
		if (random.nextDouble() > 0.5)
			voy *= -1;

		// Internal param init
		randomisePolygon();
	}

	void randomisePolygon() {

		// Internal param init
		maxV = Math.min(sizeX, sizeY) / 3;
		maxVertices = 20;
		nVertices = maxVertices / 2;

		x = new int[nVertices];
		y = new int[nVertices];
		vx = new int[nVertices];
		vy = new int[nVertices];

		for (int i = 0; i < nVertices; i++) {

			x[i] = ox + random.nextInt(sizeX);
			y[i] = oy + random.nextInt(sizeY);

			vx[i] = 1 + random.nextInt(maxV - 1);
			if (random.nextDouble() > 0.5)
				vx[i] *= -1;

			vy[i] = 1 + random.nextInt(maxV - 1);
			if (random.nextDouble() > 0.5)
				vy[i] *= -1;
		}

		color = new Color(random.nextInt(256), random.nextInt(256), random
				.nextInt(256));
	}

	public void drawOutline(Graphics g) {

		g.setColor(color);

		for (int i = 0; i < nVertices - 1; i++)
			g.drawLine(x[i], y[i], x[i + 1], y[i + 1]);

		g.drawLine(x[nVertices - 1], y[nVertices - 1], x[0], y[0]);
	}

	public void draw(Graphics g) {

		g.setColor(color);
		g.fillPolygon(x, y, nVertices);
	}

	public void move(int width, int height) {

		// Position update
		ox += vox + vox * (random.nextDouble() - 0.5);
		oy += voy + voy * (random.nextDouble() - 0.5);

		// Circular boundary conditions
		int tempX = ox % width;
		if (tempX < -sizeX)
			tempX += width;
		int tempY = oy % height;
		if (tempY < -sizeY)
			tempY += height;

		ox = tempX;
		oy = tempY;

		flap();
	}

	private void flap() {

		for (int i = 0; i < x.length; i++) {

			x[i] += vx[i];
			y[i] += vy[i];

			// circular boundary conditions
			int relativeX = x[i] - ox;
			relativeX %= sizeX;
			if (relativeX < 0)
				relativeX += sizeX;
			x[i] = ox + relativeX;

			int relativeY = y[i] - oy;
			relativeY %= sizeY;
			if (relativeY < 0)
				relativeY += sizeY;
			y[i] = oy + relativeY;
		}
	}
}
