package simpleobjects;

import java.awt.Color;

public class VerticalBounceDrop extends CustomColorDrop {
	private boolean goUp;
	
	public VerticalBounceDrop(int xpos, int ypos, int xvel, int yvel, int size,Color color) {

		super(xpos, ypos, xvel, yvel, size,color);
		goUp = false;
	}

	public void move(int width, int height) {
		
		if(ypos >= height){
			goUp = true;
		}
		if(ypos <= 0)
		{
			goUp = false;
		}
		
		if(goUp)
		{
			ypos = ypos - yvel;
		}
		else
		{
			ypos = ypos + yvel;
		}
	}
}
