package simpleobjects;

import java.awt.MouseInfo;

public class GooDropApp {
	
	public static void main(String[] args) {
		System.out.println(MouseInfo.getPointerInfo().getLocation());
		int width = 1400;
		int height = 100;
		
		GooDrops gd = new GooDrops(width, height);
		gd.smooth();
		gd.go();
	}
}
