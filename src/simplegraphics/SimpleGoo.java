package simplegraphics;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public abstract class SimpleGoo {

	private JFrame frame; 
	private GooPanel gooPanel;

	private boolean loop = false;
	
	class GooPanel extends JPanel {

		private static final long serialVersionUID = 1L;

		public void paintComponent(Graphics g) { 

			g.setColor(Color.white);
			g.fillRect(0, 0, this.getWidth(), this.getHeight());
			draw(g); 
		}
	}

	public SimpleGoo(int w, int h) {

		gooPanel = new GooPanel();

		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(gooPanel);
		frame.setSize(w, h);
	}

	public abstract void draw(Graphics g);

	public void go() {
		
		frame.setVisible(true);
		loop = true;
		while (loop) { 

			gooPanel.repaint();

			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
			}
		}
	}
}
