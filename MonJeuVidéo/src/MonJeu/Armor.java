package MonJeu;

public class Armor {

	int armor;
	String type;
	String nom;
	
	public Armor(int _armor,String _nom,String _type)
	{
		armor = _armor;
		nom = _nom;
		type = _type;
	}
	public String toString()
	{
		return this.getClass().getSimpleName()+" Nom: "+this.nom+" Armure"+this.armor+" Type: "+this.type;
	}
	public int getArmor()
	{
		return armor;
	}
}
