package MonJeu;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;

public class Barbarian {

	private String name;
	private int health;
	private Weapon rightHand;
	private leftHand leftHand;
	private int defense;
	
	public Barbarian()
	{
		name ="";
		health = 100;
		leftHand = null;
		rightHand = null;

	}
	
	public Barbarian(String _name,int _health,Weapon _leftHand,Weapon _rightHand)
	{
		name = _name;
		health = _health;
		leftHand = _leftHand;
		rightHand = _rightHand;

	}
	public String toString()
	{
		return this.getClass().getSimpleName()+" Nom: "+this.name+" Vie: "+this.getHealth()+" Main gauche: "+leftHand+" Main droite: "+rightHand;
	}
	public leftHand getLeftHand()
	{
		return leftHand;
	}
	
	public Weapon getRightHand()
	{
		return rightHand;
	}
	
	public String getName()
	{
		return name;
	}
	public void setHealth(int _health)
	{
		this.health = _health;
	}
	public int getHealth()
	{
		return health;
	}
		
	public int getDefense()
	{
		return this.health+this.leftHand.getDefense();
	}
	
	public int getDamage()
	{
		int damage;
		if (this.leftHand == this.rightHand)
		{
			damage = this.leftHand.getDamage() + this.rightHand.getDamage() + 2 ;
		}
		else 
		{
			damage = this.leftHand.getDamage() + this.rightHand.getDamage();
		}
		return damage;
	}
	
	public void fight(Barbarian _ennemi)
	{	
		boolean win = false;
		
		do {
			
			this.health = this.health - _ennemi.getDamage();
			_ennemi.setHealth( _ennemi.getHealth() - this.getDamage());
			
			if (this.health <= 0)
			{
				System.out.println(_ennemi.name+" gagne.");
				win = true;
			}
			else if(_ennemi.getHealth() <=0)
			{
				System.out.println(this.name+" gagne.");
				win = true;
			}
			else if(this.getHealth() == _ennemi.getHealth())
			{
				System.out.println("Egalite.");
				win = true;
			}
		}while (win == false);
		this.health = 100;
		_ennemi.setHealth(100);
	}
	
	public void ramasseArme()
	{	
		Random rd = new Random();
		int rdChoix;
		
		List<Weapon> armesList = new ArrayList<>();
		List<Shield> shieldList = new ArrayList<>();
		
		for (int i=0;i<20;i++)
		{
		armesList.add(new Weapon("arme"+i,rd.nextInt(10)+1));
		}
		
		for (int i=0;i<20+1;i++)
		{
		shieldList.add(new Shield(rd.nextInt(25)+1));
		}
		
		rdChoix = rd.nextInt(2)+1;
		
		if (rdChoix == 1)
		{
			this.leftHand = armesList.get(rd.nextInt(20));
		}else
		{
			this.leftHand = shieldList.get(rd.nextInt(20));

		}
		this.rightHand = armesList.get(rd.nextInt(20));
	}
}
