package MonJeu;

public class leftHand {
	
	private int defense;
	private int damage;
	private String name;
	private final String genre;
	
	public leftHand()
	{
		this.damage = 0;
		this.defense = 0;
		this.genre = "";
	}
	public leftHand(int _attack,int _defense,String _genre)
	{
		this.damage = _attack;
		this.defense = _defense;
		this.genre = _genre;
	}
	public int getDamage()
	{
		return this.damage;
	}
	public int getDefense()
	{
		return this.defense;
	}
	public String getName()
	{
		return name;
	}
	public String getGenre()
	{
		return this.genre;
	}
	public String toString()
	{
		return this.getClass().getSimpleName()+" Defense = "+this.getDefense()+" Attaque = "+this.getDamage();
	}
}
