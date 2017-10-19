package referencetypes;

import java.awt.Color;
import java.awt.Graphics;

public class GreenDrop extends Drop{

	public GreenDrop(int x, int y, int vx, int vy, int sz) {
		super(x, y, vx, vy, sz);
	}
	
	public void move(int width,int height){
		xpos = xpos + xvel;
		ypos = ypos + yvel;
		
		if ((ypos) > height || ypos < 0) {
			yvel *= -1;
		}
		
		if((xpos) > width || xpos < 0){
			xvel *= -1;
		}
	}
	
	public void draw(Graphics g){
		
		g.setColor(Color.GREEN);
		g.fillOval(xpos, ypos, size, size);
	}
}