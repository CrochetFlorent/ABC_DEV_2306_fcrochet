import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Algue {

	private boolean estVivant;
	private int pv;
	private int age;
	
	//Constructeur par défaut
	public Algue()
	{
		this.estVivant = true;
		this.pv =10;
		Random rdTours = new Random();
		int rd = rdTours.nextInt(20)+1;
		this.age =rd;
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
	//Setters
	public void setVie(boolean _estVivant){this.estVivant = _estVivant;}
	public void setPV(int _pv){this.pv =_pv;
		if(this.pv ==0) {this.estVivant =false;}}
	public void setAge(int _age){this.age=_age;}
	//L'algue grandit, donc prend 1 point de vie
	public void grandir(){this.pv = this.pv+1;}
	//L'algue se reproduit
	public Algue reproduction() {
		int random=ThreadLocalRandom.current().nextInt(5);
		if(random==3) {this.pv=this.pv/2;Algue newAlgue = new Algue(true,5,0); return newAlgue;}
		else{return null;}}
}
