package MonJeu;

import java.util.Random;

public abstract class PJ {

	private String name;
	private int health;
	private int dodge;
	private int damageReduce;
	private leftHand leftHand;
	private Weapon rightHand;
	private Armor armor;
	private boolean agressive;
	private Cercle portee;
	private int experience;
	private int level;
	
	//constructeur sans parametres
	public PJ()
	{
		name = "";
		health =50;
		dodge = 5;
		damageReduce = 0;
		leftHand = new Shield(2,3,1);
		rightHand = null;
		armor = new Armor(5,"Heavy","Armure1");
		agressive = false;
		portee = new Cercle(2,new Point(5,5));
		experience = 200;
		level = 1;
	}
	//constructeur sans parametres
		public PJ(String _name,int _health,int _dodge,int _damageReduce,leftHand _leftHand,Weapon _rightHand,int _armor,boolean _agressive,Cercle _portee,int _experience,int _level)
		{
			name = "";
			health =50;
			dodge = 5;
			damageReduce = 0;
			leftHand = null;
			rightHand = null;
			armor = null;
			agressive = false;
			portee = new Cercle(2,new Point(5,5));
			experience = 200;
			level = 1;
		}
	//getter points de vie
	public int getHeatlh()
	{
		return this.health;
	}
	//Getter portée
	public Cercle getPortee()
	{

		return this.portee;
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
		return this.health;
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
		//On creer un tableau de référence pour les niveaux. Chaque case contient l'expérience nécéssaire pour passer au suivant
		for (int i =0;i<=4;i++)
		{
			if(i>=1)
			{
				tabLevel[i] = (int) (tabLevel[i-1] *2);
			}
		}		
		//On parcours le tableau et on situe l'expérience actuelle du combattant de manière à lui attribut son nouveau niveau en cas de changement et on augemnte la vie
		//en cas de prise de niveau
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
	//Fonction de combat avec des armes générées aléatoirement et données aux barabres qui combattent par le biais de ramasseArme et ramsseArmure
		public void fight(PJ _ennemi)
		{	
			int tempHealth1 = this.health; // Vie de l'attaquant
			int tempHealth2 = _ennemi.getHeatlh(); // Vie de l'attaqué
			int tempCombat1 = 0,tempCombat2 = 0; // Nombres de coups donnés
			int tempEsquive1 = 0, tempEsquive2 =0; // Nombre d'esquives faites
			
			System.out.println("\n Debut du combat entre : "+this.name+" et "+_ennemi.getName()+" avec des armes/bouclier et armures trouves au hasard.");
			System.out.println("  ________________________________________________________________________________________");
			
			boolean fin = false; // Booleen de fin du combat
			
			Random rd = new Random();
					
			do {
					//test de la portee de l'attaque
					if (this.testPortee(_ennemi))
					{
						//Test si le premier barbare esquive
						if (rd.nextInt(100)+1 > _ennemi.getDodge())
						{
							//Test si le barabre a trop d'armure avec sa reduction de dégats
							if (_ennemi.getDamageReduce() <= this.getDamage())
							{
								//Reduction de la vie du nombre de degats moins la reduction de dégats
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
								//Reduction de la vie du nombre de degats moins la reduction de dégats
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
							System.out.print("\n"+_ennemi.getName()+" gagne.\n");
							
							//Gain d'experience/niveau
							_ennemi.setExperience(_ennemi.getExperience()+50);
							_ennemi.setLevel();
							System.out.println("Niveau de "+_ennemi.getName()+": "+_ennemi.getLevel());
							System.out.println("Niveau de "+this.name+": "+this.getLevel());
							
							fin = true;
						}
						//Test si l'attaqué a perdu
						else if(tempHealth2 <=0 && tempHealth1 >0)
						{
							System.out.print("\n"+this.name+" gagne.\n");
							//Gain d'experience/niveau
							this.setExperience(this.getExperience()+50);
							this.setLevel();
							System.out.println("Niveau de "+_ennemi.getName()+": "+_ennemi.getLevel());
							System.out.println("Niveau de "+this.getName()+": "+this.getLevel());
							
							fin = true;
						}
						// Test si les deux ont perdu
						else if(tempHealth1 <=0 && tempHealth2 <=0)
						{
							System.out.print("\nEgalite.\n");
							
							//Gain d'experience/niveau
							_ennemi.setExperience(_ennemi.getExperience()+50);
							_ennemi.setLevel();
							this.setExperience(this.getExperience()+50);
							this.setLevel();
							System.out.println("Niveau de "+_ennemi.getName()+": "+_ennemi.getLevel());
							System.out.println("Niveau de "+this.name+": "+this.getLevel());
							
							fin = true;
						}	
					}
					else
					{
						System.out.println("La cible est trop loin.");
					}
				}while (fin == false);	
			//Resultats
			
			//Si les barabres ont trop d'armure : a savoir si la reduction de dégats est plus grand que les degats ingligé par leur adversaire
			if (_ennemi.getDamageReduce() >= this.getDamage())
			{
				System.out.print("\n"+_ennemi.getName()+" a trop d'armure");
			}
			else if (this.getDamageReduce() >= _ennemi.getDamage())
			{
				System.out.print("\n"+this.getName()+" a trop d'armure");
			}
			else if (this.getDamageReduce() >= _ennemi.getDamage() && _ennemi.getDamageReduce() >= this.getDamage())
			{ 
				System.out.println("\nLes deux ont trop d'armure par rapport aux dégats de leurs armes.");
			}
			
			//Statistiques du combat : degats infligés, nombre de coups, esquives, amrure,point vie etc...
			System.out.print("\n"+this.getName()+" a infligé a: "+_ennemi.getName()+" ==> "+(this.getDamage()-_ennemi.getDamageReduce())*tempCombat2+" degats en "+tempCombat2+" coups avec "+_ennemi.getDamageReduce()+" reduits par l'armure avec: ");
			System.out.print(_ennemi.getArmor()+" d'armure,avec "+tempEsquive2+" esquives et PV restants : "+tempHealth2);
			System.out.print("\n"+_ennemi.getName()+" attaque : "+this.name+" ==> "+(_ennemi.getDamage()-this.getDamageReduce())*tempCombat1+" degats en "+tempCombat1+" coups avec "+this.getDamageReduce()+" reduits par l'armure avec: ");
			System.out.print(this.armor.getArmor()+" d'armure,avec "+tempEsquive1+" esquives et PV restants : "+tempHealth1+"\n");
			
		}	
	
		//test de la portée des attaques
		public boolean testPortee(PJ _personnage)
		{
			double abscTest = _personnage.getPortee().getAbcisseCentre() - this.getPortee().getAbcisseCentre();
			double ordoTest = _personnage.getPortee().getOrdonneeCentre()- this.getPortee().getOrdonneeCentre();
			double distance = Math.sqrt(abscTest*abscTest + ordoTest*ordoTest);
			
			if(distance <= this.getPortee().getRayon())
			{
				return true;
			}
			else
			{
				return false;
			}
		}
	public abstract int fight();
	protected abstract int getDamageReduce();
	protected abstract int getDamage();
	protected abstract int getArmor();
}
