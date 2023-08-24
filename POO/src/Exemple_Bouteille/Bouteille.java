package Exemple_Bouteille;

import java.util.Scanner;

public class Bouteille {

	// attributs
	private final double capaciteEnL;
	private double contenanceEnL;
	private boolean estOuverte;
	private String nom;
	
	Scanner sc = new Scanner(System.in);
	
	//  constructeur par defaut
	public Bouteille()
	{
		nom = " ";
		contenanceEnL = 0.9;
		capaciteEnL = 1;
		estOuverte = true;
	}
	
	// constructeur avec parametre
	public Bouteille(String _nom, double _contenanceEnL, double _capaciteEnL, boolean _estOuverte)
	{
		this.nom = _nom;
		this.contenanceEnL = _contenanceEnL;
		this.capaciteEnL = _capaciteEnL;
		this.estOuverte = _estOuverte;
	}
	public double getContenanceEnL()
	{
		return contenanceEnL;
	}
	
	public void setContenanceEnL(double _contenanceEnL)
	{
		contenanceEnL = _contenanceEnL;	
	}
	
	public boolean ouvrir()
	{
		if(!this.estOuverte)
		{
			this.estOuverte = true;
			return true;
		}
		else
		{
			return false;
		}
	}	
	
	public boolean fermer()
	{
		if(this.estOuverte)
		{
			this.estOuverte = false;
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean remplirTout()
	{
		if (estOuverte)
		{
			contenanceEnL = capaciteEnL;
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean viderTout()
	{
		if (estOuverte)
		{
			contenanceEnL = 0;
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public double remplir()
	{
		double changement;
		if(estOuverte && contenanceEnL != capaciteEnL)
		{
			System.out.println("Combien voulez vous rajouter de litre?");
			changement = sc.nextDouble();
			if(changement + contenanceEnL <= capaciteEnL)
			{
				contenanceEnL = contenanceEnL + changement;
			}
			else
			{
				System.out.println("ca fera trop.");
			}
		}else if (!estOuverte)
		{
			System.out.println("Ouvrez d'abord la bouteille");
		}
		else if (contenanceEnL == capaciteEnL)
		{
			System.out.println("La bouteille est pleine");
		}
		return contenanceEnL;
	}
	
	public double vider()
	{
		double changement;
		if(estOuverte && contenanceEnL != 0)
		{
			System.out.println("Combien voulez vous rajouter de litre?");
			changement = sc.nextDouble();
			if(changement + contenanceEnL > 0)
			{
				contenanceEnL = contenanceEnL - changement;
			}

		}else if (!estOuverte)
		{
			System.out.println("Ouvrez d'abord la bouteille");
		}
		else if (contenanceEnL == 0)
		{
			System.out.println("La bouteille est vide");
		}
		return contenanceEnL;
	}
}
