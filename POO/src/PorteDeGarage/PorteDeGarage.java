package PorteDeGarage;

import java.util.Scanner;

public class PorteDeGarage {

	boolean estOuverte;
	boolean estPartOuverte;
	boolean estVerouillee;
	int ouverture;
	
	Scanner sc = new Scanner(System.in);
	
	public PorteDeGarage()
	{
		estOuverte = false;
		estPartOuverte = false;
		estVerouillee = true;
		ouverture = 0;
	}
	
	public PorteDeGarage(boolean _verouillee,boolean _ouverte,boolean _partOuverte,int _ouverture)
	{
		estOuverte = _ouverte;
		estPartOuverte = _partOuverte;
		estVerouillee = _verouillee;
		ouverture = _ouverture;
	}
	
	public int getOuverture()
	{
		return ouverture;
	}
	
	public void setOuverture(int _ouverture)
	{
		this.ouverture = _ouverture ;
	}
	
	public boolean Verouiller()
	{
		if(!estVerouillee && !estOuverte)
		{
			estVerouillee = true;
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean Deverouiller()
	{
		if(estVerouillee )
		{
			estVerouillee = false;
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean Ouvrir()
	{
		if (!estOuverte && !estVerouillee || estPartOuverte)
		{
			estOuverte = true;
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean Fermer()
	{
		if (estOuverte || estPartOuverte)
		{
			estOuverte = false;
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public int OuvrirPart(int _changement)
	{
		//int changement;
		if (!estOuverte && !estVerouillee || estPartOuverte)
		{
			//System.out.println("De combien voulez vous ouvrir votre porte?, une valeure trop grande ne changera rien");
			//_changement = sc.nextInt();
			while (ouverture + _changement < 100)
			{
				ouverture = ouverture + _changement;
				estPartOuverte = true;
			}
		}
		return ouverture;
	}
	
	public int FermerPart(int _changement)
	{
		//int changement;
		if (estPartOuverte || estOuverte)
		{
			//System.out.println("De combien voulez vous fermer votre porte?, une valeure trop grande ne changera rien");
			//_changement = sc.nextInt();
			while (ouverture - _changement >= 0)
			{
				ouverture = ouverture - _changement;
				estPartOuverte = true;
			}
		}
		return ouverture;
	}
}
