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
		return this.contenanceEnL;
	}
	public boolean getOuveture()
	{
		return this.estOuverte;
	}
	
	public void setContenanceEnL(double _contenanceEnL)
	{
		this.contenanceEnL = _contenanceEnL;	
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
		if (this.estOuverte)
		{
			if(this.contenanceEnL < this.CAPACITEENL)
			{

			this.contenanceEnL= this.CAPACITEENL;
			return true;
			}
			else
			{
				return false;
			}
		}
		else
		{
			return false;
		}
	}
	
	public boolean viderTout()
	{
		if (this.estOuverte)
		{
			if (this.contenanceEnL > 0)
			{
			this.contenanceEnL = 0;
			return true;
			}
			else 
			{
				return false;
			}
		}
		else
		{
			return false;
		}
	}
	
	public boolean remplir(double quantiteEnL)
	{
		//double changement;
		if(this.estOuverte && this.contenanceEnL != this.CAPACITEENL)
		{
			//System.out.println("Combien voulez vous rajouter de litre?");
			//_changement = sc.nextDouble();
			
			if(quantiteEnL + this.contenanceEnL <= this.CAPACITEENL)
			{
				this.contenanceEnL = this.contenanceEnL + quantiteEnL;
				return true;
			}
			else
			{
				System.out.println("ca fera trop.");
				return false;
			}
		}else if (!this.estOuverte)
		{
			System.out.println("Ouvrez d'abord la bouteille");
			return false;
		}
		else if (this.contenanceEnL == this.CAPACITEENL)
		{
			System.out.println("La bouteille est pleine");
			return false;
		}
		else
		{
			return false;
		}

	}
	
	public boolean vider(double _changement)
	{
		//double changement;
		if(this.estOuverte && this.contenanceEnL != 0)
		{
			//System.out.println("Combien voulez vous rajouter de litre?");
			//_changement = sc.nextDouble();
			
			contenanceEnL = contenanceEnL - _changement;
			return true;

		}else if (!this.estOuverte)
		{
			System.out.println("Ouvrez d'abord la bouteille");
			return false;
		}
		else if (this.contenanceEnL == 0)
		{
			System.out.println("La bouteille est vide");
			return false;
		}
		else
		{
			return false;
		}
	}
}
