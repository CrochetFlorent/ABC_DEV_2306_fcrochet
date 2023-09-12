package Exercice_2;

public class Domino {

	private int numero;
	private int faceA;
	private int faceB;
	
	//Constructeur sans paramètres
	public Domino()
	{
		this.numero = 0;
		this.faceA = 0;
		this.faceB = 0;
	}
	
	//Constructeur avec parmètres
	public Domino(int _numero,int _faceA,int _faceB)
	{
		this.numero = _numero;
		this.faceA = _faceA;
		this.faceB = _faceB;
	}
	
	public void affichePoints()
	{
		System.out.println("Le domino "+this.numero+" a sur sa premiere face le numero "+this.faceA+" et sur sa deuxieme face le numero "+this.faceB);
	}
	
	public int valeur()
	{
		return this.faceA+this.faceB;
	}
	
	public boolean verifierCouple(Domino dom1)
	{
		if(dom1.faceA == this.faceA)
		{
			return true;
		}
		else if(dom1.faceA == this.faceB)
		{
			return true;
		}
		else if(dom1.faceB == this.faceA)
		{
			return true;
		}
		else if(dom1.faceB == this.faceB)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
