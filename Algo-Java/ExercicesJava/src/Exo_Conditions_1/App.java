package Exo_Conditions_1;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
	/*
	 Variables
	 	double nombre;
	 	
	 Debut du programme
	 	Ecrire "Entrer un nombre."
	 	Lire <-- nombre
	 	
	 	Si Nombre > 0 alors
	 		Ecrire "Le nombre est positif"
	 		
	 	Sinon si Nombre = 0
	 		Ecrire " Le nombre est égale a zéro"
	 		
	 	Sinon
	 		Ecrire "Le nombre est négatif"
	 	Fin si
	 Fin du programme
	 */

		double nombre;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entrer un nombre.");
		nombre = sc.nextDouble();
		
		if ( nombre > 0)
		{
			System.out.println("Le nombre est positif.");
		}
		else if ( nombre == 0)
		{
			System.out.println("Le nombre est égale à zéro");
		}
		else
		{
			System.out.println("Le nombre est négatif.");
		}
		sc.close();
	}

}
