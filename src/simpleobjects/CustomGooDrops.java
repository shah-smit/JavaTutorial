package simpleobjects;

import goo.Goo; // A

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JOptionPane;

public class CustomGooDrops extends Goo { // B

	HorizontalBounceDrop[] horDropArray;
	VerticalBounceDrop[] dropArray;
	LeftDiagonalBounce[] leftDiagArray;
	RightDiagonalBounce[] rightDiagArray;
	Random rd;
	public CustomGooDrops(int width, int height) { // C
		
		super(width, height);
		String no_balls = JOptionPane.showInputDialog("Enter the number of balls?");
		int balls = Integer.parseInt(no_balls);
		if(balls == 0){
			balls = 1;
		}
		dropArray = new VerticalBounceDrop[balls];
		horDropArray = new HorizontalBounceDrop[balls];
		leftDiagArray = new LeftDiagonalBounce[balls];
		rightDiagArray = new RightDiagonalBounce[balls];
		rd = new Random();

		for(int i=0; i<dropArray.length; i++)
		{
			int sizeRan = rd.nextInt(30);
			int xposRan = rd.nextInt(width-sizeRan);
			int yposRan = rd.nextInt(height-sizeRan);
			
			int xVelRan = rd.nextInt(10);
			int yVelRan = rd.nextInt(10);
			
			if(xVelRan == 0) xVelRan++;
			if(yVelRan == 0) yVelRan++;
			
			int ranColorR =rd.nextInt(250);
			int ranColorG =rd.nextInt(250);
			int ranColorB =rd.nextInt(250);
			Color color = new Color(ranColorR,ranColorG,ranColorB);
			Color color1 = new Color(ranColorR+1,ranColorG+1,ranColorB+1);
			Color color2 = new Color(ranColorR+2,ranColorG+2,ranColorB+2);
			Color color3 = new Color(ranColorR+3,ranColorG+3,ranColorB+3);
			
			dropArray[i] = new VerticalBounceDrop(xposRan, yposRan, xVelRan, yVelRan, sizeRan,color3);
			horDropArray[i] = new HorizontalBounceDrop(xposRan, yposRan, xVelRan, yVelRan, sizeRan,color2);
			leftDiagArray[i] = new LeftDiagonalBounce(0,0,xVelRan,yVelRan,sizeRan,color1);
			rightDiagArray[i] = new RightDiagonalBounce(width,0,xVelRan,yVelRan,sizeRan,color);
		}
		
	}

	public void draw(Graphics g) { // D
		for(int i=0; i<dropArray.length; i++)
		{
			int ranHeight = rd.nextInt(900);
			int ranWidth = rd.nextInt(1400);
			dropArray[i].move(ranWidth, ranHeight);
			horDropArray[i].move(ranWidth, ranHeight);
			leftDiagArray[i].move(ranWidth, ranHeight);
			dropArray[i].draw(g);
			horDropArray[i].draw(g);
			leftDiagArray[i].draw(g);
			rightDiagArray[i].move(ranWidth, ranHeight);
			rightDiagArray[i].draw(g);
		}
//		drop.move(getWidth(), getHeight());
//		drop.draw(g);
	}
}
