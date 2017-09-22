package exceptionhandling;

import static java.lang.Math.*;

public class SafeVecMath {

	private SafeVecMath() {
	}

	public static double length(double[] a) {

		return sqrt(dot(a, a));
	}

	public static void normalize(double[] a) {

		double mag = length(a);
		if (mag == 0)
			return;

		for (int i = 0; i < a.length; i++) {
			a[i] = a[i] / mag;
		}

	}

	public static double dot(double[] a, double[] b) {

		int numCpts = a.length;
		if (b.length != numCpts)
			return Double.NaN;
		
		double result = 0.0;
		for (int i = 0; i < numCpts; i++) {
			result += a[i] * b[i];
		}
		return result;
	}
}
