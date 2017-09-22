package manyworlds;

import java.awt.Graphics;

public interface Gooable {

	public void draw(Graphics g, int x, int y);

	public void move(int extWidth, int extHeight);

	public void setX(int i);

	public int getX();

	public void setY(int i);

	public int getY();

	public int getWidth();

	public void setWidth(int i);

	public int getHeight();

	public void setHeight(int i);
}
