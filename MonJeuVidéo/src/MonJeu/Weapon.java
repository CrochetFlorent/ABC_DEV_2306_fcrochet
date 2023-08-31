package MonJeu;

public class Weapon extends leftHand{

	private String name;
	private int damage;
	private final int number;
	private final int defense =0;
	private final String constWeapon = "Weapon";
	
	//Constructeur sans parametres
	public Weapon()
	{
		name = "";
		damage = 0;
		number = 0;
	}
	//Constructeur avec parametres
	public Weapon(String _name,int _damage,int _number)
	{
		this.number = _number;
		this.name = _name;
		this.damage = _damage;
	}
	//Getter degats
	public int getDamage()
	{
		return this.damage;
	}
	//Getter nom
	public String getName()
	{
		return this.name;
	}
	//Getter numéro de l'arme
	public int getNumber()
	{
		return this.number;
	}
	// Getter du genre de la main gauche
	public String getGenre()
	{
		return this.constWeapon;
	}
}
