import java.awt.Color;
import java.awt.Graphics;

/*
 * What is a class in java?
 * 	template/blueprint for object
 * 
 * How do you create objects from a class
 * 
 * What are parts of a class?
 * 
 * What are the attributes/properties/instance variables?
 */
public class Ball { //class header

	// #1 - part of a class
	//	instance variables / properties
	public int x; // x position
	private int y; // y position
	private int width; // size variable
	private Color color; // color
	// private - hides implementation of code from outsiders
	
	// # - parts of a class - constructor
	// helps with creation of class
	// assigns value to the instance variable
	public Ball () { // the default constructor is the one w/o parameters
		
		x = (int)(Math.random()*501) + 100;
		y = (int)(Math.random()*301) + 100;
		
		width = 2;
		
		// also randomize the colors
		int red = (int)(Math.random()*256);
		int green = (int)(Math.random()*256);
		int blue = (int)(Math.random()*256);
		
		color = new Color(red, green, blue); 
		
	}
	
	public Ball (int newX, int newY, int newWidth) { 
		
		x = newX;
		y = newY;
		width = newWidth;
		
		int red = (int)(Math.random()*256);
		int green = (int)(Math.random()*256);
		int blue = (int)(Math.random()*256);
		
		color = new Color(red, green, blue); 
		
	}
	
	// add a method to the ball that allows it to paint itself
	public void paint(Graphics g) {
		
		// set the color
		g.setColor(color);
		
		// draw the object
		g.fillOval(x, y, width, width);
		
	}
	
}

