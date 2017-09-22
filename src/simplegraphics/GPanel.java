package simplegraphics;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private int diameter = 40;

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

	public static void main(String[] args) {

		GPanel myPanel = new GPanel();

		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(myPanel);
		frame.setSize(300, 300);
		frame.setVisible(true);
	}
}
