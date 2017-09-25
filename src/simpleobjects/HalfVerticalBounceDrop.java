package simpleobjects;

public class HalfVerticalBounceDrop extends Drop {
	private boolean goUp;
	private int halfHeight = 0;
	
	public HalfVerticalBounceDrop(int xpos, int ypos, int xvel, int yvel, int size) {

		super(xpos, ypos, xvel, yvel, size);
		goUp = false;
	}

	public void move(int width, int height) {
		System.out.println("--"+ypos+"--");
		//A
		
		
			if(ypos == height){
				//AA
				if(halfHeight == 0){
					System.out.println("halfHeight == 0");
					 halfHeight = height/2;
					 System.out.println("halfHeight: "+halfHeight);
				}
				//AAA
				else{
					int half =  (halfHeight/2);
					if(half+halfHeight < height)  halfHeight = half+halfHeight;
					
					System.out.println("halfHeight: "+halfHeight);
				} 
				goUp = true;
			}
			
			//B
			if(ypos == halfHeight)
			{
				System.out.println("halfHeight: ypos == halfHeight");
				System.out.println("halfHeight: "+halfHeight);
				goUp = false;
			}
			
			//C
			if(goUp)
			{
				ypos = ypos - yvel;
			}
			
			//D
			if(!goUp)
			{
				ypos = ypos + yvel;
			}
		
	}

}
