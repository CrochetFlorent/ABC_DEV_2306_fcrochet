package Robot2;

public class Point {

	private double x,y;
	
	public Point(double _x,double _y)
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
	
	public void setX(double _x)
	{
		this.x = _x;
	}
	public void setY(double _y)
	{
		this.y = _y;
	}
}
