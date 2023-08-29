package Exemple_Voiture;

public class Voiture {

	String marque;
	double prix;
	
	public Voiture()
	{
		this.marque ="";
		this.prix = 0;
	}
	
	public String getMarque()
	{
		return this.marque;
	}
	
	public double getPrix()
	{
		return this.prix;
	}
	
	public void setMarque(String _marque)
	{
		this.marque = _marque;
	}
	
	public void setPrix(double _prix)
	{
		this.prix = _prix;
	}
	
	public void Afficher()
	{
		System.out.println("La marque de cette voiture est : "+this.marque+" et son prix est de : "+this.prix+" euros.");
	}
}
