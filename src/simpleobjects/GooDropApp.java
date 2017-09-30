package simpleobjects;

import java.awt.MouseInfo;

public class GooDropApp {
	
	public static void main(String[] args) {
		System.out.println(MouseInfo.getPointerInfo().getLocation());
		int width = 1400;
		int height = 900;
		CursorGooDrops gd = new CursorGooDrops(width, height);
		gd.smooth();
		gd.go();
	}
}
