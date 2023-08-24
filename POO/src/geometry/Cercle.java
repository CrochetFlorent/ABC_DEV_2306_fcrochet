package geometry;

public class Cercle {

	Point centre;
	double rayon;
	
	double perimetre,surface;
	
	
	public Cercle(Point _centre,double _rayon)
	{
		centre = _centre;
		rayon = _rayon;
	}
	public void Surface()
	{
		surface = Math.round(Math.pow(rayon*Math.PI, 2)*100)/100;
	}
	
	public void Perimetre()
	{
		perimetre = Math.round(Math.PI * 2 * rayon*100)/100;
	}
	
	public void testAppartenance(Point testPoint)
	{
		if(Math.sqrt(Math.pow(testPoint.abscisse-centre.abscisse, 2) + Math.pow(testPoint.ordonnee-centre.ordonnee, 2)) <= rayon)
		{
			System.out.println("Le point d'abscisse : "+testPoint.abscisse+" et d'ordonnee : "+testPoint.ordonnee+" appartient au cercle");
		}
		else
		{
			System.out.println("Le point n'appartient pas au cercle.");
		}
	}
	
	public void Afficher()
	{
		System.out.println("La surface du cercle est de : "+surface+", son perimetre "+perimetre);
	}
}
