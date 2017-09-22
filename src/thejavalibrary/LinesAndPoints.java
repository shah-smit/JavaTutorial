package thejavalibrary;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import goo.Goo;

public class LinesAndPoints extends Goo {

	private ArrayList<Point> points = new ArrayList<Point>();
	private boolean stopAll = true;

	public LinesAndPoints() {
		super(500, 500);
	}

	public void draw(Graphics g) {

		if (points.size() > 0) {

			Point previousP = points.get(points.size() - 1);
			g.setColor(Color.BLACK);

			for (Point p : points) {

				p.draw(g);
				g.drawLine(previousP.getX(), previousP.getY(), p.getX(), p.getY());
				previousP = p;
			}
			
			for (Point p : points) {

				if (!stopAll)
					p.move(getWidth(), getHeight());
				
				previousP = p;
			}
		}
	}

	public void mouseClicked(MouseEvent e) {

		points.add(new Point(e.getX(), e.getY()));
	}

	public void keyPressed(KeyEvent e) {

		if (e.getKeyChar() == 'c')
			points.clear();
		else if (e.getKeyChar() == 'p') {
			stopAll = !stopAll;
		}

	}

	public void mouseDragged(MouseEvent e) {

		Point mouseP = new Point(e.getX(), e.getY());
		for (Point p : points) {

			if (p.distance(mouseP) <= p.getRadius()) {

				p.setX(e.getX());
				p.setY(e.getY());
				break;
			}
		}
	}

	public static void main(String[] args) {

		Goo goo = new LinesAndPoints();
		goo.smooth();
		goo.go();
	}
}
