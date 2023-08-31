package MonJeu;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Barbarian extends PJ{

	private String name;
	private int health;
	private double dodge;
	private int damageReduce;
	private Weapon rightHand;
	private leftHand leftHand;
	private Armor armor;
	private int experience;
	private int level = 1;
	private boolean agressive;

	// Constructeur sans parametres
	public Barbarian()
	{
		name ="";
		health = 100;
		leftHand = null;
		rightHand = null;
		dodge = 5;
		armor = null;
		damageReduce = 0;
		experience = 0;
		level = 1;
		agressive = false;

	}
	//Constructeur avec parametres
	public Barbarian(String _name,int _health,leftHand _leftHand,Weapon _rightHand,int _dodge,Armor _armor,int _damageReduce,int _experience,int _level,boolean _agressive)
	{
		name = _name;
		health = _health;
		leftHand = _leftHand;
		rightHand = _rightHand;
		dodge = _dodge;
		armor = _armor;
		damageReduce = _damageReduce;
		experience = _experience;
		level = _level;
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
	//Getter nom
	public String getName()
	{
		return name;
	}
	//Setter points de vie
	public void setHealth(int _health)
	{
		this.health = _health;
	}
	//Getter points de vie
	public int getHealth()
	{
		return health;
	}
	//Getter esquive
	public double getDodge()
	{
		return this.dodge+this.leftHand.getDodge();
	}
	//Getter Experience
	public int getExperience()
	{
		return experience;
	}
	//Gain d'experience
	public void setExperience(int _experience)
	{
		this.experience =_experience;
	}
	//Getter niveau
	public int getLevel()
	{
		return this.level;
	}
	
	// Gain de niveau
	public void setLevel()
	{
		int[] tabLevel = new int[5];
		tabLevel[0] = 200;
		
		for (int i =0;i<=4;i++)
		{
			if(i>=1)
			{
				tabLevel[i] = (int) (tabLevel[i-1] *2);
			}
		}
		
		for (int j=0;j<4;j++)
		{
			if( this.experience >= tabLevel[j] )
			{
				level= level +1;
				this.setHealth(this.health+20);
				System.out.print("\nGain de niveau de: "+this.name+"\n");
			}
		}
		
	}
	
	//Calcul les dégats que fait le barbare en fonctions de ses armes 
	public int getDamage()
	{
		int damage;
		if (this.leftHand == this.rightHand)
		{
			damage = this.leftHand.getDamage() + this.rightHand.getDamage() + 2 ;
		}
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
	
	//Fonction de combat avec des armes générées aléatoirement et données aux barabres qui combattent par le biais de ramasseArme et ramsseArmure
	public void fight(Barbarian _ennemi)
	{	
		int tempHealth1 = this.health; // Vie de l'attaquant
		int tempHealth2 = _ennemi.getHealth(); // Vie de l'attaqué
		int tempCombat1 = 0,tempCombat2 = 0; // Nombres de coups donnés
		int tempEsquive1 = 0, tempEsquive2 =0; // Nombre d'esquives faites
		
		System.out.println("\n Debut du combat entre : "+this.name+" et "+_ennemi.getName()+" avec des armes/bouclier et armures trouves au hasard.");
		System.out.println("  ________________________________________________________________________________________");
		
		boolean fin = false; // Booleen de fin du combat
		
		Random rd = new Random();
				
		do {
			//Test si le premier barbare esquive
			if (rd.nextInt(100)+1 > _ennemi.getDodge())
			{
				//Test si le barabre a trop d'armure avec sa reduction de dégats
				if (_ennemi.getDamageReduce() <= this.getDamage())
				{
					tempHealth2 = tempHealth2- this.getDamage() + _ennemi.getDamageReduce();	
					tempCombat2 += 1;
				}
			}
			
			//Si il esquive
			else
			{
				tempEsquive2 +=1;
			}
			
			//Test si le second barbare esquive
			if (rd.nextInt(100)+1 > this.getDodge())
			{
				if(this.getDamageReduce() <= _ennemi.getDamage())
				{
					tempHealth1 = tempHealth1 - _ennemi.getDamage() + this.getDamageReduce();
					tempCombat1 += 1;
				}
			}
			
			//Si il esquive
			else 
			{
				tempEsquive1 +=1;
			}
			
			//Test si l'attaquant barabre a perdu
			if (tempHealth1 <= 0 && tempHealth2 >0)
			{
				System.out.print("\n"+_ennemi.name+" gagne.\n");
				
				//Gain d'experience/niveau
				_ennemi.setExperience(_ennemi.getExperience()+50);
				_ennemi.setLevel();
				System.out.println("Niveau de "+_ennemi.getName()+": "+_ennemi.getLevel());
				System.out.println("Niveau de "+this.name+": "+this.level);
				
				fin = true;
			}
			//Test si l'attaqué a perdu
			else if(tempHealth2 <=0 && tempHealth1 >0)
			{
				System.out.print("\n"+this.name+" gagne.\n");
				//Gain d'experience/niveau
				this.setExperience(this.experience+50);
				this.setLevel();
				System.out.println("Niveau de "+_ennemi.getName()+": "+_ennemi.getLevel());
				System.out.println("Niveau de "+this.getName()+": "+this.level);
				
				fin = true;
			}
			// Test si les deux ont perdu
			else if(tempHealth1 <=0 && tempHealth2 <=0)
			{
				System.out.print("\nEgalite.\n");
				
				//Gain d'experience/niveau
				_ennemi.setExperience(_ennemi.getExperience()+50);
				_ennemi.setLevel();
				this.setExperience(this.experience+50);
				this.setLevel();
				System.out.println("Niveau de "+_ennemi.getName()+": "+_ennemi.getLevel());
				System.out.println("Niveau de "+this.name+": "+this.level);
				
				fin = true;
			}
			
		}while (fin == false);
		
		//Resultats
		if (_ennemi.getDamageReduce() >= this.getDamage())
		{
			System.out.print("\n"+_ennemi.getName()+" a trop d'armure");
		}
		else if (_ennemi.getDamageReduce() >= this.getDamage())
		{
			System.out.print("\n"+this.getName()+" a trop d'armure");
		}
		else if (this.getDamageReduce() >= _ennemi.getDamage() && _ennemi.getDamageReduce() >= this.getDamage())
		{ 
			System.out.println("\nLes deux ont trop d'armure par rapport aux dégats de leurs armes.");
		}

		System.out.print("\n"+this.getName()+" a infligé a: "+_ennemi.name+" ==> "+(this.getDamage()-_ennemi.getDamageReduce())*tempCombat2+" degats en "+tempCombat2+" coups avec "+_ennemi.getDamageReduce()+" reduits par l'armure avec: ");
		System.out.print(_ennemi.getArmor()+" d'armure,avec "+tempEsquive2+" esquives et PV restants : "+tempHealth2);
		System.out.print("\n"+_ennemi.getName()+" attaque : "+this.name+" ==> "+(_ennemi.getDamage()-this.getDamageReduce())*tempCombat1+" degats en "+tempCombat1+" coups avec "+this.getDamageReduce()+" reduits par l'armure avec: ");
		System.out.print(this.armor.getArmor()+" d'armure,avec "+tempEsquive1+" esquives et PV restants : "+tempHealth1+"\n");
		
	}
	
	//Fonction qui génère aléatoirement 20 armes et 20 boucliers parmis lesquels le barabre va choisir et s'équiper, un bouclier et une arme ou deux armes
	public void ramasseArme()
	{	
		Random rd = new Random();
		int rdChoix;
		
		List<Weapon> armesList = new ArrayList<>();
		List<Shield> shieldList = new ArrayList<>();
		
		for (int i=0;i<20;i++)
		{
		armesList.add(new Weapon("arme"+i,rd.nextInt(20)+1, i+1));
		}
		
		for (int i=0;i<20+1;i++)
		{
		shieldList.add(new Shield(rd.nextInt(25)+1,rd.nextInt(5)+1,i+1));
		}
		
		rdChoix = rd.nextInt(2)+1;
		
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
		
		for (int i=0;i<20;i++)
		{
		armorList.add(new Armor(rd.nextInt(20)+20,"armure"+i,"Heavy"));
		}
		
		this.armor = armorList.get(rd.nextInt(20));
	}
}
