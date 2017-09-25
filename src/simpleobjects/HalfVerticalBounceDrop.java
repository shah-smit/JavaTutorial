package simpleobjects;

public class HalfVerticalBounceDrop extends Drop {
	private boolean goUp;
	private int halfHeight = 0;
	private int previousHalf = 0;
	
	public HalfVerticalBounceDrop(int xpos, int ypos, int xvel, int yvel, int size) {

		super(xpos, ypos, xvel, yvel, size);
		goUp = false;
	}

	public void move(int width, int height) {
		
			if(ypos == height){
				
				if(halfHeight == 0){
					previousHalf = halfHeight = height/2;
				}
				else{
					previousHalf =  previousHalf/2;
					
					if(previousHalf+halfHeight < height) {
						halfHeight = previousHalf+halfHeight;
					}
				}
				goUp = true;
			}
			
			if(ypos == halfHeight)
			{
				goUp = false;
			}
			
			if(goUp)
			{
				ypos = ypos - yvel;
			}
			
			if(!goUp)
			{
				ypos = ypos + yvel;
			}
		
	}

}
