package Exemple_Bouteille;

import java.util.Scanner;

public class Bouteille {

	// attributs
	private final double CAPACITEENL;
	private double contenanceEnL;
	private boolean estOuverte;
	private String nom;
	
	Scanner sc = new Scanner(System.in);
	
	//  constructeur par defaut
	public Bouteille()
	{
		nom = " ";
		contenanceEnL = 0.9;
		CAPACITEENL = 1;
		estOuverte = true;
	}
	
	// constructeur avec parametre
	public Bouteille(String _nom, double _contenanceEnL, double _CAPACITEENL, boolean _estOuverte)
	{
		this.nom = _nom;
		this.contenanceEnL = _contenanceEnL;
		this.CAPACITEENL = _CAPACITEENL;
		this.estOuverte = _estOuverte;
	}
	public double getContenanceEnL()
	{
		return contenanceEnL;
	}
	public boolean getOuveture()
	{
		return estOuverte;
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
			contenanceEnL = CAPACITEENL;
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
	
	public double remplir(double _changement)
	{
		//double changement;
		if(estOuverte && contenanceEnL != CAPACITEENL)
		{
			//System.out.println("Combien voulez vous rajouter de litre?");
			//_changement = sc.nextDouble();
			if(_changement + contenanceEnL <= CAPACITEENL)
			{
				contenanceEnL = contenanceEnL + _changement;
			}
			else
			{
				System.out.println("ca fera trop.");
			}
		}else if (!estOuverte)
		{
			System.out.println("Ouvrez d'abord la bouteille");
		}
		else if (contenanceEnL == CAPACITEENL)
		{
			System.out.println("La bouteille est pleine");
		}
		return contenanceEnL;
	}
	
	public double vider(double _changement)
	{
		//double changement;
		if(estOuverte && contenanceEnL != 0)
		{
			//System.out.println("Combien voulez vous rajouter de litre?");
			//_changement = sc.nextDouble();
			if(_changement + contenanceEnL > 0)
			{
				contenanceEnL = contenanceEnL - _changement;
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
