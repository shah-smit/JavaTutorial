package simplegraphics;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

class Drawing {

	class GooPanel extends JPanel {

		private static final long serialVersionUID = 1L;

		public void paintComponent(Graphics g) {

			int width = this.getWidth();
			int height = this.getHeight();

			g.setColor(Color.WHITE);
			g.fillRect(0, 0, width, height);

			int x = (width - diameter) / 2;
			int y = (height - diameter) / 2;

			g.setColor(Color.GREEN); // J
			g.fillOval(x, y, diameter, diameter);
		}
	}

	private int diameter = 40;
	private JFrame frame;
	private GooPanel gooPanel;

	public Drawing() {

		gooPanel = new GooPanel();

		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(gooPanel);
		frame.setSize(300, 300);
	}

	void go() {

		frame.setVisible(true);
	}

	public static void main(String[] args) {

		Drawing drawing = new Drawing();
		drawing.go();
	}
}
