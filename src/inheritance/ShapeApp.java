package inheritance;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.util.Random;

import goo.Goo;

public class ShapeApp extends Goo {

	private Shape shape;
	private Random random;
	private boolean fill = true;

	public ShapeApp(int w, int h, boolean tryFSE) {

		super(w, h, tryFSE);
		setRandom(new Random(2001));
	}

	public void init(int n) {
	}

	public void draw(Graphics g) {

		if (!fill)
			getShape().draw(g);
		else
			getShape().fill(g);
	}

	public void mouseClicked(MouseEvent e) {

		init(shape.getNVertices()); 
		repaint();
	}

	public void keyPressed(KeyEvent e) {

		char key = e.getKeyChar();
		if (key == 'f')
			fill = true;
		else if (key == 'd')
			fill = false;

		repaint();
	}

	public void setRandom(Random random) {
		this.random = random;
	}

	public Random getRandom() {
		return random;
	}

	public void setShape(Shape shape) {
		this.shape = shape;
	}

	public Shape getShape() {
		return shape;
	}
}