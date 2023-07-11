package Exercice3_2;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		/*
		 Variables
		 
		 	somme est un double
		 	magasin est un entier
		 	
		 Debut du programme
		 	
		 	Ecrire "Entrer la somme de dépaart."
		 	Lire <-- Somme
		 	
		 	Faire
		 		somme <-- (somme)-1 
		 		magasin <-- magasin + 1
		 	Tant que somme est plus grand que 4
		 	
		 	magasin <-- magasin +1
		 	
		 	Ecrire "Le nombre de magasin ou barnabé à dépensé des sous est ",magasin
		 	
		 Fin du programme
		 	
		 */

		double somme;
		int magasin = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entrer la somme de départ.");
		somme =sc.nextDouble();
		
		do
		{
			somme= (somme/2)-1;
			magasin +=1;
			
		}while(somme >2);
		
		magasin += 1;
		
		System.out.println("Le nombre de magasins ou barnabé est passé est "+magasin);
		
		sc.close();
	}

}
