package inheritance;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class MovingPolygonApp extends PolygonApp {

	int maxSpeed;

	MovingPolygonApp(int w, int h, boolean tryFSE, int ms) {

		super(w, h, tryFSE);
		maxSpeed = ms;
	}

	public void init(int nVertices) {

		int width = getWidth();
		int height = getHeight();

		int[] vx = new int[nVertices];
		int[] vy = new int[nVertices];

		Random random = getRandom();
		int[] x = new int[nVertices];
		int[] y = new int[nVertices];

		for (int i = 0; i < nVertices; i++) {

			x[i] = random.nextInt(width);
			y[i] = random.nextInt(height);
			vx[i] = 1 + random.nextInt(maxSpeed - 1);
			if (random.nextDouble() > 0.5)
				vx[i] *= -1;

			vy[i] = 1 + random.nextInt(maxSpeed - 1);
			if (random.nextDouble() > 0.5)
				vy[i] *= -1;
		}

		setShape(new MovingPolygon(x, y, vx, vy, nVertices));

		Color color = new Color(random.nextInt(255), random.nextInt(255),
				random.nextInt(255));
		getShape().setColor(color);
	}

	public void draw(Graphics g) {

		super.draw(g);
		MovingPolygon movingPoly = (MovingPolygon) getShape();
		movingPoly.move(0, getWidth(), 0, getHeight());
	}

	public static void main(String[] args) {

		MovingPolygonApp goo = new MovingPolygonApp(500, 500, false, 10);
		goo.init(100);
		goo.smooth();
		goo.go();
	}
}