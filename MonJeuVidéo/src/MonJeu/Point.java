package MonJeu;

public class Point {

	int abcisse;
	int ordonnee;
	
	//Constructeur avec parametres
	public Point(int _abcisse,int _ordonnee)
	{
		abcisse = _abcisse;
		ordonnee = _ordonnee;
	}
	
	//Getter abcisse
	public int getAbcisse()
	{
		return this.abcisse;
	}
	//Getter abcisse
		public int getOrdonnee()
		{
			return this.ordonnee;
		}
}
