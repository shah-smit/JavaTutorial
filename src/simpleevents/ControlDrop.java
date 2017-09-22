package simpleevents;

import java.awt.Color;

import referencetypes.ColourDrop;

public class ControlDrop extends ColourDrop {

	private float modifier = 1.0f;
	
	public ControlDrop(int x, int y, int vx, int vy, int sz, Color c) {
		super(x, y, vx, vy, sz, c);
	}
	
	public void move(int width, int height){

		xpos = Math.round(xpos + getModifier() * xvel);
		ypos = Math.round(ypos + getModifier() * yvel);
		
		if (ypos > height) {
			ypos = 0;
			xpos = (int)(Math.random() * width);
		}
	}

	public void setModifier(float modifier) {
		this.modifier = modifier;
	}

	public float getModifier() {
		return modifier;
	}
}
