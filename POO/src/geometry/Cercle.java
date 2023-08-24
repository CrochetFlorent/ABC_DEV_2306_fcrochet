package geometry;

import java.util.Scanner;

public class Cercle {

	Point centre;
	double rayon;
	
	public Cercle(Point _centre,double _rayon)
	{
		centre = _centre;
		rayon = _rayon;
	}
	
	public double Surface()
	{
		return Math.round(Math.pow(rayon*Math.PI, 2)*100)/100;
	}
	
	public double Perimetre()
	{
		return Math.round(Math.PI * 2 * rayon*100)/100;
	}
	
	public void testAppartenance()
	{
		
		Point testPoint = new Point();
		
		double abscTest = testPoint.abscisse - centre.abscisse;
		double ordoTest = testPoint.ordonnee - centre.ordonnee;
		double distance = Math.sqrt(abscTest*abscTest + ordoTest*ordoTest);
		
		if(distance <= rayon)
		{
			System.out.println("Le point d'abscisse : "+testPoint.abscisse+" et d'ordonnee : "+testPoint.ordonnee+" appartient au cercle.");
		}
		else
		{
			System.out.println("Le point n'appartient pas au cercle.");
		}
	}
	
	public void Afficher()
	{
		System.out.println("La surface du cercle est de : "+Surface()+", son perimetre "+Perimetre()+".");
		System.out.println("Pour un cercle d'abscisse : "+centre.abscisse+" et d'ordonnee "+centre.ordonnee+" et de rayon :"+rayon);
	}
}
