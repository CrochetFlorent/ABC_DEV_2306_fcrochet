import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Algue {

	private boolean estVivant; //booleen pour definir si un algue est vivant ou non
	private int pv;//nombre de points de vie
	private int age;//age
	private boolean sEstReproduit;
	
	//Constructeur par défaut
	public Algue()
	{
		this.estVivant = true;
		this.pv =10;
		Random rd = new Random();
		int rdTours = rd.nextInt(20)+1;
		this.age =rdTours;
	}
	
	//Constructeur avec parametres
	public Algue(boolean _vivant,int _pv,int _age)
	{
		this.estVivant = _vivant;
		this.pv =_pv;
		this.age =_age;
	}
	
	//Getters
	public boolean getVie(){return this.estVivant;}
	
	public int getPV(){return this.pv;}
	
	public int getAge(){return this.age;}
	
	public boolean getReproduction() {return this.sEstReproduit;}
	
	//Setters
	public void setVie(boolean _estVivant){this.estVivant = _estVivant;}
	
	public void setPV(int _pv)
	{
		this.pv =_pv;
		if(this.pv ==0) {this.estVivant =false;}
	}
	
	public void setAge(int _age){this.age=_age;}
	public void setRepdroduction(boolean _reproduit) {this.sEstReproduit=_reproduit;}
	
	//L'algue grandit, donc prend 1 point de vie
	public void grandir(){this.pv = this.pv+1;}
	
	//L'algue se reproduit
	public Algue reproduction(Aquarium _milieu)
	{
		if(_milieu.getAlgues()<20)//Si le nombre d'algues n'est pas égal à 20
		{
			this.pv=this.pv/2;//L'algue qui se reproduit à ses pv divisés par deux
			Algue newAlgue = new Algue(true,5,0);//On créer un nouvel algue
			this.sEstReproduit =true;
			return newAlgue;
		}
		else{return null;}
	}
}
