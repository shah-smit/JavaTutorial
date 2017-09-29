package simpleobjects;

import java.awt.Color;

public class HorizontalBounceDrop extends CustomColorDrop {
	private boolean goLeft;
	
	public HorizontalBounceDrop(int xpos, int ypos, int xvel, int yvel, int size,Color color) {

		super(xpos, ypos, xvel, yvel, size,color);
		goLeft = false;
	}

	public void move(int width, int height) {
		
		if(xpos >= width){
			goLeft = true;
		}
		if(xpos <= 0)
		{
			goLeft = false;
		}
		
		if(goLeft)
		{
			xpos = xpos - xvel;
		}
		else
		{
			xpos = xpos + xvel;
		}
	}

}
