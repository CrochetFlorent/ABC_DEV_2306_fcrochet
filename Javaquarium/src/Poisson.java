import java.util.ArrayList;
import java.util.Random;

public class Poisson {

	private String nom;
	private String sexe;
	private String race;
	private int pv;
	private int age;
	private boolean sEstReproduit;
	private boolean estVivant;
	private boolean estHerbivore;
	private int generation;
	private String[] nomsMasculins = {"Florent","Anthony","Tristan","Aurélien","Sebastien",
			 "Steve","Habib","Hassan","Maxime","Quentin"};
	private String[] nomsFeminins ={"Juliette","Caroline","Mauricette","Corinne","Alba","Adeline","Stephanie",
			 "Florence","Joelle","Marie"};
	
	//Constructeur par défaut
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
			if(rd2_1==0) {this.race = "Mérou";this.estHerbivore=false;}else if(rd2_1==1) {this.race="Thon";this.estHerbivore=false;}else {this.race="PoissonClown";this.estHerbivore=false;}
		}
		else
		{		
			int rd2_2 = rd.nextInt(3);
			if(rd2_2==0) {this.race = "Sole";this.estHerbivore=true;}else if(rd2_2==1) {this.race="Bar";this.estHerbivore=true;}else {this.race="Carpe";this.estHerbivore=true;}
		}
		
		this.estVivant =true;
		this.pv = 10;
		
		int rd3 = rd.nextInt(20)+1;
		this.age =rd3;
		
		this.generation = 1;
	}
	//Constructeur avec paramètres
	public Poisson(String _nom,String _sexe,String _race,int _age,boolean _type,int _generation)
	{
		this.nom = _nom;
		this.sexe=_sexe;
		this.race= _race;
		this.pv=10;
		this.age = _age;
		this.estVivant =true;
		this.estHerbivore =_type;
		this.generation=_generation;
	}
	
	//Getters
	public String getNom(){return this.nom;}
	public String getSexe(){return this.sexe;}
	public String getRace(){return this.race;}
	public boolean getType(){return this.estHerbivore;}
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
		if (this.estHerbivore) {
			_repas.setPV(_repas.getPV()-2);
			this.pv = this.pv+3;
			if (_repas.getPV()<=0) {_repas.setVie(false);}
		}
	}
	//Manger pour les carnivores
	public void manger(Poisson _repas)
	{
		if(this.getRace()!=_repas.getRace())
		{
			if (!estHerbivore && _repas.getType() && this.getPV()<=5) 
			{	
				_repas.setPV(_repas.getPV()-4);
				this.setPV(this.getPV()+5);
			}
			else if(!estHerbivore && !_repas.getType()) 
			{
				_repas.setPV(_repas.getPV()-4);
				this.setPV(this.getPV()+5);
			}
			if(_repas.getPV()<=0) {_repas.setVie(false);}
		}
	}
	//Avoir faim
	public void faim(){this.pv=this.pv-1;}
	//Changer de sexe
	//Avec l'age
	private void changerDeSexeAge()
	{
		if ((this.race.equals("Bar")||this.race.equals("Mérou"))&& this.age==10) 
		{	
			if(this.sexe.equals("Male")) {this.sexe="Femelle";} else {this.sexe="Male";}
		}
	}
	//Opportuniste
	private void changerDeSexeOpportunite(Poisson _Opp) 
	{
		if (this.race.equals("Sole")||this.race.equals("PoissonClown")) 
		{	
			if(_Opp.sexe.equals("Male")) {this.sexe="Femelle";} else {this.sexe="Male";}
		}
	}

	//Se reproduire
	public Poisson reproduction(Poisson _autre)
	{
		this.changerDeSexeAge();
		this.changerDeSexeOpportunite(_autre);
		Random rd = new Random();
		if(this.sexe !=_autre.sexe && this.getPV()>5 && this.age >3 && _autre.age>3) 
		{
			if(this.race.equals("Mérou")&&_autre.race.equals("Mérou"))
			{
				int rdSexe= rd.nextInt(2);
				int rdNom = rd.nextInt(nomsMasculins.length);
				if(rdSexe==0) {Poisson newPoisson = new Poisson(nomsMasculins[rdNom],"Male","Mérou",0,false,this.generation+1);this.sEstReproduit = true;return newPoisson;}
				else {Poisson newPoisson = new Poisson(nomsFeminins[rdNom],"Femelle","Mérou",0,false,this.generation+1);this.sEstReproduit = true;return newPoisson;}
			}
			else if(this.race.equals("Thon")&&_autre.race.equals("Thon"))
			{
				int rdSexe= rd.nextInt(2);
				int rdNom = rd.nextInt(nomsMasculins.length);
				if(rdSexe==0) {Poisson newPoisson = new Poisson(nomsMasculins[rdNom],"Male","Thon",0,false,this.generation+1);this.sEstReproduit = true;return newPoisson;}
				else {Poisson newPoisson = new Poisson(nomsFeminins[rdNom],"Femelle","Thon",0,false,this.generation+1);this.sEstReproduit = true;return newPoisson;}
			}
			else if(this.race.equals("PoissonClown")&&_autre.race.equals("PoissonClown"))
			{
				int rdSexe= rd.nextInt(2);
				int rdNom = rd.nextInt(nomsMasculins.length);
				if(rdSexe==0) {Poisson newPoisson = new Poisson(nomsMasculins[rdNom],"Male","PoissonClown",0,false,this.generation+1);this.sEstReproduit = true;return newPoisson;}
				else {Poisson newPoisson = new Poisson(nomsFeminins[rdNom],"Femelle","PoissonClown",0,false,this.generation+1);this.sEstReproduit = true;return newPoisson;}
			}
			else if(this.race.equals("Sole")&&_autre.race.equals("Sole"))
			{
				int rdSexe= rd.nextInt(2);
				int rdNom = rd.nextInt(nomsMasculins.length);
				if(rdSexe==0) {Poisson newPoisson = new Poisson(nomsMasculins[rdNom],"Male","Sole",0,true,this.generation+1);this.sEstReproduit = true;return newPoisson;}
				else {Poisson newPoisson = new Poisson(nomsFeminins[rdNom],"Femelle","Sole",0,true,this.generation+1);this.sEstReproduit = true;return newPoisson;}
			}
			else if(this.race.equals("Bar")&&_autre.race.equals("Bar"))
			{
				int rdSexe= rd.nextInt(2);
				int rdNom = rd.nextInt(nomsMasculins.length);
				if(rdSexe==0) {Poisson newPoisson = new Poisson(nomsMasculins[rdNom],"Male","Bar",0,true,this.generation+1);this.sEstReproduit = true;return newPoisson;}
				else {Poisson newPoisson = new Poisson(nomsFeminins[rdNom],"Femelle","Bar",0,true,this.generation+1);this.sEstReproduit = true;return newPoisson;}
			}
			else if(this.race.equals("Carpe")&&_autre.race.equals("Carpe")) 
			{
				int rdSexe= rd.nextInt(2);
				int rdNom = rd.nextInt(nomsMasculins.length);
				if(rdSexe==0) {Poisson newPoisson = new Poisson(nomsMasculins[rdNom],"Male","Carpe",0,true,this.generation+1);_autre.sEstReproduit = true;return newPoisson;}
				else {Poisson newPoisson = new Poisson(nomsFeminins[rdNom],"Femelle","Carpe",0,true,this.generation+1);_autre.sEstReproduit = true;return newPoisson;}
			}
		}
		return null;
	}	
}
