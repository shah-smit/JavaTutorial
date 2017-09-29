package simpleobjects;

import java.awt.Color;

public class RightDiagonalBounce extends CustomColorDrop{
private boolean goLeftDiagonalUp;
	
	public RightDiagonalBounce(int xpos, int ypos, int xvel, int yvel, int size,Color color) {

		super(xpos, ypos, xvel, yvel, size,color);
		goLeftDiagonalUp = false;
	}

	public void move(int width, int height) {
		
		if(ypos >= height || xpos <= 0){
			goLeftDiagonalUp = true;
		}
		if(ypos <= 0 || xpos >= width)
		{
			goLeftDiagonalUp = false;
		}
		
		if(goLeftDiagonalUp)
		{
			xpos = xpos + xvel;
			ypos = ypos - yvel;
		}
		else
		{
			xpos = xpos - xvel;
			ypos = ypos + yvel;
		}
	}
}
