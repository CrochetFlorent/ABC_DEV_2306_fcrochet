package Robot2;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JFrame;


public class Deplacement extends JFrame{

	Image image;
	Graphics graphics;
	Box robot;
	
	public Deplacement()
	{
		robot = new Box(200,200,30,30,Color.green,0);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setSize(500, 500);
		this.setVisible(true);
		this.setBackground(Color.cyan);
	}
	
	public void paint(Graphics g)
	{
		image = createImage(this.getWidth(),this.getHeight());
		graphics = image.getGraphics();
		g.drawImage(image,0,0,this);

		robot.draw(g);
		
		}
	}	

