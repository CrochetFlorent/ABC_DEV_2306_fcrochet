package Exemple_Rectangle;

public class Rectangle {

	double longueur,largeur,surface,perimetre;
	
	public Rectangle(double _longueur,double _largeur)
	{
		longueur = _longueur;
		largeur = _largeur;
	}
	
	public void Surface()
	{		
		surface = longueur * largeur;
	}
	
	public void Perimetre()
	{
		perimetre = largeur*2 + longueur *2 ;
	}
	
	public void Afficher()
	{
		System.out.println("La surface du rectangle est de : "+surface+" et son perimetre : "+perimetre);
	}
}
