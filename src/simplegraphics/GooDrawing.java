package simplegraphics;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

abstract class GooDrawing {

	private JFrame frame;
	private GooPanel gooPanel;

	class GooPanel extends JPanel {

		private static final long serialVersionUID = 1L;

		public void paintComponent(Graphics g) {

			g.setColor(Color.WHITE);
			g.fillRect(0, 0, this.getWidth(), this.getHeight());

			draw(g);
		}
	}

	public GooDrawing(int w, int h) {

		gooPanel = new GooPanel();

		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(gooPanel);
		frame.setSize(w, h);
	}

	public abstract void draw(Graphics g);

	public int getWidth() {

		return gooPanel.getWidth();
	}

	public int getHeight() {

		return gooPanel.getHeight();
	}

	void go() {

		frame.setVisible(true);
	}
}
