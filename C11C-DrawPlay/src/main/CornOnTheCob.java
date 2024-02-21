package main;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class CornOnTheCob {
	private static final int BODY_LENGTH = 50;
	private static final int BODY_HEIGHT = 20;
	public void draw(Graphics g, int cornX, int cornY) {
		Graphics2D g2 = (Graphics2D) g;
		g2.setColor(Color.yellow);
		g2.fillOval(cornX, cornY, BODY_LENGTH, BODY_HEIGHT);
		// text appears below corns body, +10 places below 
		// so it doesn't overlap the drawing
		g2.drawString("RAAAAWR", cornX, cornY+BODY_HEIGHT+10);	
	}
}