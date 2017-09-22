package simplegraphics;

import java.awt.Color;
import java.awt.Graphics;

public class GooDrawingApp extends GooDrawing {
	
	private int diameter = 40;

		public GooDrawingApp(int w, int h) {
		super(w, h);
	}

	public void draw(Graphics g) {
		
		// place your drawing instructions here
		
		int x = (getWidth() - diameter) / 2;
		int y = (getHeight() - diameter) / 2;

		g.setColor(Color.GREEN); // J
		g.fillOval(x, y, diameter, diameter);
	}
	
	public static void main(String[] args){

		GooDrawing app = new GooDrawingApp(300, 300);
		app.go();
	}
}
