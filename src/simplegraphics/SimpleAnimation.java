package simplegraphics;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class SimpleAnimation {

	int x = 70; 
	int y = 70;

	JFrame frame;
	GooPanel gooPanel;

	class GooPanel extends JPanel {

		private static final long serialVersionUID = 1L;

		public void paintComponent(Graphics g) {

			g.setColor(Color.white); 
			g.fillRect(0, 0, this.getWidth(), this.getHeight());
			g.setColor(Color.green);
			g.fillOval(x, y, 40, 40);
		}
	}

	public SimpleAnimation() {

		gooPanel = new GooPanel();

		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(gooPanel);
		frame.setSize(300, 300);
	}

	public void go() {

		frame.setVisible(true);

		for (int i = 0; i < 130; i++) { 

			x++; 
			y++;

			gooPanel.repaint();

			try { 
				Thread.sleep(50); 
			} catch (InterruptedException e) {
			}
		}
	}

	public static void main(String[] args) {

		SimpleAnimation sa = new SimpleAnimation();
		sa.go();
	}
}
