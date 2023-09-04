package MonJeu;

public class Cercle {
	
	private int rayon;
	private Point centre;
	
	
	//Constructeur avec parametres
	public Cercle(int _rayon,Point _centre)
	{
		rayon = _rayon;
		centre = _centre;
	}
	
	//Getter rayon
	public int getRayon()
	{
		return this.rayon;
	}
	//Getter centre
	public Point getCentre()
	{
		return this.centre;
	}
	//setter rayon
	public void setRayon(int _rayon)
	{
		this.rayon = _rayon;
	}
	//Getter abcisse
	public int getAbcisseCentre()
	{
		return this.centre.abcisse;
	}
	//Getter ordonnee
	public int getOrdonneeCentre()
		{
			return this.centre.ordonnee;
		}
}
