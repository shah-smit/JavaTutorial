package serialisation;

import java.awt.Color;

public class GooWorldApp {

	public static void main(String[] args) {

		boolean FSE = false;
		GooWorld gooWorld = new GooWorld(500, 500, FSE);

		long seed = System.currentTimeMillis();
		for (int i = 0; i < 10; i++)
			gooWorld.addGooable(
				new FlappingPolygon(gooWorld.getWidth(),
					gooWorld.getHeight(), seed++));

		gooWorld.background(Color.BLACK);
		gooWorld.smooth();
		gooWorld.go();
	}
}
