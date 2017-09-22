package serialisation;

import goo.Goo;

import java.awt.*;
import java.util.ArrayList;

public class GooWorld extends Goo {

	ArrayList<Gooable> gooables;

	public GooWorld(int w, int h, boolean b) {

		super(w, h, b);
		gooables = new ArrayList<Gooable>();
	}

	public void addGooable(Gooable g) {
		
		gooables.add(g);
	}


	public void draw(Graphics g) {

		for (Gooable obj : gooables) {

			obj.move(getWidth(), getHeight());
			obj.draw(g);
		}
	}

	public ArrayList<Gooable> getGooables() {

		return gooables;
	}
	
	public void addGooables(ArrayList<Gooable> g){
		
		gooables = g;
	}
}
