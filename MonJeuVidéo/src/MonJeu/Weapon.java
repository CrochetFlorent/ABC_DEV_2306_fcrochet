package MonJeu;

public class Weapon {

	private String name;
	private int damage;
	
	public Weapon()
	{
		name = "";
		damage = 0;
	}
	
	public Weapon(String _name,int _damage)
	{
		name = _name;
		damage = _damage;
	}
	
	public int getDamage()
	{
		return damage;
	}
	public String getName()
	{
		return name;
	}
}
