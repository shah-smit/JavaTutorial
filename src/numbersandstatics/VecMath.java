package numbersandstatics;

import static java.lang.Math.*;

public class VecMath {

	private VecMath() {
	}

	public static double length(double[] a) {

		return sqrt(dot(a, a));
	}

	public static void normalise(double[] a) {

		double mag = length(a);
		for (int i = 0; i < a.length; i++) {
			a[i] = a[i] / mag; 
		}
	}

	public static double distance(double[] a, double[] b) {

		return length(subtract(a, b));
	}

	public static double[] add(double[] a, double[] b) {

		int numCpts = a.length;
		double[] c = new double[numCpts];
		for (int i = 0; i < numCpts; i++) {
			c[i] = a[i] + b[i];
		}
		return c;
	}

	public static double[] subtract(double[] a, double[] b) {

		int numCpts = a.length;
		double[] c = new double[numCpts];
		for (int i = 0; i < numCpts; i++) {
			c[i] = a[i] - b[i];
		}
		return c;
	}

	public static double[] mult(double scalar, double[] a) {

		double[] b = new double[a.length];
		for (int i = 0; i < a.length; i++) {
			b[i] = scalar * a[i];
		}
		return b;
	}

	public static double[] cross(double[] a, double[] b) {
		
		if (a.length == b.length && b.length == 3) {
			double[] c = new double[3];
			c[0] = a[1] * b[2] - a[2] * b[1];
			c[1] = a[2] * b[0] - a[0] * b[2];
			c[2] = a[0] * b[1] - a[1] * b[0];
			return c;
		} else
			return new double[0];
	}

	public static double dot(double[] a, double[] b) {
		
		int numCpts = a.length;
		double result = 0.0;
		for (int i = 0; i < numCpts; i++) {
			result += a[i] * b[i];
		}
		return result;
	}

	public static double angle(double[] a, double[] b) {
		
		return acos(dot(a, b) / (length(a) * length(b)));
	}
}
