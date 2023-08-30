package MonJeu;

public class Shield extends leftHand{

	private int armor;
	private final int damage = 0;
	private final String constShield = "Shield";
	private int dodge;
	
	public Shield()
	{
		armor = 0;
		dodge = 0;
	}
	public Shield(int _armor,int _dodge)
	{
		armor = _armor;
		dodge = _dodge;
	}
	
	public int getArmor()
	{
		return armor;
	}
	
	public String getGenre()
	{
		return this.constShield;
	}
	public int getDodge()
	{
		return dodge;
	}

}
