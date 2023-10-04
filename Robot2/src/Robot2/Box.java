package Robot2;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;


public class Box extends Rectangle{

	int move;
	Color color;
	
	public Box(int x,int y,int width, int height, Color color,int move)
	{
		this.x =  x;
		this.y =  y;
		this.width = width;
		this.height = height;
		this.color = color;
		this.move = 0;
		
	}
	public void setX(int _x)
	{
		this.x = _x;
	}
	public void setY(int _y)
	{
		this.y = _y;
	}
	public double getX()
	{
		return this.x;
	}
	public double getY()
	{
		return this.y;
	}
	public void draw(Graphics g)
	{
		g.setColor(this.color);
		g.fillRect(this.x, this.y, this.width, this.height);
	}	
	
	public void KeyPressed(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_UP)
		{
			if (this.y -10 >= 30)
			{
			this.y = y - 10;
			this.move += 1;
			}
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN)
		{
			if (this.y + 10 <= 460)
			{
			this.y = y + 10;
			this.move += 1;
			}
		}
		if (e.getKeyCode() == KeyEvent.VK_LEFT)
		{
			if (this.x -10 >= 0)
			{
			this.x = x - 10;
			this.move += 1;
			}
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			if (this.x + 10 <= 460)
			{
			this.x = x + 10;
			this.move += 1;
			}
		}
	}
}
