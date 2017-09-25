package simpleobjects;


public class VerticalBounceDrop extends Drop {
	private boolean goUp;
	
	public VerticalBounceDrop(int xpos, int ypos, int xvel, int yvel, int size) {

		super(xpos, ypos, xvel, yvel, size);
		goUp = false;
	}

	public void move(int width, int height) {
		
		if(ypos == height){
			goUp = true;
		}
		if(ypos == 0)
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
