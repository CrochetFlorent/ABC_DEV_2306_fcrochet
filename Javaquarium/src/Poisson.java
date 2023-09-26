import java.util.Random;

public class Poisson {

	private String nom;
	private String sexe;
	private String race;
	private int pv;
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

	}
	//Constructeur avec paramètres
	public Poisson(String _nom,String _sexe)
	{
		this.nom = _nom;
		this.sexe = _sexe;
	}
	//Getters
	public String getNom()
	{
		return this.nom;
	}
	public String getSexe()
	{
		return this.sexe;
	}
	public String getRace()
	{
		return this.race;
	}
	public boolean getType()
	{
		return this.estHerbivore;
	}
	public boolean getVie()
	{
		return this.estVivant;
	}
	public int getPV()
	{
		return this.pv;
	}
	//Setters
	public void setPV(int _pv)
	{
		this.pv = _pv;
	}
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
	public void faim()
	{
		this.pv=this.pv-1;
	}
	
}
