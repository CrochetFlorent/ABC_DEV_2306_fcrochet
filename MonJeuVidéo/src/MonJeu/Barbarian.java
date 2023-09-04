package MonJeu;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Barbarian extends PJ{

	//Attributs
	private String name;
	private int health;
	private double dodge;
	private Armor armor;
	private int damageReduce;
	private Weapon rightHand;
	private leftHand leftHand;
	private boolean agressive;
	private Cercle portee;
	// Constructeur sans parametres
	public Barbarian()
	{
		name ="";
		health = 50;
		leftHand = null;
		rightHand = null;
		dodge = 5;
		armor = null;
		damageReduce = 0;
		agressive = false;

	}
	//Constructeur avec parametres
	public Barbarian(String _name,int _health,leftHand _leftHand,Weapon _rightHand,int _dodge,Armor _armor,int _damageReduce,boolean _agressive,Cercle _portee)
	{
		name = _name;
		health = _health;
		leftHand = _leftHand;
		rightHand = _rightHand;
		dodge = _dodge;
		armor = _armor;
		damageReduce = _damageReduce;
		agressive = _agressive;

	}
	// Afficheur des valeurs de parametres choisis de l'objet en une chaine de caractères
	public String toString()
	{
		return this.getClass().getSimpleName()+" Nom: "+this.name+" Vie: "+this.getHealth()+" Main gauche: "+leftHand.getName()+" Main droite: "+rightHand.getName();
	}
	//Getter main gauche
	public leftHand getLeftHand()
	{
		return leftHand;
	}
	//Getter main droite
	public Weapon getRightHand()
	{
		return rightHand;
	}

	//Calcul les dégats que fait le barbare en fonctions de ses armes 
	public int getDamage()
	{
		int damage;
		//Si main droite = main gauche
		if (this.leftHand.getGenre() == this.rightHand.getGenre())
		{
			damage = this.leftHand.getDamage() + this.rightHand.getDamage() + 2 ;
		}
		//Sinon 
		else 
		{
			damage = this.leftHand.getDamage() + this.rightHand.getDamage();
		}
		return damage;
	}	
	//Calcul de reduction des degats avec l'armure du barbare
	public int getDamageReduce()
	{
		return (this.armor.armor + this.leftHand.getArmor())/5;
	}	
	//setter reduction de dégats
	public void setDamageReduce(int _damageReduce)
	{
		this.damageReduce = _damageReduce;
	}
	//Calcul de l'armure du barabre
	public int getArmor()
	{
		return this.armor.getArmor() + this.leftHand.getArmor();
	}
	
	//Fonction qui génère aléatoirement 20 armes et 20 boucliers parmis lesquels le barabre va choisir et s'équiper, un bouclier et une arme ou deux armes
	public void ramasseArme()
	{	
		Random rd = new Random();
		int rdChoix;
		
		List<Weapon> armesList = new ArrayList<>();
		List<Shield> shieldList = new ArrayList<>();
		
		//Creation de 20 armes aléatoires
		for (int i=0;i<20;i++)
		{
		armesList.add(new Weapon("arme"+i,rd.nextInt(20)+1, i+1));
		}
		//Creation de 20 boucliers aléatoires
		for (int i=0;i<20+1;i++)
		{
		shieldList.add(new Shield(rd.nextInt(25)+1,rd.nextInt(5)+1,i+1));
		}
		
		rdChoix = rd.nextInt(2)+1;
		//Attribution soit d'un bouclier soit du armes ddes listes précédentes pour la main gauche
		if (rdChoix == 1)
		{
			this.leftHand = armesList.get(rd.nextInt(20));
		}else
		{
			this.leftHand = shieldList.get((rd.nextInt(20)));

		}
		this.rightHand = armesList.get(rd.nextInt(20));
	}
	
	// Génère 20 armures parmis lesquelles le barbare va pouvoir s'équiper
	public void ramasseArmure()
	{
		Random rd = new Random();
		
		List<Armor> armorList = new ArrayList<>();
		//Création de 20 armures aux valeurs aléatoires
		for (int i=0;i<20;i++)
		{
		armorList.add(new Armor(rd.nextInt(20)+20,"armure"+i,"Heavy"));
		}
		//Attribution d'une armure aléatoirement
		this.armor = armorList.get(rd.nextInt(20));
	}
	
	@Override
	public int fight() {
		// TODO Auto-generated method stub
		return 0;
	}
}
