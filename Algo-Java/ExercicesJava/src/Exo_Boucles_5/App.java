package Exo_Boucles_5;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
	
		/*
		 Variables
		 	nombre est un entier
		 	facteur est un entier
		 Debut du Programme
		 	Ecrire "Entrer un nombre."
		 	Lire <-- nombre
		 	
		 	fecteur <-- 1
		 	
		 	Pour i de 1 à nombre faire
		 		facteur = facteur x i
		 	fin pour
		 	
		 	Ecrire "La factorielle de ",nombre," est : ",facteur
		 Fin du Programme
		 */
		
		int nombre = 0,facteur;
		boolean test = false;
		String str;
		
		Scanner sc = new Scanner(System.in);
		
		do 
		{
			System.out.println("Entrer un nombre.");
			
			
			if (sc.hasNextInt())
			{
				nombre = sc.nextInt();
				test = true;
				facteur = 1;
				
				for (int i=1;i<=nombre;i++)
				{
					facteur = facteur * i;
				}
				
				System.out.println("La factorielle de "+nombre+" est : "+facteur);
			}
			else
			{
				str = sc.next();
				System.out.println("Erreur de saisie");
			}
			
		}while (test == false);
			
		sc.close();
		
	}

}
