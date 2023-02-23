package studio4;

import java.awt.Color;
import java.util.Scanner;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.setPenColor(22,208,255);
		StdDraw.filledRectangle(0.5, 0.5, 0.6, 0.4);
		StdDraw.setPenColor(255,0,255);
		StdDraw.filledRectangle(0.5, 0.5, 0.2, 0.2);
		StdDraw.setPenColor(247,105,0);
		StdDraw.filledCircle(0.5, 0.5, 0.2);
		StdDraw.setPenColor(194,178,128);
		StdDraw.filledRectangle(0.1, 0.1, 0.9, 0.2);
		StdDraw.setPenColor(58,29,0);
		StdDraw.filledRectangle(0.2, 0.5, 0.05, 0.2);
		StdDraw.setPenColor(19,80,19);
		StdDraw.filledEllipse(0.3, 0.7, 0.25, 0.2);
	}
}