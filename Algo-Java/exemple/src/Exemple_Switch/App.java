package Exemple_Switch;

import java.util.Scanner;

public class App {

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
					switch(jourDeLaSemaine)
					{
					case 3:
						System.out.println("Vous avez droit à une reduction de 50%");
						break;
					case 4:
						System.out.println("Vous avez droit à une reduction de 20%");
						break;
					default :
						System.out.println("Vous n'avez pas droit à une reduction");
					}
					/*
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
					}*/
				}
				else
				{
					System.out.println("Vous n'avez pas droit à une reduction");
				}
				
				sc.close();

	}

}
