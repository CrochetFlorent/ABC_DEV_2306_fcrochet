package MonJeu;

public class Shield extends leftHand{

	private int armor;
	private final int damage = 0;
	private final String constShield = "Shield";
	private final int number;
	private int dodge;
	
	//Constructeur sans parametre
	public Shield()
	{
		armor = 0;
		dodge = 0;
		number = 0;
	}
	//Constructeur avec parametres
	public Shield(int _armor,int _dodge,int _number)
	{
		armor = _armor;
		dodge = _dodge;
		number = _number;
	}
	//Getter armure
	public int getArmor()
	{
		return armor;
	}
	//Getter genre
	public String getGenre()
	{
		return this.constShield;
	}
	//Getter esquive
	public int getDodge()
	{
		return dodge;
	}

}
