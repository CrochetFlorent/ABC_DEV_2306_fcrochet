package Exercice2_7;

import java.util.Scanner;

public class App_Correction {

	public static void main(String[] args) {
		
		/*
		 variables
	kilometre est un reel
	miles est un reel
	fermeture_prog est un booleen
	quit est une chaine de caractere
	saisieutilisateur est une chaine de caractère

	debut du programme

	quit <-- "q"

	debut tant que
	tant que fermeture_prog est faux
	faire
	ecrire "entrez le nombre de kilometres
	lire <-- saisieUtilisateur
		debut si 
		si saisieUtilisateur est egale à quit
		alors fermeture_prog est vrai
		sinon
			kilometre <-- conversion en reel de saisieUtilisateur 
			si kilometre est < a 0.01 ou > a 1 milion
			alors
		 	ecrire "saisie invalide, saisissez une valeur comprise en 0.01 et 1 million"
			lire <-- saisieUtilisateur
			sinon
			miles = kilometre/1.609
			ecrire kilometre + " kilometre donne " + miles + " miles"
			Fin si
		fin si
	fin tant que
	fin du programme
		 */
		
		
		double kilometre = 0;
		double miles = 0;
		boolean fermeture_prog = false;
		boolean isNumeric = true;
		String quit;
		String saisieUtilisateur;
		
		Scanner sc = new Scanner(System.in);
		
		quit = "q";
		
		while (!fermeture_prog)
		{
			System.out.println("veuillez saisir le nombre de kilometres ou q pour quitter");
			saisieUtilisateur = sc.next();
				if (saisieUtilisateur.equals(quit))
				{
					fermeture_prog = true;
				}
				else
				{
					for(int i = 0; i < saisieUtilisateur.length(); i++)
					{
						if(!Character.isDigit(saisieUtilisateur.charAt(i)))
						{
							isNumeric = false;
						}
						else
						{
							isNumeric = true;
						}
					}
					if(isNumeric)
					{
						kilometre = Double.parseDouble(saisieUtilisateur);
						if(kilometre < 0.01 || kilometre > 1000000)
						{
							System.out.println("saisie invalide, saisissez une valeur comprise en 0.01 et 1 million ou q pour quitter");
							saisieUtilisateur = sc.next();
						}
						else 
						{
							miles = kilometre / 1.609;
							miles =Math.round(miles* 100.0)/100.0;
							System.out.println(kilometre + " kilometre donne " + miles + " miles");
						}
					}
					
				}	
		}
		sc.close();
	}
	}

