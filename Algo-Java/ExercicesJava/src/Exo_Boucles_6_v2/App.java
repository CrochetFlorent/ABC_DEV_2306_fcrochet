package Exo_Boucles_6_v2;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		/*
		 Variables
		nombre est un entier
		plusGrand est un entier
		position est un entier
		i est un entier
	  Debut du programme
		plusGrand <-- 0
		position <-- 0
	  Debut pour
		pour i allant de 1 à 20
			Ecrire "Saisir un nombre"
			Lire nombre
		Debut Si
			Si i = 1 OU nombre > plusGrand
			Alors plusGrand <-- nombre
			      position <-- i
		Fin Si
		i suivant
	 Fin pour
		Ecrire "Le nombre le plus grand est : ",plusGrand
		Ecrire "Il a ete saisi en position numero : ",i
	 Fin du programme
		 */

			int nombre;
			int plusGrand;
			int position;
			int i;
			
			Scanner sc = new Scanner(System.in);
			
			plusGrand = 0;
			position = 0;
			
			for(i = 1; i <= 20; i++)
			{
				System.out.println("Saisir un nombre");
				nombre = sc.nextInt();
				if(i == 1 || nombre > plusGrand)
				{
					plusGrand = nombre;
					position = i;
				}
			}
			
			System.out.println("Le nombre le plus grand est : "+plusGrand);
			System.out.println("Il a ete saisi en position numero : "+position);
			sc.close();
	}

}
