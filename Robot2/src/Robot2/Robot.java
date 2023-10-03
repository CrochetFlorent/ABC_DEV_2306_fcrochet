package Robot2;

import java.awt.event.KeyEvent;

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
		if(this.getOn())
		{
			this.angle = _angle;
		}
	}
	public void setVitesse(int _vitesse)
	{
		if(this.getOn())
		{
			this.vitesse = _vitesse;
			if (vitesse<0)
			{
				this.vitesse = 0 ;
			}
		}
	}

	/**Méthode pour se déplacer
	 * 
	 * @param _angle
	 * @return
	 */
	public boolean marcher(int _sens,Deplacement _move)
	{
		double posX = this.pos.getX();
		double posY = this.pos.getY();
		double moveCos = Math.cos(this.angle*Math.PI/180);
		double moveSin = Math.sin(this.angle*Math.PI/180);
		if(this.estOn)
		{
			if (_sens>0)
			{
				this.pos.setX((int) (Math.round(posX + this.vitesse*moveCos)));
				this.pos.setY((int) (Math.round(posY + this.vitesse*moveSin)));
				_move.robot.x =  this.pos.setX( (int) (Math.round(posX + this.vitesse*moveCos)));
				_move.robot.y =  this.pos.setY( (int) (Math.round(posX + this.vitesse*moveSin)));
				_move.repaint();
				return true;
			}
			else if (_sens<0)
			{
				this.pos.setX((int) (posX- Math.round(this.vitesse*moveCos)));
				this.pos.setY((int) (posX- Math.round(this.vitesse*moveSin)));
				_move.robot.x = this.pos.setX((int) (Math.round(posX - this.vitesse*moveCos)));
				_move.robot.y = this.pos.setX((int) (Math.round(posX - this.vitesse*moveSin)));
				_move.repaint();
				return true;
			}
		}
		else
		{
			return false;
		}
		return true;
	}	
		
}
