package simpleevents;

import goo.GooButton;
import goo.GooEvent;
import goo.GooListener;
import goo.GooSlider;

public class ControlledGooDropsApp {

	ControlledGooDrops gooDrops;

	class SliderListener implements GooListener{
		
		public void gooActionPerformed(GooEvent e) {
			
			gooDrops.slow(e.getValue() / 100.0f);
		}
	}
	
	class ButtonListener implements GooListener{
		
		public void gooActionPerformed(GooEvent e) {
			
			gooDrops.setStop(!gooDrops.getStop());
		}
	}
	
	public ControlledGooDropsApp() {

		int width = 800;
		int height = 500;
		int numDrops = 200;

		gooDrops = new ControlledGooDrops(width, height, numDrops);

		GooButton button = new GooButton(10, 20, 50, 50);
		gooDrops.addComponent(button);
		button.addListener(new ButtonListener());

		GooSlider slider = new GooSlider(10, 90, 200, 50);
		gooDrops.addComponent(slider);
		slider.addListener(new SliderListener());
		slider.setValue(100);
		
		gooDrops.background(0); // black background
		gooDrops.frameRate(25); // 25 frames per sec
		gooDrops.smooth();
		gooDrops.go();
	}

	public static void main(String[] args) {

		new ControlledGooDropsApp();
	}
}
