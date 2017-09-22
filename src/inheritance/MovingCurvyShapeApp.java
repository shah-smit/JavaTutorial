package inheritance;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class MovingCurvyShapeApp extends CurvyShapeApp {

	int maxSpeed;

	MovingCurvyShapeApp(int w, int h, boolean tryFSE, int ms) {

		super(w, h, tryFSE);
		maxSpeed = ms;
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
		int[] vx = new int[nVertices];
		int[] vy = new int[nVertices];

		for (int i = 0; i < nVertices; i++) {

			x[i] = width / 3 + random.nextInt(width / 3);
			y[i] = height / 3 + random.nextInt(height / 3);
			x1[i] = random.nextInt(width);
			y1[i] = random.nextInt(height);
			x2[i] = random.nextInt(width);
			y2[i] = random.nextInt(height);

			vx[i] = 1 + random.nextInt(maxSpeed - 1);
			if (random.nextDouble() > 0.5)
				vx[i] *= -1;

			vy[i] = 1 + random.nextInt(maxSpeed - 1);
			if (random.nextDouble() > 0.5)
				vy[i] *= -1;

		}

		setShape(new MovingCurvyShape(x, y, x1, y1, x2, y2, vx, vy, nVertices));

		Color color = new Color(random.nextInt(255), random.nextInt(255),
				random.nextInt(255));

		getShape().setColor(color);
	}

	public void draw(Graphics g) {

		super.draw(g);

		MovingCurvyShape movingCurly =  (MovingCurvyShape)getShape();
		movingCurly.move(0, getWidth(), 0, getHeight());
	}

	public static void main(String[] args) {


		MovingCurvyShapeApp goo = new MovingCurvyShapeApp(500, 500, true, 10);
		goo.init(100);

		goo.smooth();
		goo.frameRate(24);
		goo.go();
	}
}
