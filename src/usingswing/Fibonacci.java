package usingswing;

import java.math.BigInteger;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.WindowConstants;

public class Fibonacci {

	public static void main(String[] args) {

		StringBuilder result = new StringBuilder(
				"<html><body><h1>Fibonacci Numbers</h1><ol>");

		BigInteger fib1 = BigInteger.valueOf(0);
		BigInteger fib2 = BigInteger.valueOf(1);

		for (int i = 0; i < 1000; i++) {

			result.append("<li>");
			result.append(fib1);
			BigInteger fib3 = new BigInteger(fib2.toByteArray());
			fib2 = fib2.add(fib1);
			fib1 = fib3;
		}

		result.append("</ol></body></html>");

		JEditorPane jep = new JEditorPane("text/html", result.toString());
		jep.setEditable(false);

		JScrollPane scrollPane = new JScrollPane(jep);
		JFrame f = new JFrame("Fibonacci Numbers");
		f.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		f.getContentPane().add(scrollPane);
		f.setSize(512, 342);
		f.setVisible(true);
	}
}
