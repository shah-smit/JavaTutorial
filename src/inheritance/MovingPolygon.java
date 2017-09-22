package inheritance;

public class MovingPolygon extends Polygon {

	int[] vx, vy;
	
	public MovingPolygon(int n) {

		super(n);
		vx = new int[getNVertices()];
		vy = new int[getNVertices()];
	}

	public MovingPolygon(int[] x, int[] y, int vx[], int[] vy, int n) {

		super(x, y, n);
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
	}
}
