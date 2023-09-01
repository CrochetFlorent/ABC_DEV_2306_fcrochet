package MonJeu;

public abstract class PJ {

	private String name;
	private int health;
	private int dodge;
	private int damageReduce;
	private leftHand leftHand;
	private Weapon rightHand;
	private Armor armor;
	private boolean agressive;
	
	public PJ()
	{
		name = "";
		health =50;
		dodge = 5;
		damageReduce = 0;
		leftHand = null;
		rightHand = null;
		armor = null;
		agressive = false;
	}
	//getter points de vie
	public int getHeatlh()
	{
		return this.health;
	}
	public abstract int fight();


}
