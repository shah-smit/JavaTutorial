package simpleobjects;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class CustomColorDrop {

	int xpos, ypos, xvel, yvel, size;
	Color color;
	Random rd;
	public CustomColorDrop(int x, int y, int vx, int vy, int sz,Color color){
		
		xpos = x;
		ypos = y;
		xvel = vx;
		yvel = vy;
		size = sz;
		this.color = color;
		rd = new Random();
	}
	
	public void move(int width, int height){

		xpos = xpos + xvel;
		ypos = ypos + yvel;
		
		if (ypos > height) {
			
			ypos = 0;
			xpos = (int)(Math.random() * width);
		}
	}
	
	public void draw(Graphics g){
		
		g.setColor(color);
		g.fillOval(xpos, ypos, size, size);
	}
}
