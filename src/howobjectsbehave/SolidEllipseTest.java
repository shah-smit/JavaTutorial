package howobjectsbehave;

import java.awt.Color;
import java.awt.Graphics;

import goo.Goo;

public class SolidEllipseTest extends Goo {
	
	SolidEllipse ellipse;
	
	public SolidEllipseTest(){
		
		super(500, 500);
		
		ellipse = new SolidEllipse(150, 150, 200, 200, Color.BLACK);
		smooth();
		noloop();
		go();
	}
	
	public void draw(Graphics g){
		
		ellipse.fill(g);
		int x = ellipse.getX();
		int y = ellipse.getY();
		g.drawRect(x, y , ellipse.getWidth(), ellipse.getHeight());
		
		String text = "(" + x + ", " + y + ")";
		double stringLen = (int)getStringBounds(text).getMaxX();
		g.drawString( text, (int)(x - stringLen /2), y - 5);
		
		text = "" + 200;
		stringLen = (int)getStringBounds(text).getMaxX();

		g.drawString( text, (int)(x + ellipse.getWidth() / 2 - stringLen /2), y - 5);
		g.drawString( text, x - (int)(stringLen - 5), y + ellipse.getHeight() / 2 );
	}
	
	public static void main(String[ ]args){
		new SolidEllipseTest();
	}

}
