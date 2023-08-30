package MonJeu;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Barbarian {

	private String name;
	private int health;
	private Weapon rightHand;
	private leftHand leftHand;
	private int dodge;
	private Armor armor;
	private int damageReduce;
	private int experience;
	private int level;

	
	public Barbarian()
	{
		name ="";
		health = 100;
		leftHand = null;
		rightHand = null;
		dodge = 0;
		armor = null;
		damageReduce = 0;
		experience = 0;

	}
	
	public Barbarian(String _name,int _health,Weapon _leftHand,Weapon _rightHand,int _dodge,Armor _armor,int _experience)
	{
		name = _name;
		health = _health;
		leftHand = _leftHand;
		rightHand = _rightHand;
		dodge = _dodge;
		armor = _armor;
		experience = _experience;

	}
	public String toString()
	{
		return this.getClass().getSimpleName()+" Nom: "+this.name+" Vie: "+this.getHealth()+" Main gauche: "+leftHand.getName()+" Main droite: "+rightHand.getName();
	}
	public leftHand getLeftHand()
	{
		return leftHand;
	}
	
	public Weapon getRightHand()
	{
		return rightHand;
	}
	
	public String getName()
	{
		return name;
	}
	public void setHealth(int _health)
	{
		this.health = _health;
	}
	public int getHealth()
	{
		return health;
	}

	public int getDodge()
	{
		return dodge;
	}
	public int getExperience()
	{
		return experience;
	}
	
	//Gain d'experience
	public void setExperience(int _experience)
	{
		this.experience =_experience;
	}
	
	public int getLevel()
	{
		return level;
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
			tabLevel[i] = (int) (tabLevel[i-1] + tabLevel[i-1]/3.3);
			}
		}
		
	}
	
	//Calcul les dégats que fait le barabre en fonctions de ses armes 
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
	
	//Calcul de l'armure du barabre
	public int getArmor()
	{
		return this.armor.getArmor() + this.leftHand.getArmor();
	}
	
	//Fonction de combat avec des armes générées aléatoirement et données aux barabres qui combattent par le biais de ramasseArme et ramsseArmure
	public void fight(Barbarian _ennemi)
	{	
		
		System.out.println("\n Debut du combat entre : "+this.name+" et "+_ennemi.getName()+" avec des armes/bouclier et armures trouves au hasard.");
		
		boolean win = false;
		Random rd = new Random();
		int rdDodgeThis,rdDodgeEnnemi;
		int armor = this.leftHand.getArmor() + this.leftHand.getArmor();
				
		this.health = 50;
		_ennemi.setHealth(50);
		
		do {
			
			rdDodgeThis= rd.nextInt(100/this.dodge)+1;
			rdDodgeEnnemi = rd.nextInt(100/_ennemi.getDodge())+1;
			
			if (rdDodgeEnnemi > _ennemi.getDodge())
			{
				if (_ennemi.getDamageReduce() <= this.getDamage())
				{
					_ennemi.setHealth(_ennemi.getHealth()- this.getDamage() + _ennemi.getDamageReduce() );
				}
				else
				{
					System.out.print("Trop d'armure");
				}
				System.out.print("\n"+this.getName()+" attaque : "+_ennemi.name+" ==> "+this.getDamage()+" degats avec "+_ennemi.getDamageReduce()+" reduits par l'armure avec: ");
				System.out.print(_ennemi.getArmor()+" d'armure, PV restants : "+_ennemi.health);

			}
			else
			{
				System.out.print("\nEsquive de "+_ennemi.getName());
			}
			
			if (rdDodgeThis > this.dodge)
			{
				if(this.getDamageReduce() <= _ennemi.getDamage())
				{
					this.setHealth (this.getHealth() - _ennemi.getDamage() + this.getDamageReduce());
				}
				else
				{
					System.out.println("Trop d'armure");
				}
				
				System.out.print("\n"+_ennemi.getName()+" attaque : "+this.name+" ==> "+_ennemi.getDamage()+" degats avec "+this.getDamageReduce()+" reduits par l'armure avec: ");
				System.out.print(this.armor.getArmor()+" d'armure, PV restants : "+this.health);
			}
			else 
			{
				System.out.print("\nEsquive de "+this.name);
			}
			
			if (this.health <= 0 && _ennemi.getHealth() >0)
			{
				System.out.print("\n"+_ennemi.name+" gagne.\n");
				
				//Gain d'experience/niveau
				_ennemi.setExperience(_ennemi.getExperience()+50);
				_ennemi.setLevel();
				System.out.println(_ennemi.level);
				
				win = true;
			}
			else if(_ennemi.getHealth() <=0 && this.health>0)
			{
				System.out.print("\n"+this.name+" gagne.\n");
				//Gain d'experience/niveau
				this.setExperience(this.experience+50);
				this.setLevel();
				System.out.println(this.level);
				
				win = true;
			}
			else if(this.getHealth()<=0 && _ennemi.getHealth()<=0)
			{
				System.out.print("\nEgalite.");
				
				//Gain d'experience/niveau
				_ennemi.setExperience(_ennemi.getExperience()+50);
				_ennemi.setLevel();
				System.out.println(_ennemi.level);
				this.setExperience(this.experience+50);
				this.setLevel();
				System.out.println(this.level);
				
				win = true;
			}
			
		}while (win == false);
		
	}
	
	//Fonction qui génère aléatoirement 20 armes et 20 boucliers parmis lesquels le barabre va choisir et s'équiper, un bouclieret une arme ou deux armes
	public void ramasseArme()
	{	
		Random rd = new Random();
		int rdChoix;
		
		List<Weapon> armesList = new ArrayList<>();
		List<Shield> shieldList = new ArrayList<>();
		
		for (int i=0;i<20;i++)
		{
		armesList.add(new Weapon("arme"+i,rd.nextInt(20)+1));
		}
		
		for (int i=0;i<20+1;i++)
		{
		shieldList.add(new Shield(rd.nextInt(25)+1,5));
		}
		
		rdChoix = rd.nextInt(2)+1;
		
		if (rdChoix == 1)
		{
			this.leftHand = armesList.get(rd.nextInt(20));
		}else
		{
			this.leftHand = shieldList.get(rd.nextInt(20));

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
