package Exemple_Voiture;

public class Voiture {

	String marque;
	double prix;
	
	public Voiture()
	{
		marque ="";
		prix = 0;
	}
	
	public String getMarque()
	{
		return marque;
	}
	
	public double getPrix()
	{
		return prix;
	}
	
	public void setMarque(String _marque)
	{
		marque = _marque;
	}
	
	public void setPrix(double _prix)
	{
		prix = _prix;
	}
	
	public void Afficher()
	{
		System.out.println("La marque de cette voiture est : "+marque+" et son prix est de : "+prix+" euros.");
	}
}
