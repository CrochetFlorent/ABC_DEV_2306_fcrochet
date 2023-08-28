package MonJeu;

public class Barbarian {

	private String name;
	private int health;
	private Weapon leftHand,rightHand;
	private Shield shield;
	private int defense;
	
	public Barbarian()
	{
		name ="";
		health = 100;
		leftHand = null;
		rightHand = null;
		defense = 0;
	}
	
	public Barbarian(String _name,int _health,Weapon _leftHand,Weapon _rightHand,Shield _shield,int _defense)
	{
		name = _name;
		health = _health;
		leftHand = _leftHand;
		rightHand = _rightHand;
		shield = _shield;
		defense = _defense;
	}
	
	public Weapon getLeftHand()
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
	
	public int getHealth()
	{
		return health;
	}
	
	public Shield getShield()
	{
		return shield;
	}
	
	public int getDefense()
	{
		return this.health+this.shield.getDefense();
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
	public int attack()
	{
		int attDamage;
		attDamage = this.getDamage();
		return attDamage ;
	}
	
	public void fight(Barbarian _ennemi)
	{	
		int _getHealth = _ennemi.getHealth();
		
		do {
			_getHealth = _ennemi.getHealth() - this.attack();
			
			if (this.health <= 0)
			{
				System.out.println(this.name+" gagne.");
			}
			else if(_ennemi.getHealth() <=0)
			{
				System.out.println(_ennemi.name+" gagne.");
			}
			else
			{
				System.out.println("Egalite.");
			}
		}while (_ennemi.getHealth() <= 0 || this.health <= 0);
	}
}
