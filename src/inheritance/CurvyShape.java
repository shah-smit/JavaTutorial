package inheritance;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.GeneralPath;

public class CurvyShape extends Shape {

	GeneralPath path;
	int[] x1, y1, x2, y2;

	public CurvyShape(int n) {

		super(n);

		path = new GeneralPath(GeneralPath.WIND_EVEN_ODD);

		x1 = new int[getNVertices()];
		y1 = new int[getNVertices()];
		x2 = new int[getNVertices()];
		y2 = new int[getNVertices()];
	}

	public CurvyShape(int[] x, int[] y, int[] x1, int[] y1, int[] x2, int[] y2,
			int n) {

		super(x, y, n);

		this.x1 = x1;
		this.y1 = y1;

		this.x2 = x2;
		this.y2 = y2;
		path = new GeneralPath(GeneralPath.WIND_EVEN_ODD);
		path = makeGeneralPath(x, y, x1, y1, x2, y2, n);

	}

	public GeneralPath makeGeneralPath(int[] x, int[] y, int[] x1,
			int[] y1, int[] x2, int[] y2, int n) {

		GeneralPath path = new GeneralPath(GeneralPath.WIND_EVEN_ODD);

		path.moveTo(x[0], y[0]);
		for (int i = 0; i < n; i++) {

			int j = (i + 1) % n;
			path.curveTo(x1[i], y1[i], x2[i], y2[i], x[j], y[j]);
		}
		return path;
	}

	public void draw(Graphics g) {

		g.setColor(getColor());
		Graphics2D g2d = (Graphics2D) g;
		g2d.draw(path);
	}

	public void fill(Graphics g) {

		g.setColor(getColor());
		Graphics2D g2d = (Graphics2D) g;
		g2d.fill(path);
	}
}
