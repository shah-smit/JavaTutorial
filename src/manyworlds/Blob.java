package manyworlds;

import java.awt.Graphics;
import java.util.Random;

public class Blob extends Box{

	private static final long serialVersionUID = 1L;

	public Blob(int outerWidth, int outerHeight, int vmax, int miniWidth, int miniHeight,
			long seed) {
		super(outerWidth, outerHeight, vmax, miniWidth, miniHeight, seed);

	}

	public Blob(int outerWidth, int outerHeight, int vmax, int miniWidth, int miniHeight,
			Random r) {

		super(outerWidth, outerHeight, vmax, miniWidth, miniHeight, r);
	}

	public void draw(Graphics g, int ox, int oy) {

		g.setColor(color);
		g.fillOval(ox + x, oy + y, width, height);
	}

	public void move(int outerWidth, int outerHeight) {

		// Position update
		x += vx;
		y += vy;

		// Reflected boundary conditions
		if (x + width > outerWidth) {
			x = 2 * outerWidth - x - 2 * width;
			vx = -vx;
		} else if (x < 0) {
			x = -x;
			vx = -vx;
		}
		if (y + height > outerHeight) {
			y = 2 * outerHeight - y - 2 * height;
			vy = -vy;
		} else if (y < 0) {
			y = -y;
			vy = -vy;
		}
	}
}
