package Robot2;

import java.awt.Graphics;
import java.awt.event.KeyEvent;

public class Robot {

	private Point pos;
	private int angle;
	private int vitesse = 1;
	private boolean estOn;
	private Box box;
	
	public Robot(Point _pos,int _angle,int _vitesse,boolean _estOn,Box _box)
	{
		this.pos = _pos;
		this.angle = _angle;
		this.vitesse = _vitesse;
		this.estOn = _estOn;
		this.box = _box;
	}
	//Getters
	public int getPosX()
	{
		return this.pos.getX();
	}
	public int getPosY()
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
	public Box getBox()
	{
		return this.box;
	}
	//Setters
	public void setOn()
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
	public void setBox(Box _box)
	{
		this.box =_box;
	}
	public void setPos(int _x,int _y)
	{
		this.pos.setX(_x);
		this.pos.setY(_y);
	}
	/**Méthode pour se déplacer
	 * 
	 * @param _angle
	 * @return
	 */
	public boolean marcher(int _sens)
	{
		double posX = this.pos.getX();
		double posY = this.pos.getY();
		double moveCos = Math.cos(this.angle*Math.PI/180);
		double moveSin = Math.sin(this.angle*Math.PI/180);
		double moveXplus =this.pos.setX((int) (Math.round(posX + this.vitesse*moveCos)));
		double moveXmoins= this.pos.setX((int) (Math.round(posX - this.vitesse*moveCos)));
		double moveYplus =this.pos.setY((int) (Math.round(posY + this.vitesse*moveCos)));
		double moveYmoins= this.pos.setY((int) (Math.round(posY - this.vitesse*moveCos)));
		if(this.estOn)
		{
			if (_sens>0)
			{
				if(moveXplus>0)
//				this.pos.setX((int) (Math.round(posX + this.vitesse*moveCos*100.00)/100.00));
//				this.pos.setY((int) (Math.round(posY + this.vitesse*moveSin*100.00)/100.00));
				this.pos.setX((int) moveXplus);
				this.pos.setY((int) moveYplus);
				return true;
			}
			else if (_sens<0)
			{
//				this.pos.setX((int) (posX- Math.round(this.vitesse*moveCos*100.00)/100.00));
//				this.pos.setY((int) (posX- Math.round(this.vitesse*moveSin*100.00)/100.00));
				this.pos.setX((int) moveXmoins);
				this.pos.setY((int) moveYmoins);
				return true;
			}
			else if(_sens==0)
			{
				this.pos.setX(200);
				this.pos.setY(200);
			}
		}
		else
		{
			return false;
		}
		return true;
	}
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		
	}
	

		
}
