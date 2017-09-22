package inheritance;

import java.awt.Color;
import java.util.Random;

import goo.Goo;

public class PolygonApp extends ShapeApp {

	PolygonApp(int w, int h, boolean tryFSE) {

		super(w, h, tryFSE);
	}

	public void init(int nVertices) {

		int width = getWidth();
		int height = getHeight();

		Random random = getRandom();
		int[] x = new int[nVertices];
		int[] y = new int[nVertices];

		for (int i = 0; i < nVertices; i++) {

			x[i] = random.nextInt(width);
			y[i] = random.nextInt(height);
		}

		setShape(new Polygon(x, y, nVertices));

		Color color = new Color(random.nextInt(255), random.nextInt(255),
				random.nextInt(255));
		getShape().setColor(color);
	}

	public static void main(String[] args) {

		Goo goo = new PolygonApp(500, 500, false);
		((PolygonApp) goo).init(10);
		goo.noloop();
		goo.smooth();
		goo.go();
	}
}