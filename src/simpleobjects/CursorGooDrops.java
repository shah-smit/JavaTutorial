package simpleobjects;

import java.awt.Graphics;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import goo.Goo;

public class CursorGooDrops extends Goo implements MouseMotionListener {
	
	StaticDrop drop;
	StaticDrop drop1;
	StaticDrop drop2;
	StaticDrop drop3;
	StaticDrop drop4;
	ArrayList<StaticDrop> drops = new ArrayList<StaticDrop>();
	Graphics g;
	public CursorGooDrops(int width, int height) {
		super(width,height);
		
		//while(true) 	
		//{
			Point pt = MouseInfo.getPointerInfo().getLocation();
			drop = new StaticDrop((int)pt.getX(),(int)pt.getY(),0,1,10);
			drop1 = new StaticDrop((int)pt.getX(),(int)pt.getY(),1,0,10);
			drop2 = new StaticDrop((int)pt.getX(),(int)pt.getY(),0,-1,10);
			drop3 = new StaticDrop((int)pt.getX(),(int)pt.getY(),-1,0,10);
			drops.add(drop);
			drops.add(drop1);
			drops.add(drop2);
			drops.add(drop3);
		//}
	}
	
	public void mouseMoved(MouseEvent e) {
		int mouseX=e.getX();
		int mouseY=e.getY();
		System.out.println("You clicked on "+mouseX+","+mouseY);
		drop4 = new StaticDrop(mouseX,mouseY,-1,0,10);
		drops.add(drop4);
	}
	public void mouseEntered(MouseEvent e) {
	}
	public void mouseExited(MouseEvent e) {
	}

	public void draw(Graphics g) {
//		this.g = g;
//		drop.move(getHeight(), getWidth());
//		drop.draw(g);
//		drop1.move(getHeight(), getWidth());
//		drop1.draw(g);
//		drop2.move(getHeight(), getWidth());
//		drop2.draw(g);
//		drop3.move(getHeight(), getWidth());
//		drop3.draw(g);
		for(int i=0; i<drops.size(); i++)
		{
			if(drops.get(i) != null)
			{
				drops.get(i).move(getHeight(), getWidth());
				drops.get(i).draw(g);
			}
		}
	}
}
