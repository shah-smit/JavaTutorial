package numbersandstatics;

import static java.lang.Math.*;
import static java.lang.System.out;
import static java.lang.String.format;
import static numbersandstatics.VecMath.*;

public class VecMathTest {

	public static String vecFormat(String formatStr, double[] a) {

		String s = "(";
		for (int i = 0; i < a.length - 1; i++) {
			s += format(formatStr, a[i]) + ", ";
		}
		s += format(formatStr, a[a.length - 1]) + ")";
		return s;
	}

	public static double toDegrees(double radians) {

		return (180 / PI) * radians;
	}

	public static void main(String[] args) {

		// initialise two vectors
		double[] a = { 5, 0, 0 };
		double[] b = { 5 * cos(PI / 6), 5 * sin(PI / 6), 0 };

		// format String
		String formatStr = "%.4f";

		// print a = OA and b = OB
		out.println("a = " + vecFormat(formatStr, a) + ", " + "b = "
				+ vecFormat(formatStr, b));

		// print lengths of a and b
		out.println("|a| = " + format(formatStr, length(a)) + ", |b| = "
				+ format(formatStr, length(b)));

		// find unit vector pointing along b
		double[] c = { 3, 4 };
		normalise(c);
		out.println("c hat = " + vecFormat(formatStr, c));

		// is it really a unit vector?
		out.println("length of c hat = " + format(formatStr, length(c)));

		// vector addition and subtraction
		c = add(a, b);
		out.println("a + b = " + vecFormat(formatStr, c));
		c = subtract(a, b);
		out.println("a - b = " + vecFormat(formatStr, c));

		// scalar multiplication
		c = mult(0.5, b);
		out.println("0.5b = " + vecFormat(formatStr, c));

		// dot product
		out.println("a.b = " + format(formatStr, dot(a, b)));

		// distance between A and B
		out.println("dist AB = " + format(formatStr, distance(a, b)));

		// cross product
		c = cross(a, b);
		out.println("c = a x b = " + vecFormat(formatStr, c));

		// is c at 90 degrees to a and b?
		out.println("a.c = " + dot(a, c) + ", b.c = " + dot(b, c));

		// angle AOB
		double angle = toDegrees(angle(a, b));
		out.println("angle AOB  = " + format(formatStr, angle));
	}
}
