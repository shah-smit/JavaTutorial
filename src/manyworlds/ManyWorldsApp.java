package manyworlds;

import goo.Goo;
import threads.ObjectServer;
import threads.UserIn;

public class ManyWorldsApp {

	public static void main(String[] args) {

		Thread t = new Thread(new Runnable() {

			public void run() {
				ObjectServer server = new ObjectServer();
				new UserIn(server);
				server.go();
			}

		});

		t.start();

		final int screenWidth = Goo.screenWidth();
		final int screenHeight = Goo.screenHeight();
		final int gooWidth = 9 * screenWidth / 20;
		final int gooHeight = 9 * screenHeight / 10;
		final int horizMargin = (screenWidth - 2 * gooWidth) / 3;
		final int vertMargin = (screenHeight - gooHeight) / 2;

		t = new Thread(new Runnable() {

			public void run() {
				boolean FSE = false;

				long seed = System.currentTimeMillis();

				GooWorld gooWorld = new GooWorld(gooWidth, gooHeight, FSE,
						seed++);
				gooWorld.setLocation(horizMargin, vertMargin);

				for (int i = 0; i < 10; i++) {

					int vMax = 5;
					int width = gooWorld.getWidth();
					int height = gooWorld.getHeight();
					int boxWidth = 50;
					int boxHeight = 50;

					Box box = new Box(width, height, vMax, boxWidth, boxHeight,
							seed++);

					vMax = 10;
					int blobWidth = 5;
					int blobHeight = 5;
					int numGooables = 10;
					for (int j = 0; j < numGooables; j++) {
						box.addGooable(new Blob(boxWidth, boxHeight, vMax,
								blobWidth, blobHeight, seed++));
					}
					gooWorld.addGooable(box);
				}

				gooWorld.smooth();
				gooWorld.go();
			}

		});
		t.start();

		t = new Thread(new Runnable() {

			public void run() {
				boolean FSE = false;

				long seed = 1066;

				GooWorld gooWorld = new GooWorld(gooWidth, gooHeight, FSE,
						seed++);
				gooWorld.setLocation(2 * horizMargin + gooWidth, vertMargin);

				for (int i = 0; i < 10; i++) {

					int width = gooWorld.getWidth();
					int height = gooWorld.getHeight();
					int vMax = 5;
					int butterflyWidth = 50;
					int butterflyHeight = 50;
					Box butterfly = new Butterfly(width, height, vMax,
							butterflyWidth, butterflyHeight, seed++);
					gooWorld.addGooable(butterfly);

				}

				gooWorld.smooth();
				gooWorld.go();
			}

		});
		t.start();

	}
}
