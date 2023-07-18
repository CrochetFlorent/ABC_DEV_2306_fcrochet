package Exo_Boucles_1;

import java.util.Random;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
/*
	Variables
		nombreSaisi est un entier
		nombreGenere est un entier
		
	Debut du Programme
		nombreGenere <-- Generer un nombre entre 1 et 3
		
		Ecrire "Saisissez un nombre entre 1 et 3"
		Lire <-- nombreSaisi
		
		Tant que nombreSaisi est différent de nombreGenere faire
			Si nombreSaisi != nombreGenere
				Ecrire "Saisir un autre nombre"
				Lire <-- nombreSaisi
			Fin si
			Ecrire "Vous avez trouvé."
		Fin tant que
	Fin du Programme
	
	PS : mauvaise interpretation de l'énnoncé
		
 */

		int nombreSaisi,nombreGenere;
		
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		
		nombreGenere = rand.nextInt(3 - 1)+1;
		
		System.out.println("Entrer un nombre entre 1 et 3.");
		nombreSaisi = sc.nextInt();
		
		while (nombreGenere != nombreSaisi)
		{
			//System.out.println(nombreGenere);
			
				System.out.println("Mauvaise réponse, essayez encore.");
				nombreSaisi = sc.nextInt();

		}
		
		System.out.println("Vous avez trouvé.");
		
		sc.close();
	}

}
