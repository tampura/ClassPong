import java.awt.Color;
import java.awt.Graphics;

public class Paddle {
	
	// parts of a class - instance variables/properties
	// attributes
	
	private int x, y; // location
	private int width, height; // size
	private Color color; // color
	private int vy;
	
	// sets locations of paddle
	public Paddle (int newX, int newY) { 
		
		x = newX;
		y = newY;
		
		width = 20;
		height = 125;
		color = Color.black;
		
	}
	
	public void paint (Graphics g) {
		
		// update y
		y += vy; // velocity in y affects position in the y
		
		// set the color
		g.setColor(color);
		g.fillRect(x, y, width, height);
		
	}
	
	// SETTER - allows outsiders to set some value
	// in the class
	
	public void setVelocity(int newVy) {
		vy = newVy;
	}
	
}
