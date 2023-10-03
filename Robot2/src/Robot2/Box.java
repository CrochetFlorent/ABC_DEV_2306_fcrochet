package Robot2;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;


public class Box extends Rectangle{

	int move;
	Color color;
	
	public Box(double x,double y,int width, int height, Color color,int move)
	{
		this.x = (int) x;
		this.y = (int) y;
		this.width = width;
		this.height = height;
		this.color = color;
		this.move = 0;
		
	}
	public void draw(Graphics g)
	{
		g.setColor(this.color);
		g.fillRect(this.x, this.y, this.width, this.height);
	}
}
