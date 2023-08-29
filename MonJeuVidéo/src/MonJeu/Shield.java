package MonJeu;

public class Shield extends leftHand{

	private int defense;
	private int number;
	private final int damage = 0;
	private final String constShield = "Shield";
	
	public Shield()
	{
		defense =0;
	}
	public Shield(int _defense)
	{
		defense = _defense;
	}
	
	public int getDefense()
	{
		return defense;
	}
	public int getNumber()
	{
		return this.number;
	}
	public void setNumber(int _number)
	{
		this.number = _number;
	}
	public String getGenre()
	{
		return this.constShield;
	}

}
