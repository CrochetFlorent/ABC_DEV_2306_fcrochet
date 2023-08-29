package MonJeu;

public class Weapon extends leftHand{

	private String name;
	private int damage;
	private int number;
	private final int defense =0;
	private final String constWeapon = "Weapon";
	
	public Weapon()
	{
		name = "";
		damage = 0;
		number = 0;
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
	public int getNumber()
	{
		return number;
	}
	public void setNumber(int _number)
	{
		this.number = _number;
	}
	public String getGenre()
	{
		return this.constWeapon;
	}
}
