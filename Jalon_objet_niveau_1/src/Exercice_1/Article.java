package Exercice_1;

public class Article {
	
	private String designation;
	private int reference;
	private double prixHT;
	private final static double tauxTVA= 19.6;
	
	//Constructeur sans paramètres
	public Article()
	{
		this.designation = "";
		this.reference = 0;
		this.prixHT = 0;
	}
	
	//Constructeur avec paramètres
	public Article(String _designation,int _reference,double _prixHT)
	{
		this.designation = _designation;
		this.reference = _reference;
		this.prixHT = _prixHT;
	}
	
	//Getter designation
	public String getDesignation()
	{
		return this.designation;
	}
	//Getter reference
	public int getReference()
	{
		return this.reference;
	}
	//Getter prixHT
	public double getPrixHT()
	{
		return this.prixHT;
	}
	
	public double CalculerPrixTTC()
	{
		return this.getPrixHT()*tauxTVA/100;
	}
	
	public void AfficherArticle()
	{
		System.out.println(this.getDesignation()+" est l'article de reference "+this.getReference()+" et vaut "+this.getPrixHT()+" euros hors taxe et "+this.CalculerPrixTTC()+" TTC.");
	}
}
