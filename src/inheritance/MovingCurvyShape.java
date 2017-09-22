package inheritance;

public class MovingCurvyShape extends CurvyShape {

	int[] vx, vy;

	public MovingCurvyShape(int n) {

		super(n);
		vx = new int[getNVertices()];
		vy = new int[getNVertices()];
	}

	public MovingCurvyShape(int[] x, int[] y, int[] x1, int[] y1, int[] x2,
			int[] y2, int[] vx, int[] vy, int n) {

		super(x, y, x1, y1, x2, y2, n);
		this.vx = vx;
		this.vy = vy;
	}

	public void move(int left, int right, int top, int bottom) {

		for (int i = 0; i < getNVertices(); i++) {

			getX()[i] += vx[i];
			getY()[i] += vy[i];

			if (getX()[i] >= right) {

				vx[i] *= -1;
				getX()[i] = right;

			} else if (getX()[i] <= left) {

				vx[i] *= -1;
				getX()[i] = left;
			}

			if (getY()[i] >= bottom) {

				vy[i] *= -1;
				getY()[i] = bottom;

			} else if (getY()[i] <= top) {

				vy[i] *= -1;
				getY()[i] = top;
			}

		}

		path = makeGeneralPath(getX(), getY(), x1, y1, x2, y2, getNVertices());

	}

}
