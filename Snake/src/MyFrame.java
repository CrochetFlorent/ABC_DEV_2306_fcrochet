import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JFrame;

public class MyFrame extends JFrame{
	
	private Image image;
	private Graphics graphics;
	private Box snake;
	private Box eat;
	boolean touch;
	/**
	 * Constructeur sans paramètres
	 */
	public MyFrame(){
		Random rand = new Random();
		snake = new Box(100,300,20,20,Color.green);
		eat = new Box(rand.nextInt(460-30),rand.nextInt(460-30),20,20,Color.red);
		while (snake.intersects(eat)){
		eat = new Box(rand.nextInt(460-30),rand.nextInt(460-30),20,20,Color.red);
		}
		touch = false;

		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setSize(500, 500);
		this.setVisible(true);
		this.setBackground(Color.cyan);
		this.addKeyListener(new AL());	
	}
	public void paint(Graphics g){
		image = createImage(this.getWidth(),this.getHeight());
		graphics = image.getGraphics();
		g.drawImage(image,0,0,this);

		snake.draw(g);
		eat.draw(g);
		
		if(touch)	{
			g.setColor(Color.red);
			g.setFont(new Font("Mv Boli",Font.PLAIN,35));
			g.drawString("C'est Perdu",130,100);
		}	
		g.setFont(new Font("Mv Boli",Font.PLAIN,35));
	}	
	public void checkCollision(){
		for (int i =0;i <=snake.snake.size();i++)
		if(snake.intersects(snake.snake.get(i))){
			touch = true;
			repaint();
		}
	public class AL extends KeyAdapter {
		public void KeyPressed(KeyEvent e){
			snake.KeyPressed(e);
			snake.bouger();
			snake.manger(eat);
			checkCollision();
		}
	}
}
}
