package simpleobjects;

import java.awt.Color;
import java.awt.Graphics;

public class StaticDrop {
int xpos, ypos, xvel, yvel, size;
	
	public StaticDrop(int x, int y, int vx, int vy, int sz){
		
		xpos = x;
		ypos = y;
		xvel = vx;
		yvel = vy;
		size = sz;
	}
	
	public void move(int width, int height){}
	
	public void draw(Graphics g){
		
		g.setColor(Color.YELLOW);
		g.fillOval(xpos, ypos, size, size);
	}

}
