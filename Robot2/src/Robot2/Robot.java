package Robot2;

public class Robot {

	private Point pos;
	private int angle;
	private int vitesse = 1;
	private boolean estOn;
	
	public Robot(Point _pos,int _angle,int _vitesse,boolean _estOn)
	{
		this.pos = _pos;
		this.angle = _angle;
		this.vitesse = _vitesse;
		this.estOn = _estOn;
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
		if (vitesse<0)
		{
			this.vitesse = 0 ;
		}
	}
	/**Méthode pour se déplacer
	 * 
	 * @param _angle
	 * @return
	 */
	public boolean marcherAvant(int _angle)
	{
		double posX = Math.round(this.pos.getX()*100.00)/100.00;
		double posY = Math.round(this.pos.getY()*100.00)/100.00;
		double angleCos = Math.round(Math.cos(this.angle*Math.PI/180)*100.00)/100.00;
		double angleSin = Math.round(Math.sin(this.angle*Math.PI/180)*100.00)/100.00;
		if(this.estOn)
		{
			this.pos.setX(posX + Math.round(this.vitesse*angleCos*100.00)/100.00);
			this.pos.setY(posY + Math.round(this.vitesse*angleSin*100.00)/100.00);
			return true;
		}
		else
		{
			return false;
		}
	}	
	public boolean marcherArriere(int _angle)
	{
		double posX = Math.round(this.pos.getX()*100.00)/100.00;
		double posY = Math.round(this.pos.getY()*100.00)/100.00;
		double moveCos = Math.round(Math.cos((this.angle+Math.PI)*Math.PI/180)*100.00)/100.00;
		double moveSin = Math.round(Math.sin((this.angle+Math.PI)*Math.PI/180)*100.00)/100.00;
		if(this.estOn)
		{
			this.pos.setX(posX+ moveCos);
			this.pos.setY(posY+ moveSin);
			return true;
		}
		else
		{
			return false;
		}
	}	
}
