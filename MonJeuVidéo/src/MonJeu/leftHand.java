package MonJeu;

public class leftHand {
	
	private int armor;
	private int damage;
	private int dodge;
	private String name;
	private final String genre;
	
	public leftHand()
	{
		this.damage = 0;
		this.armor = 0;
		this.genre = "";
	}
	public leftHand(int _attack,int _defense,String _genre)
	{
		this.damage = _attack;
		this.armor = _defense;
		this.genre = _genre;
	}
	public int getDamage()
	{
		return this.damage;
	}
	public int getArmor()
	{
		return this.armor;
	}
	public String getName()
	{
		return name;
	}
	public String getGenre()
	{
		return this.genre;
	}
	public int getDodge()
	{
		return this.dodge;
	}
	public String toString()
	{
		return this.getClass().getSimpleName()+" Armure = "+this.getArmor()+" Attaque = "+this.getDamage();
	}
}
