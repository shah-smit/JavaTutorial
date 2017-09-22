package exceptionhandling;

import static java.lang.System.out;
import static java.lang.String.format;

import static exceptionhandling.SafeVecMath.*;

public class SafeVecMathTest {

	public static String vecFormat(String formatStr, double[] a) {

		String s = "(";
		for (int i = 0; i < a.length - 1; i++) {
			s += format(formatStr, a[i]) + ", ";
		}
		s += format(formatStr, a[a.length - 1]) + ")";
		return s;
	}

	public static void main(String[] args) {

		// format String
		String formatStr = "%.4f";

		// dot product with different size vectors
		double[] a = new double[] { 1, 1, 0 };
		double[] b = new double[] { 1, 1 };
		out.println("a.b = " + format(formatStr, dot(a, b)));

		// normalise a zero vector?
		double[] c = { 0, 0, 0 };
		normalize(c);
		out.println("c hat = " + vecFormat(formatStr, c));

		// how to write safe client code
		if (a.length != b.length) {
			out.println("unequal sized vectors"); 
		} else {
			if (dot(a, b) == 0) {
				// carry on...
			}
		}
		if (length(c) == 0) {
			out.println("zero length vector");
		} else {
			normalize(c);
			// carry on... 
		}

	}
}
