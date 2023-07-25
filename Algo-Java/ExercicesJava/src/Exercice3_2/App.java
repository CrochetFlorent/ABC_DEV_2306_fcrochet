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
		 	
		 	tant que somme > 2 faire
		 		somme <-- (somme)-1 
		 		magasin <-- magasin + 1
		 	fin tant que
		 	
		 	magasin <-- magasin +1
		 	
		 	Ecrire "Le nombre de magasin ou barnabé à dépensé des sous est ",magasin
		 	
		 Fin du programme
		 	
		 */

		double somme;
		int magasin = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entrer la somme de départ.");
		somme =sc.nextDouble();
		
		if(somme >= 1)
		{
			while(somme > 2)
			{
				somme= (somme/2)-1;
				magasin +=1;		
			}
	
				magasin += 1;
		}
		else
		{
			System.out.println("Barnabé est allé dans aucun magasins");
		}
		
		System.out.println("Le nombre de magasins ou barnabé a acheté est "+magasin);
		
		sc.close();
	}

}
