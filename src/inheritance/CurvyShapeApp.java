package inheritance;

import java.awt.Color;
import java.util.Random;

import goo.Goo;

public class CurvyShapeApp extends ShapeApp {

	CurvyShapeApp(int w, int h, boolean tryFSE) {

		super(w, h, tryFSE);
	}

	public void init(int nVertices) {

		int width = getWidth();
		int height = getHeight();

		Random random = getRandom();
		int[] x = new int[nVertices];
		int[] y = new int[nVertices];

		int[] x1 = new int[nVertices];
		int[] y1 = new int[nVertices];

		int[] x2 = new int[nVertices];
		int[] y2 = new int[nVertices];

		for (int i = 0; i < nVertices; i++) {

			x[i] = random.nextInt(width);
			y[i] = random.nextInt(height);
			x1[i] = random.nextInt(width);
			y1[i] = random.nextInt(height);
			x2[i] = random.nextInt(width);
			y2[i] = random.nextInt(height);
		}

		setShape(new CurvyShape(x, y, x1, y1, x2, y2, nVertices));

		Color color = new Color(random.nextInt(255), random.nextInt(
				255), random.nextInt(255));

		getShape().setColor(color);
	}

	public static void main(String[] args) {

		Goo goo = new CurvyShapeApp(500, 500, false);
		((CurvyShapeApp) goo).init(10);
		goo.noloop();
		goo.smooth();
		goo.go();
	}
}