package Jalon_algo_niveau2_FC;

import java.util.Scanner;

/*
 Variables
	estTilEtudiant est une chaine de caractères
	etudiant est un booleen
	jourDelaSemaine est un entier
Debut du programme
	ecrire "etes vous etudiant Oui(O ou o) ou Non(N ou n)"
	lire <-- estTilEtudiant
	Debut Si 
		Si estTilEtudiant egale O ou o
		Alors etudiant egale vrai
		Sinon etudiant egale faux
	Fin Si
	Debut Si
		Si etudiant egale vrai
		Alors ecrire "Quel jour de la semaine : 1 Lundi 2 Mardi 3 Mercredi 4 jeudi 5 Vendredi 6 Samedi"
			Lire <-- jourDeLaSemaine
			Debut Si
				Si jourDeLaSemaine est egale à 3
				Alors ecrire "Vous avez droit à une reduction de 50%"
				Sinon Si jourDeLaSemaine est egale à 4
				Alors ecrire "Vous avez droit à une reduction de 20%"
				Sinon ecrire "Vous n'avez droit à aucune reduction"
			Fin Si
		Sinon
		Ecrire "Vous n'avez droit à aucune reduction"
	Fin Si
Fin du programme
 */

public class Correction_App {

	public static void main(String[] args) {
		// declaration des variables
		String estTilEtudiant;
		boolean etudiant;
		int jourDeLaSemaine;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("etes vous etudiant Oui(O ou o) ou Non(N ou n)");
		estTilEtudiant = sc.next();
		if(estTilEtudiant.equals("O") || estTilEtudiant.equals("o"))
		{
			etudiant = true;
		}
		else
		{
			etudiant = false;
		}
		if(etudiant)
		{
			System.out.println("Quel jour de la semaine : \n1 Lundi 2 Mardi 3 Mercredi \n4 jeudi 5 Vendredi 6 Samedi");
			jourDeLaSemaine = sc.nextInt();
			if(jourDeLaSemaine == 3)
			{
				System.out.println("Vous avez droit à une reduction de 50%");
			}
			else if(jourDeLaSemaine == 4)
			{
				System.out.println("Vous avez droit à une reduction de 20%");
			}
			else
			{
				System.out.println("Vous n'avez pas droit à une reduction");
			}
		}
		else
		{
			System.out.println("Vous n'avez pas droit à une reduction");
		}
		
		sc.close();

	}

}
