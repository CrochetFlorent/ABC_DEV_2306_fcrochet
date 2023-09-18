import java.awt.*;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;

public class MyFrame extends JFrame{

	Image image;
	Graphics graphics;
	Box player;
	Box ennemy;
	boolean gameOver;
	
	public MyFrame()
	{
		player = new Box(100,300,35,35,Color.blue);
		ennemy = new Box(400,300,35,35,Color.red);
		gameOver = false;
		
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setSize(600, 600);
		this.setVisible(true);
		this.addKeyListener(new AL());
	}
	
	public void paint(Graphics g)
	{
		image = createImage(this.getWidth(),this.getHeight());
		graphics = image.getGraphics();
		g.drawImage(image,0,0,this);
		
		player.draw(g);
		ennemy.draw(g);
		
		if(gameOver)
		{
			g.setColor(Color.red);
			g.setFont(new Font("Mv Boli",Font.PLAIN,45));
			g.drawString("GAME OVER",150,100);
		}
	}
	
	public void checkCollision()
	{
		if(player.intersects(ennemy))
		{
			gameOver = true;
			System.out.println("GAME OVER!");
		}
	}
	
	public class AL extends KeyAdapter {
		@Override
		public void keyPressed(KeyEvent e)
		{
			player.KeyPressed(e);
			checkCollision();
			repaint();
			
		}
	}
}
