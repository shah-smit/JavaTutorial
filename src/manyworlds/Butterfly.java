package manyworlds;

import java.awt.Graphics;
import java.util.Random;

public class Butterfly extends Box{

	private static final long serialVersionUID = 1L;

	
	int[] xP, yP, vxP, vyP;
	int vPMax;
	
	int maxVertices, nVertices;
	
	
	public Butterfly(int outerWidth, int outerHeight, int vmax, int miniWidth, int miniHeight,
			long seed) {
		super(outerWidth, outerHeight, vmax, miniWidth, miniHeight, seed);

	}

	public Butterfly(int outerWidth, int outerHeight, int vmax, int miniWidth, int miniHeight,
			Random r) {

		super(outerWidth, outerHeight, vmax, miniWidth, miniHeight, r);
	}
	
	public void init(int outerWidth, int outerHeight, int vm, int w, int h) {
		
		super.init(outerWidth, outerHeight, vm, w,h);

		// Internal param init
		vPMax = Math.min(width, height) / 3;
		maxVertices = 20;
		nVertices = maxVertices / 2;

		xP = new int[nVertices];
		yP = new int[nVertices];
		vxP = new int[nVertices];
		vyP = new int[nVertices];

		for (int i = 0; i < nVertices; i++) {

			xP[i] = random.nextInt(width);
			yP[i] = random.nextInt(height);

			vxP[i] = 1 + random.nextInt(vPMax - 1);
			if (random.nextDouble() > 0.5)
				vxP[i] *= -1;

			vyP[i] = 1 + random.nextInt(vPMax - 1);
			if (random.nextDouble() > 0.5)
				vyP[i] *= -1;
		}
	}

	public void draw(Graphics g, int ox, int oy) {

		super.draw(g, ox, oy);
		
		g.setColor(color);
		
		
		int[] xx = new int[nVertices];
		int[] yy = new int[nVertices];
		for(int i = 0; i < nVertices; i++){
			xx[i] = ox + x + xP[i];
			yy[i] = oy  + y + yP[i];
		}
		
		g.fillPolygon(xx, yy, nVertices);
	}

	public void move(int outerWidth, int outerHeight) {

		super.move(outerWidth, outerHeight);
		for (int i = 0; i < nVertices; i++) {

			xP[i] += vxP[i];
			yP[i] += vyP[i];

			// circular boundary conditions
			xP[i] %= width;
			if (xP[i] < 0)
				xP[i] += width;
			
			yP[i] %= height;
			if (yP[i] < 0)
				yP[i] += width;
		}
	}
}
