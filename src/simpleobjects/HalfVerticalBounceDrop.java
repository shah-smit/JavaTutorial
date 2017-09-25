package simpleobjects;

public class HalfVerticalBounceDrop extends Drop {
private boolean goUp;
	
	public HalfVerticalBounceDrop(int xpos, int ypos, int xvel, int yvel, int size) {

		super(xpos, ypos, xvel, yvel, size);
		goUp = false;
	}

	public void move(int width, int height) {
		
		if(ypos == height/2){
			goUp = true;
		}
		if(ypos == 0)
		{
			goUp = false;
		}
		
		if(goUp)
		{
			xpos = xpos - xvel;
			ypos = ypos - yvel;
		}
		
		if(!goUp)
		{
			xpos = xpos + xvel;
			ypos = ypos + yvel;
		}
	}

}
