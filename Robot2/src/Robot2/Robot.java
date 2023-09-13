package Robot2;

public class Robot {

	private Point pos;
	private int angle;
	private int vitesse = 1;
	private boolean estOn;
	
	public Robot(Point _pos,int _angle)
	{
		pos = _pos;
		angle = _angle;
	}
	//Getters
	public double getPosX()
	{
		return this.pos.getX();
	}
	public double getPosY()
	{
		return this.pos.getY();
	}
	public int getAngle()
	{
		return this.angle;
	}
	public int getVitesse()
	{
		return this.vitesse;
	}
	public boolean getOn()
	{
		return this.estOn;
	}
	//Setters
	public void  setOn()
	{
		this.estOn = true;
	}
	public void setOff()
	{
		this.estOn = false;
	}
	public void setAngle(int _angle)
	{
		this.angle = _angle;
	}
	public void setVitesse(int _vitesse)
	{
		this.vitesse = _vitesse;
	}
	/**Méthode pour se déplacer
	 * 
	 * @param _angle
	 * @return
	 */
	public boolean marcher(int _angle)
	{
		if(this.estOn)
		{
			this.pos.setX(Math.round(this.pos.getX()*100.00)/100.00 + this.vitesse*Math.round(Math.cos(this.angle*Math.PI/180)*100.00)/100.00);
			this.pos.setY(Math.round(this.pos.getY()*100.00)/100.00 + this.vitesse*Math.round(Math.sin(this.angle*Math.PI/180)*100.00)/100.00);
			return true;
		}
		else
		{
			return false;
		}
	}	
}
