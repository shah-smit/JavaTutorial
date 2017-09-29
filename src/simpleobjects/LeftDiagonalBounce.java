package simpleobjects;

import java.awt.Color;

public class LeftDiagonalBounce extends CustomColorDrop {
	private boolean goLeftDiagonalUp;
	
	public LeftDiagonalBounce(int xpos, int ypos, int xvel, int yvel, int size, Color color) {

		super(xpos, ypos, xvel, yvel, size,color);
		goLeftDiagonalUp = false;
	}

	public void move(int width, int height) {
		
		if(ypos >= height || xpos >= width){
			goLeftDiagonalUp = true;
		}
		if(ypos <= 0 || xpos <= 0)
		{
			goLeftDiagonalUp = false;
		}
		
		if(goLeftDiagonalUp)
		{
			xpos = xpos - xvel;
			ypos = ypos - yvel;
		}
		else
		{
			xpos = xpos + xvel;
			ypos = ypos + yvel;
		}
	}
}
