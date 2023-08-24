package Exemple_Ville;

public class Ville {
	
	private String nomVille;
	private int nbHabitants;
	private String nomPays;
	
	public Ville()
	{
		System.out.println("Creation d'un objet ville avec le constructeur par defaut");
		nomVille = "inconnu";
		nomPays = "inconnu";
		nbHabitants = 0;
	}
	
	public Ville(String pNomVille, int pNbre, String pNomPays)
	{
		System.out.println("Creation d'un objet ville avec le constructeur avec paramétre");
		nomVille = pNomVille;
		nomPays = pNomPays;
		nbHabitants = pNbre;
	}
	
	public String getNomVille()
	{
		return nomVille;
	}
	
	public String getNomPays()
	{
		return nomPays;
	}
	
	public int getNbHabitants()
	{
		return nbHabitants;
	}
	
	public void setNomVille(String pNomVille)
	{
		nomVille = pNomVille;
	}
	
	public void setNomPays(String pNomPays)
	{
		nomPays = pNomPays;
	}
	
	public void setNbHabitants(int pNbHabitants)
	{
		nbHabitants = pNbHabitants;
	}


}
