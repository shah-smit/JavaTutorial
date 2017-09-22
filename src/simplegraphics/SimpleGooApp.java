package simplegraphics;

import java.awt.Color;
import java.awt.Graphics;

public class SimpleGooApp extends SimpleGoo {

	int x = 70, y = 70;
	int numFrames = 0;

	public SimpleGooApp(int w, int h) {
		super(w, h);
	}

	public void draw(Graphics g) {

		// write your animation here
		
		if (numFrames < 130) {
			x++;
			y++;
		}
		
		g.setColor(Color.green);
		g.fillOval(x, y, 40, 40);
		
		numFrames++;
	}

	public static void main(String[] args) {
		
		SimpleGooApp sg = new SimpleGooApp(300, 300);
		sg.go();
	}
}
