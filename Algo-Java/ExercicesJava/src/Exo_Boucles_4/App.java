package Exo_Boucles_4;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		/*
		 Variables
		 	nombre est un entier
		 	somme est un entier
		 
		 Debut du Programme
		 	Ecrire "Entrer un nombre."
		 	somme <-- 0
		 	
		 	Pour i de 1 à nombre faire
		 		somme = somme + i
		 		i++
		 	Fin pour
		 	 Ecrire "La somme de chaque nombre de 1 au nombre saisi est ",somme
		 Fin du Programme
		 		
		 */
		
		int nombre,somme = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entrer un nombre.");
		nombre =sc.nextInt();

				
		for (int i = 1;i <= nombre;i++)
		{
			somme = somme+i;
		}
		
		System.out.println("La somme de chaque nombre de 1 au nombre saisi est "+somme);
		
		sc.close();
	}

}
