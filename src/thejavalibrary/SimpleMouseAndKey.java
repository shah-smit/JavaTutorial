package thejavalibrary;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

import goo.Goo;

public class SimpleMouseAndKey extends Goo {

	public void keyPressed(KeyEvent e) {
		System.out.println("Kep pressed " + e.getKeyCode());
	}

	public void keyTyped(KeyEvent e) {
		System.out.println("Kep typed " + e.getKeyChar());
	}

	public void mouseClicked(MouseEvent e) {
		System.out.println("Mouse clicked at (" + e.getX() + ", " + e.getY()
				+ ")");
	}

	public void mouseDragged(MouseEvent e) {
		System.out.println("Mouse dragged at (" + e.getX() + ", " + e.getY()
				+ ")");
	}

	public void draw(Graphics g) {
	}

	public static void main(String[] args) {
		new SimpleMouseAndKey().go();
	}

	
}
