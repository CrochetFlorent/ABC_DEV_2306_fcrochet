import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class Box extends Rectangle{

	int x,y;
	int width, height;
	Color color;
	ArrayList<Box> snake = new ArrayList();
	
	/**
	 * Constructeur avec paramètres
	 * @param _x
	 * @param _y
	 * @param _width
	 * @param _height
	 */
	public Box(int _x,int _y,int _width,int _height,Color _color)
	{
		this.x = _x;
		this.y = _y;
		this.width = _width;
		this.height = _height;
		this.color = _color;
	}
 
	/**
	 * Mouvement à l'appuie sur une flèche du clavier
	 * @param e
	 */
	public void KeyPressed(KeyEvent e)
	{
		if(e.getKeyCode() == KeyEvent.VK_UP)
		{
			this.y = y+20;
		}else if (e.getKeyCode() == KeyEvent.VK_DOWN)
		{
			this.y = y-20;
		}else if (e.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			this.x = x+20;
		}
		else if (e.getKeyCode() == KeyEvent.VK_LEFT)
		{
			this.x = x-20;
		}
	}
	/** Affichage du rectangle
	 * 
	 * @param g
	 */
	public void draw(Graphics g)
	{
		g.setColor(this.color);
		g.fillRect(this.x, this.y, this.width, this.height);
	}
	/**
	 * Bouger
	 */
	public void bouger()
	{
		
		for (int i=0;i <= this.snake.size();i++)
		{
			if(i>0)
			{
			this.snake.get(i-1).x = this.snake.get(i).x;
			this.snake.get(i-1).y = this.snake.get(i).y;
			}
		}
	}
	/** Manger
	 * 
	 * @param _box
	 * @return
	 */
	public int manger(Box _box)
	{
		if (this.intersects(_box))
		{
			this.add(_box);
		}
		return width;
	}
}
