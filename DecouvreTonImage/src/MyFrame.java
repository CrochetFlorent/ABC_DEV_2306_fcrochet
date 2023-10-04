import java.awt.*;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;

import javax.swing.JFrame;
public class MyFrame extends JFrame{

	Image image;
	Graphics graphics;
	Box player;
	Box goal;
	boolean touch;
	boolean begin = false;;
	
	public MyFrame()
	{
		Random rand = new Random();
		player = new Box(100,300,40,40,Color.blue,0);
		goal = new Box(rand.nextInt(460-30),rand.nextInt(460-30),40,40,Color.cyan,0);
		touch = false;

		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setSize(500, 500);
		this.setVisible(true);
		this.setBackground(Color.cyan);
		this.addKeyListener(new AL());	
	}
	
	public void paint(Graphics g)
	{
		image = createImage(this.getWidth(),this.getHeight());
		graphics = image.getGraphics();
		g.drawImage(image,0,0,this);

		player.draw(g);
		goal.draw(g);
		
		if (begin == false)
		{
			g.setColor(Color.red);
			g.drawString("Déplacez-vous avec les flèches du clavier",130,100);
		}
		if(touch)	
		{
			g.setColor(Color.red);
			g.setFont(new Font("Mv Boli",Font.PLAIN,35));
			g.drawString("C'est gagné",130,100);
			g.drawString("en "+player.move+" déplacements !",110,150);
		}
	}	
	public void checkCollision()
	{
		if(player.intersects(goal))
		{
			touch = true;
			goal.color = Color.green;
			repaint();
		}
	}	
	public class AL extends KeyAdapter {
		@Override
		public void keyPressed(KeyEvent e)
		{
			begin = true;
			player.KeyPressed(e);
			checkCollision();
			repaint(player.x,player.y,player.width,player.height);
		}
	}
}
