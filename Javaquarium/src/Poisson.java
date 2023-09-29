import java.util.ArrayList;
import java.util.Random;

public class Poisson {

	private String nom;
	private String sexe;
	private String race;
	private int pv;//points de vie
	private int age;
	private boolean sEstReproduit;
	private boolean estVivant;
	private String alimentation;
	private int generation;
	//deux tableau de nom, qui seront utilisés pour y choisir des noms à la création de nos poissons
	private String[] nomsMasculins = {"Florent","Anthony","Tristan","Aurélien","Sebastien",
			 "Steve","Habib","Hassan","Maxime","Quentin"};
	private String[] nomsFeminins ={"Juliette","Caroline","Mauricette","Corinne","Alba","Adeline","Stephanie",
			 "Florence","Joelle","Marie"};
	
	//Constructeur par défaut, création d'un poisson au caractèéristiques aléatoires
	public Poisson()
	{
		Random rd = new Random();
		int rd1 = rd.nextInt(2);
		int rdNom = rd.nextInt(nomsMasculins.length);
		if(rd1==0){this.sexe = "Male";this.nom =this.nomsMasculins[rdNom];}
		else {this.sexe = "Femelle";this.nom =this.nomsFeminins[rdNom];}	
		
		Random rdType = new Random();
		int rd2 =rdType.nextInt(2);
		if(rd2==0)
		{
			int rd2_1 = rd.nextInt(3);
			if(rd2_1==0) {this.race = "Mérou";this.alimentation="Carnivore";}else if(rd2_1==1) {this.race="Thon";this.alimentation="Carnivore";}else {this.race="PoissonClown";this.alimentation="Carnivore";}
		}
		else
		{		
			int rd2_2 = rd.nextInt(3);
			if(rd2_2==0) {this.race = "Sole";this.alimentation ="Herbivore";}else if(rd2_2==1) {this.race="Bar";this.alimentation="Herbivore";}else {this.race="Carpe";this.alimentation="Herbivore";}
		}
		
		this.estVivant =true;
		this.pv = 10;
		
		int rd3 = rd.nextInt(20)+1;
		this.age =rd3;
		
		this.generation = 1;
	}
	//Constructeur avec paramètres
	public Poisson(String _nom,String _sexe,String _race,int _age,String _alimentation,int _generation)
	{
		this.nom = _nom;
		this.sexe=_sexe;
		this.race= _race;
		this.pv=10;
		this.age = _age;
		this.estVivant =true;
		this.alimentation =_alimentation;
		this.generation=_generation;
	}
	
	//Getters
	public String getNom(){return this.nom;}
	public String getSexe(){return this.sexe;}
	public String getRace(){return this.race;}
	public String getType(){return this.alimentation;}
	public boolean getVie(){return this.estVivant;}
	public int getPV(){return this.pv;}
	public int getAge(){return this.age;}
	public boolean getReproduction() {return sEstReproduit;}
	public int getGeneration() {return this.generation;}
	
	//Setters
	public void setVie(boolean _vie) {this.estVivant=_vie;}
	
	public void setPV(int _pv)
	{
		this.pv = _pv;
		if(this.pv <=0) {this.estVivant =false;}
	}
	
	public void setAge(int _age){this.age=_age;}
	
	public void setReproduction(boolean _reproduit) {this.sEstReproduit = _reproduit;}
	
	//Manger pour les herbivores
	public void manger(Algue _repas)
	{
		if (this.alimentation.equals("Herbivore")) //Si le poissons est herbovire
		{
			_repas.setPV(_repas.getPV()-2);//L'algue qu'il mange perd 2 pv
			this.pv = this.pv+3;//Le mangeur gagne 3 pv
			if (_repas.getPV()<=0) {_repas.setVie(false);}//Si l'algue à 0 pv ou moins il meurt
		}
	}
	//Manger pour les carnivores
	public void manger(Poisson _repas)
	{
		if(this.getRace()!=_repas.getRace())//Si les races sont différentes
		{
			if (this.alimentation.equals("Carnivore")&& this.getPV()<=5) //Si le poissons qui mange est carnivore
				//et qu'il à 5 points de vie ou moins
			{	
				_repas.setPV(_repas.getPV()-4);//le poissons attaqué perd 4 pv
				this.setPV(this.getPV()+5); //Le mangeur gagne 5pv
			}
			if(_repas.getPV()<=0) {_repas.setVie(false);}//L'attaqué est mort s'il à 0 pv ou moins
		}
	}
	//Avoir faim
	public void faim(){this.pv=this.pv-1;}
	//Changer de sexe en fonction de l'age( selon la race)
	private void changerDeSexeAge()
	{
		if ((this.race.equals("Bar")||this.race.equals("Mérou"))&& this.age==10) 
		{	
			if(this.sexe.equals("Male")) {this.sexe="Femelle";} else {this.sexe="Male";}
		}
	}
	//Changer de sexe selon l'opportuniste
	private void changerDeSexeOpportunite(Poisson _Opp) 
	{
		if (this.race.equals("Sole")||this.race.equals("PoissonClown")) 
		{	
			if(_Opp.sexe.equals("Male")) {this.sexe="Femelle";} else {this.sexe="Male";}
		}
	}

