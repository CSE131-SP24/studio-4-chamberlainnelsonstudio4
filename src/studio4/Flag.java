package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.setPenColor(Color.red);
		StdDraw.filledSquare(0.5,0.5,0.2);
		StdDraw.setPenColor(Color.black);
		StdDraw.square(0.5,0.5,0.2);
		StdDraw.setPenColor(Color.white);
		StdDraw.filledRectangle(0.5,0.5,0.12,0.04);
		StdDraw.filledRectangle(0.5,0.5,0.04,0.12);
		StdDraw.filledPolygon(null, null);


	}
}