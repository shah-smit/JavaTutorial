package simpleobjects;

public class GooDropApp {
	
	public static void main(String[] args) {

		int width = 1400;
		int height = 900;
		GooDrops gd = new GooDrops(width, height);
		gd.smooth();
		gd.go();
	}
}
