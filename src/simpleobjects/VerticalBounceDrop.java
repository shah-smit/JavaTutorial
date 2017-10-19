package simpleobjects;

import java.awt.Color;
import java.awt.Toolkit;

public class VerticalBounceDrop extends CustomColorDrop {
	private boolean goUp;
	
	public VerticalBounceDrop(int xpos, int ypos, int xvel, int yvel, int size,Color color) {

		super(xpos, ypos, xvel, yvel, size,color);
		goUp = false;
	}

	public void move(int width, int height) {
		
		if(ypos >= height){
			Toolkit.getDefaultToolkit().beep();
			goUp = true;
		}
		if(ypos <= 0)
		{
			Toolkit.getDefaultToolkit().beep();
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