	//Se reproduire:
	//On appelle les changement de sexe qui s'exécuteront si nécéssaire
	//Si le sexe est différent pour les deux "amoureux",qu'ils ont plus de 5pv(donc qu'ils n'ont pas faim),
	//qu'ils sont assez vieux pour se reproduire,et qu'ont à pas plus de 30 poissons
	//Il se reproduisent.Si le poisson est de la même race que sont partenaire on creer un poisson
	//dont le sexe est choisit alétoirement
	public Poisson reproduction(Poisson _autre,Aquarium _milieu)
	{
		this.changerDeSexeAge();
		this.changerDeSexeOpportunite(_autre);
		Random rd = new Random();
		if(this.sexe !=_autre.sexe && this.getPV()>5 && this.age >3 && _autre.age>3 && _milieu.getPoissons()<=30) 
		{
			if(this.race.equals("Mérou")&&_autre.race.equals("Mérou"))
			{
				int rdSexe= rd.nextInt(2);
				int rdNom = rd.nextInt(nomsMasculins.length);
				if(rdSexe==0) {Poisson newPoisson = new Poisson(nomsMasculins[rdNom],"Male","Mérou",0,"Carnivore",this.generation+1);this.sEstReproduit = true;return newPoisson;}
				else {Poisson newPoisson = new Poisson(nomsFeminins[rdNom],"Femelle","Mérou",0,"Carnivore",this.generation+1);this.sEstReproduit = true;return newPoisson;}
			}
			else if(this.race.equals("Thon")&&_autre.race.equals("Thon"))
			{
				int rdSexe= rd.nextInt(2);
				int rdNom = rd.nextInt(nomsMasculins.length);
				if(rdSexe==0) {Poisson newPoisson = new Poisson(nomsMasculins[rdNom],"Male","Thon",0,"Carnivore",this.generation+1);this.sEstReproduit = true;return newPoisson;}
				else {Poisson newPoisson = new Poisson(nomsFeminins[rdNom],"Femelle","Thon",0,"Carnivore",this.generation+1);this.sEstReproduit = true;return newPoisson;}
			}
			else if(this.race.equals("PoissonClown")&&_autre.race.equals("PoissonClown"))
			{
				int rdSexe= rd.nextInt(2);
				int rdNom = rd.nextInt(nomsMasculins.length);
				if(rdSexe==0) {Poisson newPoisson = new Poisson(nomsMasculins[rdNom],"Male","PoissonClown",0,"Carnivore",this.generation+1);this.sEstReproduit = true;return newPoisson;}
				else {Poisson newPoisson = new Poisson(nomsFeminins[rdNom],"Femelle","PoissonClown",0,"Carnivore",this.generation+1);this.sEstReproduit = true;return newPoisson;}
			}
			else if(this.race.equals("Sole")&&_autre.race.equals("Sole"))
			{
				int rdSexe= rd.nextInt(2);
				int rdNom = rd.nextInt(nomsMasculins.length);
				if(rdSexe==0) {Poisson newPoisson = new Poisson(nomsMasculins[rdNom],"Male","Sole",0,"Herbivore",this.generation+1);this.sEstReproduit = true;return newPoisson;}
				else {Poisson newPoisson = new Poisson(nomsFeminins[rdNom],"Femelle","Sole",0,"Herbivore",this.generation+1);this.sEstReproduit = true;return newPoisson;}
			}
			else if(this.race.equals("Bar")&&_autre.race.equals("Bar"))
			{
				int rdSexe= rd.nextInt(2);
				int rdNom = rd.nextInt(nomsMasculins.length);
				if(rdSexe==0) {Poisson newPoisson = new Poisson(nomsMasculins[rdNom],"Male","Bar",0,"Herbivore",this.generation+1);this.sEstReproduit = true;return newPoisson;}
				else {Poisson newPoisson = new Poisson(nomsFeminins[rdNom],"Femelle","Bar",0,"Herbivore",this.generation+1);this.sEstReproduit = true;return newPoisson;}
			}
			else if(this.race.equals("Carpe")&&_autre.race.equals("Carpe")) 
			{
				int rdSexe= rd.nextInt(2);
				int rdNom = rd.nextInt(nomsMasculins.length);
				if(rdSexe==0) {Poisson newPoisson = new Poisson(nomsMasculins[rdNom],"Male","Carpe",0,"Herbivore",this.generation+1);_autre.sEstReproduit = true;return newPoisson;}
				else {Poisson newPoisson = new Poisson(nomsFeminins[rdNom],"Femelle","Carpe",0,"Herbivore",this.generation+1);_autre.sEstReproduit = true;return newPoisson;}
			}
		}
		return null;
	}	
}
