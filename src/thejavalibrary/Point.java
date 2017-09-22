package thejavalibrary;

import java.awt.Graphics;

public class Point {

	private int x, y, vx, vy, maxvel = 5, radius = 5;

	Point(int x, int y) {

		this.x = x;
		this.y = y;
		vx = vy = 0;

		while (vx == 0 || vy == 0) {
			vx = (int) (2 * maxvel * Math.random() - maxvel);
			vy = (int) (2 * maxvel * Math.random() - maxvel);
		}
	}

	public void move(int width, int height) {

		x = x + vx;
		y = y + vy;

		if (x + radius >= width) {

			vx *= -1;
			x = width - radius;

		} else if (x - radius <= 0) {

			vx *= -1;
			x = radius;
		}

		if (y + radius >= height) {

			vy *= -1;
			y = height - radius;

		} else if (y - radius <= 0) {

			vy *= -1;
			y = radius;
		}
	}

	public void draw(Graphics g) {

		int diameter = 2 * radius;
		g.drawOval(x - radius, y - radius, diameter, diameter);
		g.fillOval(x - 1, y - 1, 2, 2);
	}

	public double distance(Point p) {

		double delxsq = x - p.x;
		delxsq *= delxsq;

		double delysq = y - p.y;
		delysq *= delysq;
		return Math.sqrt(delxsq + delysq);
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setX(int i) {
		x = i;
	}

	public void setY(int i) {
		y = i;
	}
}
