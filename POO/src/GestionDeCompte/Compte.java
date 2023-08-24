package GestionDeCompte;

public class Compte {

	public double solde;
	
	public Compte(double _solde)
	{
		solde = _solde;
	}
	
	public void Deposer(double versement)
	{
		solde = solde + versement;
	}
	
	public void Retirer(int retrait)
	{
		solde = solde - retrait;
	}
	
	public void Afficher()
	{
		System.out.println("Le solde de votre compte est de :"+solde);
	}
	
	
}
