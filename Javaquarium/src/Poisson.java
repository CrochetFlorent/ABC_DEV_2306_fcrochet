import java.util.Random;

public class Poisson {

	private String nom;
	private String sexe;
	private String race;
	private int pv;
	private int age;
	private boolean estVivant;
	private boolean estHerbivore;
	
	//Constructeur par défaut
	public Poisson()
	{
		this.nom="Un poisson Lambda";
		Random rdSexe = new Random();
		int rd1 = rdSexe.nextInt(2);
			if(rd1==0){this.sexe = "Male";}
			else {this.sexe = "Femelle";}	
		Random rdType = new Random();
		int rd2 =rdType.nextInt(2);
			if(rd2==0) {Random rdRace = new Random();
						int rd2_1 = rdRace.nextInt(3);
						if(rd2_1==0) {this.race = "Mérou";this.estHerbivore=false;}else if(rd2_1==1) {this.race="Thon";this.estHerbivore=false;}else {this.race="PoissonClown";this.estHerbivore=false;}}
			else {		Random rdRace = new Random();
						int rd2_2 = rdRace.nextInt(3);
						if(rd2_2==0) {this.race = "Sole";this.estHerbivore=true;}else if(rd2_2==1) {this.race="Bar";this.estHerbivore=true;}else {this.race="Carpe";this.estHerbivore=true;}}
		this.estVivant =true;
		this.pv = 10;
		Random rdTours = new Random();
		int rd = rdTours.nextInt(20)+1;
		this.age =rd;

	}
	//Constructeur avec paramètres
	public Poisson(String _nom,String _sexe,String _race,int _age,boolean _type){
		this.nom = _nom;
		this.sexe=_sexe;
		this.race= _race;
		this.pv=10;
		this.age = _age;
		this.estVivant =true;
		this.estHerbivore =_type;}
	//Getters
	public String getNom(){return this.nom;}
	public String getSexe(){return this.sexe;}
	public String getRace(){return this.race;}
	public boolean getType(){return this.estHerbivore;}
	public boolean getVie(){return this.estVivant;}
	public int getPV(){return this.pv;}
	public int getAge(){return this.age;}
	//Setters
	public void setVie(boolean _vie) {this.estVivant=_vie;}
	public void setPV(int _pv){this.pv = _pv;
		if(this.pv ==0) {this.estVivant =false;}}
	public void setAge(int _age){this.age=_age;}
	//Manger pour les herbivores
	public void manger(Algue _repas)
	{
		if (this.estHerbivore) {
			_repas.setPV(_repas.getPV()-2);
			this.pv = this.pv+3;
			if (_repas.getPV()==0) {_repas.setVie(false);}
		}
	}
	//Manger pour les carnivores
	public void manger(Poisson _repas)
	{
		if (!estHerbivore && _repas.getType() && this.getPV()<=5) {_repas.estVivant = false;}
		else if(!estHerbivore && !_repas.getType()) {_repas.setPV(_repas.getPV()-4);}
	}
	//Avoir faim
	public void faim(){this.pv=this.pv-1;}
	//Changer de sexe
	//Avec l'age
	public void changerDeSexeAge() {if (this.race.equals("Bar")||this.race.equals("Mérou")) {
		if(this.age==10) {	
			if(this.sexe.equals("Male")) {this.sexe="Femelle";} else {this.sexe="Male";}}}}
	//Opportuniste
	public void changerDeSexeOpp(Poisson _Opp) {if (this.race.equals("Sole")||this.race.equals("PoissonClown")) {	
			if(_Opp.sexe.equals("Male")) {this.sexe="Femelle";} else {this.sexe="Male";}}}
	//Se reproduire
	public Poisson reproduction(Poisson _autre)
	{
		this.changerDeSexeAge();
		this.changerDeSexeOpp(_autre);
		if(this.sexe !=_autre.sexe && this.getPV()>5 && this.age >3 && _autre.age>3) {
			if(this.race.equals("Mérou")&&_autre.race.equals("Mérou")){
				Random rdSexe =new Random();
				int rd= rdSexe.nextInt(2);
				if(rd==0) {Poisson newPoisson = new Poisson("Merou lambda","Male","Mérou",0,false);return newPoisson;}
				else {Poisson newPoisson = new Poisson("Merou lambda","Femelle","Mérou",0,false);return newPoisson;}}
			else if(this.race.equals("Thon")&&_autre.race.equals("Thon")){
				Random rdSexe =new Random();
				int rd= rdSexe.nextInt(2);
				if(rd==0) {Poisson newPoisson = new Poisson("Thon lambda","Male","Thon",0,false);return newPoisson;}
				else {Poisson newPoisson = new Poisson("Thon lambda","Femelle","Thon",0,false);return newPoisson;}}
			else if(this.race.equals("PoissonClown")&&_autre.race.equals("PoissonClown")){
				Random rdSexe =new Random();
				int rd= rdSexe.nextInt(2);
				if(rd==0) {Poisson newPoisson = new Poisson("PoissonClown lambda","Male","PoissonClown",0,false);return newPoisson;}
				else {Poisson newPoisson = new Poisson("PoissonClown lambda","Femelle","PoissonClown",0,false);return newPoisson;}}
			else if(this.race.equals("Sole")&&_autre.race.equals("Sole")){
				Random rdSexe =new Random();
				int rd= rdSexe.nextInt(2);
				if(rd==0) {Poisson newPoisson = new Poisson("Sole lambda","Male","Sole",0,true);return newPoisson;}
				else {Poisson newPoisson = new Poisson("Sole lambda","Femelle","Sole",0,true);return newPoisson;}}
			else if(this.race.equals("Bar")&&_autre.race.equals("Bar")){
				Random rdSexe =new Random();
				int rd= rdSexe.nextInt(2);
				if(rd==0) {Poisson newPoisson = new Poisson("Bar lambda","Male","Bar",0,true);return newPoisson;}
				else {Poisson newPoisson = new Poisson("Bar lambda","Femelle","Bar",0,true);return newPoisson;}}
			else if(this.race.equals("Carpe")&&_autre.race.equals("Carpe")) {
				Random rdSexe =new Random();
				int rd= rdSexe.nextInt(2);
				if(rd==0) {Poisson newPoisson = new Poisson("Carpe lambda","Male","Carpe",0,true);return newPoisson;}
				else {Poisson newPoisson = new Poisson("Carpe lambda","Femelle","Carpe",0,true);return newPoisson;}}
		}return null;}	
}
