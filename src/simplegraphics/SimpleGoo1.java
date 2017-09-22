package simplegraphics;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JFrame;
import javax.swing.JPanel;

public abstract class SimpleGoo1 {

	private JFrame frame;
	private GooPanel gooPanel;

	private boolean loop = true;
	private boolean smooth = false;

	private int width, height;

	private Color backgroundColor = Color.white;

	private int frameTime = 50;

	private RenderingHints renderingHints = new RenderingHints(
			RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

	class GooPanel extends JPanel {

		private static final long serialVersionUID = 1L;

		public void paintComponent(Graphics g) {

			Graphics2D g2d = (Graphics2D) g;
			if (smooth)
				g2d.setRenderingHints(renderingHints);
			g2d.setColor(backgroundColor);
			g2d.fillRect(0, 0, this.getWidth(), this.getHeight());
			draw(g2d);
		}
	}

	public SimpleGoo1() {

		this(300, 300);
	}

	public SimpleGoo1(int w, int h) {

		width = w;
		height = h;

		gooPanel = new GooPanel();

		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(gooPanel);
		frame.setSize(width, height);
	}

	public abstract void draw(Graphics g);

	public void smooth() {

		smooth = true;
	}

	public void noSmooth() {

		smooth = false;
	}

	public void frameRate(double framesPerSec) {

		frameTime = (int) (1000 / framesPerSec);
	}

	public void background(int gscale) {

		background(gscale, gscale, gscale);
	}

	public void background(int red, int green, int blue) {

		backgroundColor = new Color(red, green, blue);
	}

	public int getWidth() {

		return width;
	}

	public int getHeight() {

		return height;
	}

	public void noloop() {

		loop = false;
	}

	public void loop() {

		loop = true;
	}

	public void go() {

		frame.setVisible(true);
		while (loop) {

			gooPanel.repaint();

			try {
				Thread.sleep(frameTime);
			} catch (InterruptedException e) {
			}
		}
	}
}
