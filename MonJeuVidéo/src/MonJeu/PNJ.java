package MonJeu;

public class PNJ {

	private String name;
	private int health;
	private int dodge;
	private int damageReduce;
	private leftHand leftHand;
	private Weapon rightHand;
	private Armor armor;
	private boolean agressive;
	
	public PNJ()
	{
		name = "";
		health =100;
		dodge = 5;
		damageReduce = 0;
		leftHand = null;
		rightHand = null;
		armor = null;
		agressive = false;
	}
}
