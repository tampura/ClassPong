import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Frame extends JPanel implements KeyListener, ActionListener{
	
	// paddles
	private Paddle left = new Paddle (10, 10);
	private Paddle right = new Paddle (690, 10);
			
	public void paint(Graphics g) {
		super.paintComponent(g);
		
		//write ANY loop to create 10000 Ball objects
		// write ANY loop to do something 10000 times
		for(int i = 0; i < 400; i += 4) {
			Ball b = new Ball(i + 20, 150,  i);
			b.paint(g);
		}
		
		//draw out paddles
		left.paint(g);
		right.paint(g);
	}
	
	public Frame() {
		JFrame f = new JFrame("Pong");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(800,600);
		f.add(this);
		f.addKeyListener(this);
		t = new Timer(16, this);
		t.start();
		f.setVisible(true);
		
	}
	
	public static void main(String[] arg) {
		Frame f = new Frame();
	}	
	
	@Override
	public void keyPressed(KeyEvent arg0) {
		if(arg0.getKeyCode()==83) {
	
			// 's'
			left.setVelocity(5);
			
		}
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		if(arg0.getKeyCode()==83) {
			
			// 's'
			left.setVelocity(0);
			
		}
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	Timer t;

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		repaint();
	}
}
