package Robot2;

public class Point {

	private int x;
	private int y;
	
	public Point(int _x,int _y)
	{
		x=_x;
		y=_y;
	}
	
	public int getX()
	{
		return this.x;
	}
	public int getY()
	{
		return this.y;
	}
	
	public int setX(int _x)
	{
		return this.x = _x;
	}
	public int setY(int _y)
	{
		return this.y = _y;
	}
}
