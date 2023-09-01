package MonJeu;

public class Rodeur extends PJ{
	//Attributs
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
		public Rodeur()
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
		public Rodeur(String _name,int _health,leftHand _leftHand,Weapon _rightHand,int _dodge,Armor _armor,int _damageReduce,int _experience,int _level,boolean _agressive)
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
		@Override
		public int fight() {
			// TODO Auto-generated method stub
			return 0;
		}
}
