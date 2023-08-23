package Bouteille;

import java.util.Scanner;

public class Bouteille {

	
	private boolean ouverte ;
	private boolean pleine ;
	private String nom;
	private double contenance;
	private String choix;
	private double capacite;
	private double volume;
	private boolean fin;
	
	public Bouteille()
	{
		ouverte = false;
		pleine = false;
		contenance = 0;
		
	}
	public Bouteille(boolean _ouverte,boolean _pleine,double _capacite,String _nom)
	{
		ouverte = _ouverte;
		pleine = _pleine;
		capacite = _capacite;
		nom = _nom;
	}

	public boolean Ouvrir()
	{
		if(ouverte == false)
		{
			ouverte = true;
		}
			return ouverte;
	}
	public boolean Fermer()
	{
		if (ouverte == true)
		{
			ouverte = false;
		}
			return ouverte;
	}

	public double RemplirVider()
	{
		Scanner sc = new Scanner(System.in);
			do{
				if(contenance != capacite)
					{
						System.out.println("Rajouter du liquide dans la bouteille? o pour oui");
						choix = sc.next();
						if (choix.equals("o") == true)
						{
							System.out.println("De combien voulez vous remplir la bouteille?");
							volume = sc.nextDouble();
							contenance = contenance + volume; 
						}
						else
						{
							this.Fermer();
						}
					}
								
				if (contenance != 0)
				{
					System.out.println("Enlever du liquide dans la bouteille? o pour oui");
					choix = sc.next();
					if (choix.equals("o") == true)
					{
						System.out.println("De combien voulez vous vider la bouteille?");
						volume = sc.nextDouble();
						contenance = contenance - volume;
					}
				}
				else
				{
					this.Fermer();
				}
				if (contenance == 0)
				{
				System.out.println("Voulez vous rajouter du liquide dans la bouteille?");
				choix = sc.next();
				}
				else if (contenance == capacite)
				{
					System.out.println("Voulez vous enlever du liquide dans la bouteille?");
					choix = sc.next();
				}
				
				if (choix.equals("o") == false)
				{
					fin = true;
				}
				
			}while(choix.equals("o") == true || fin == false);
		sc.close();
		return contenance;
	}
}
