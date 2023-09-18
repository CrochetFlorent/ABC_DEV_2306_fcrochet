import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JFrame;


public class MyFrame extends JFrame{

	private Image image;
	private Graphics graphics;
	private Snake snake;
	private Box eat;
	
	boolean win;
	
	/**
	 * Constructeur sans paramètres
	 */
	public MyFrame()
	{
		snake = new Snake(new Box(300,300,20,20,Color.green),new ArrayList());
		Random rand = new Random();
		snake.head = new Box(100,300,20,20,Color.green);
		eat = new Box(rand.nextInt(460-30),rand.nextInt(460-30),20,20,Color.red);
		while (snake.head.intersects(eat))
		{
		eat = new Box(rand.nextInt(460-30),rand.nextInt(460-30),20,20,Color.red);
		}
		win = false;

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

		snake.head.draw(g);
		eat.draw(g);
		
		g.setFont(new Font("Mv Boli",Font.PLAIN,35));

	}	
	public void checkCollision()
	{
		for (int i =0;i <=snake.snake.size();i++)
		if(snake.head.intersects(snake.snake.get(i)))
		{
			win = true;
			repaint();
		}

	class AL extends KeyAdapter 
	{
		@Override
		public void keyPressed(KeyEvent e)
		{
			snake.head.KeyPressed(e);
			snake.bouger();
			snake.manger(eat);
			checkCollision();
			
		}
	}
}
}
