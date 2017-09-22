package inheritance;

import java.awt.Color;
import java.awt.Graphics;

public class Shape {

	private int[] x, y;
	private int nVertices;
	private Color color = Color.BLACK;

	public Shape(int n) {

		setNVertices(n);
		setX(new int[n]);
		setY(new int[n]);
	}

	public Shape(int[] x, int[] y, int n) {

		this.x = x;
		this.y = y;
		nVertices = n;
	}

	public void draw(Graphics g) {
	}

	public void fill(Graphics g) {
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color c) {
		color = c;
	}

	public void setX(int[] x) {
		this.x = x;
	}

	public int[] getX() {
		return x;
	}

	public void setY(int[] y) {
		this.y = y;
	}

	public int[] getY() {
		return y;
	}

	public void setNVertices(int nVertices) {
		this.nVertices = nVertices;
	}

	public int getNVertices() {
		return nVertices;
	}
}
