package Exemple_Rectangle;

public class Rectangle {

	private double longueur,largeur,surface,perimetre;
	
	public Rectangle(double _longueur,double _largeur)
	{
		longueur = _longueur;
		largeur = _largeur;
	}
	
	public void Surface()
	{		
		this.surface = this.longueur * this.largeur;
	}
	
	public void Perimetre()
	{
		this.perimetre = this.largeur*2 + this.longueur *2 ;
	}
	
	public void Afficher()
	{
		System.out.println("La surface du rectangle est de : "+this.surface+" et son perimetre : "+this.perimetre);
	}
}
