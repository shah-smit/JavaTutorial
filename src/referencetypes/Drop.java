package referencetypes;

import java.awt.Color;
import java.awt.Graphics;

public class Drop {

	protected int xpos, ypos, xvel, yvel, size;
	
	public Drop(int x, int y, int vx, int vy, int sz){
		
		xpos = x;
		ypos = y;
		xvel = vx;
		yvel = vy;
		size = sz;
	}
	
	public void move(int width, int height){

		xpos = xpos + xvel;
		ypos = ypos + yvel;
		
		if (ypos > height) {
			ypos *= -1;
			xpos = (int)(Math.random() * width);
		}
		
		if (xpos > width) {
			xpos *= -1;
			ypos = (int)(Math.random() * height);
		}
		
	}
	
	public void draw(Graphics g){
		
		g.setColor(Color.gray);
		g.fillOval(xpos, ypos, size, size);
	}

	public int getX() {
		// TODO Auto-generated method stub
		return xpos;
	}
	
	public int getY() {
		// TODO Auto-generated method stub
		return ypos;
	}
	
	public int getSize(){
		return size;
	}
	
	public int getCenter(){
		int half = size/2;
		return (xpos+half)+(ypos+half);
	}
	
	public void setColor(Graphics g){
		g.setColor(Color.GREEN);
		g.fillOval(xpos, ypos, size, size);
	}
}
