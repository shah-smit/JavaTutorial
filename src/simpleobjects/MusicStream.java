package simpleobjects;

import goo.Goo; // A

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class MusicStream extends Goo { // B

	VerticalBounceDrop[] dropArray;
	Random rd;
	public MusicStream(int width, int height) { // C
		
		super(width, height);
		
		dropArray = new VerticalBounceDrop[100];
		rd = new Random();

		for(int i=0; i<dropArray.length; i++)
		{
			int sizeRan = rd.nextInt(30);
			int xposRan = rd.nextInt(width-sizeRan);
			int yposRan = height;
			
			int xVelRan = 0;
			int yVelRan = rd.nextInt(10);
			
			if(yVelRan == 0) yVelRan++;
			
			int ranColorR =rd.nextInt(250);
			int ranColorG =rd.nextInt(250);
			int ranColorB =rd.nextInt(250);
			Color color = new Color(ranColorR,ranColorG,ranColorB);
			
			dropArray[i] = new VerticalBounceDrop(xposRan, yposRan, xVelRan, yVelRan, sizeRan,color);
		}
		
	}

	public void draw(Graphics g) { // D
		for(int i=0; i<dropArray.length; i++)
		{
			int ranHeight = rd.nextInt(getHeight()/2)+(getHeight()/2);
			int ranWidth = rd.nextInt(1400);
			dropArray[i].move(ranWidth, ranHeight);
			dropArray[i].draw(g);
		}
	}
}
