package Robot2;

public class Point {

	private int x,y;
	
	public Point(int _x,int _y)
	{
		x=_x;
		y=_y;
	}
	
	public double getX()
	{
		return this.x;
	}
	public double getY()
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
