package Robot2;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.*;

import javax.swing.JFrame;


public class Deplacement extends JFrame implements KeyListener{


	private static final long serialVersionUID = 1L;
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
		this.addKeyListener(this);
	}
	
	public void paint(Graphics g)
	{
		image = createImage(this.getWidth(),this.getHeight());
		graphics = image.getGraphics();
		g.drawImage(image,0,0,this);

		robot.draw(g);
		
		}
	public void KeyPressed(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_UP)
		{
			if (robot.getY() -10 >= 30)
			{
				robot.setY(this.getY()  - 10);
			}
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN)
		{
			if (robot.getY() + 10 <= 460)
			{
				robot.setY(this.getY()  + 10);
			}
		}
		if (e.getKeyCode() == KeyEvent.VK_LEFT)
		{
			if (robot.getX() -10 >= 0)
			{
				robot.setX(this.getX()  - 10);
			}
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			if (robot.getX() + 10 <= 460)
			{
				robot.setX(this.getX()  + 10);
			}
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		switch(e.getKeyChar())
		{
		case 'z' : robot.setLocation(robot.x, robot.y-5);repaint();
			break;
		case 'q' : robot.setLocation(robot.x-5, robot.y);repaint();
			break;
		case 'd' : robot.setLocation(robot.x+5, robot.y);repaint();
			break;
		case 's' : robot.setLocation(robot.x, robot.y+5);repaint();
			break;
		}
		
	}


	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}

