package inheritance;

import java.awt.Graphics;

public class Polygon extends Shape {

	public Polygon(int n) {

		super(n);
	}

	public Polygon(int[] x, int[] y, int n) {

		super(x, y, n);
	}

	public void draw(Graphics g) {

		g.setColor(getColor());
		g.drawPolygon(getX(), getY(), getNVertices());
	}

	public void fill(Graphics g) {

		g.setColor(getColor());
		g.fillPolygon(getX(), getY(), getNVertices());
	}
}
