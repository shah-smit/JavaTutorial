package referencetypes;

import java.awt.Graphics;
import java.awt.Toolkit;
import java.util.Random;

import goo.Goo;

public class GooDrops extends Goo {

	private Drop[] drops;
	private int numDrops, maxSize = 9, maxVel = 9;
	private Random random;
	private GreenDrop greenDrop;

	public GooDrops(int w, int h, int nd) {

		super(w, h);
		numDrops = nd;

		drops = new Drop[numDrops];
		random = new Random(1962); 

		for (int i = 0; i < numDrops; i++) {

			int xpos = random.nextInt(w);
			int ypos = random.nextInt(h);
			int xvel = 0;
			int yvel = 1 + random.nextInt(maxVel);
			//int size = 1 + random.nextInt(maxSize);
			drops[i] = makeDrop(xpos, ypos, xvel, yvel, 20);
		}
		
		greenDrop = new GreenDrop(10,10,5,5,30);
	}
	
	public Drop makeDrop(int xpos, int ypos,int xvel,int yvel, 
			      int size){
		
		return new Drop(xpos, ypos, xvel, yvel, size);
	}

	public void draw(Graphics g) {
		
		greenDrop.move(getWidth(), getHeight());
		greenDrop.draw(g);

		for (int i = 0; i < numDrops; i++) {

			drops[i].move(getWidth(), getHeight());
			drops[i].draw(g);
			
			if(collision(greenDrop, drops[i])){
				Toolkit.getDefaultToolkit().beep();
				drops[i].setColor(g);
			}
		}
	}
	
	private boolean collision(Drop a, Drop b){
		if((a.getCenter() - 10) > b.getCenter() && (a.getCenter() + 10) < b.getCenter()){
			return true;
		}
		else{
			return false;
		}
	}

	public Drop[] getDrops(){
		
		return drops;
	}
	
	public Random getRandom(){
		
		return random;
	}
	
	public static void main(String[] args) {

		int width = 800;
		int height = 500;
		int numDrops = 15;
		GooDrops gd = new GooDrops(width, height, numDrops);
		
		gd.smooth();
		gd.go();
	}
}
