package referencetypes;

import java.awt.Color;
import java.awt.Graphics;

public class ColourDrop extends Drop {

	Color color;

	public ColourDrop(int x, int y, int vx, int vy, int sz, Color c) {

		super(x, y, vx, vy, sz); 
		color = c;
	}
	
	public void draw(Graphics g){
		
		g.setColor(color);
		g.fillOval(xpos, ypos, size, size);
	}
}
