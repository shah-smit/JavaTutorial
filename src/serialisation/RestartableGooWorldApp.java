package serialisation;

import java.awt.Color;

public class RestartableGooWorldApp {

	public static void main(String[] args) {

		boolean FSE = false;
		RestartableGooWorld gooWorld = new RestartableGooWorld(500, 500, FSE);

		// Attempt to load saved objects
		try {
			gooWorld.load();
		} catch (Exception e) {
			// If *anything* goes wrong
			long seed = System.currentTimeMillis();
			for (int i = 0; i < 10; i++)
				gooWorld.addGooable(new FlappingPolygon(gooWorld.getWidth(),
						gooWorld.getHeight(), seed++));
		}

		gooWorld.background(Color.BLACK);
		gooWorld.smooth();
		gooWorld.go();
	}
}
