package MonJeu;

public class leftHand {
	
	private int armor;
	private int damage;
	private int dodge;
	private String name;
	private final String genre;
	
	//Constructeur sans parametres
	public leftHand()
	{
		this.damage = 0;
		this.armor = 0;
		this.genre = "";
	}
	//Constructeur avec parametres
	public leftHand(int _attack,int _defense,String _genre)
	{
		this.damage = _attack;
		this.armor = _defense;
		this.genre = _genre;
	}
	//Getter degats
	public int getDamage()
	{
		return this.damage;
	}
	//Getter armure
	public int getArmor()
	{
		return this.armor;
	}
	//Getter nom
	public String getName()
	{
		return name;
	}
	//Getter genre
	public String getGenre()
	{
		return this.genre;
	}
	//Getter esquive
	public int getDodge()
	{
		return this.dodge;
	}
	// Afficheur des valeurs de parametres choisis de l'objet en une chaine de caractères
	public String toString()
	{
		return this.getClass().getSimpleName()+" Armure = "+this.getArmor()+" Attaque = "+this.getDamage();
	}
}
