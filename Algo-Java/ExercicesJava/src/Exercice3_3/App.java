package Exercice3_3;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		/*
		 Variables 
		 	nnombre est un entier
		 	tab[] est un tableau de taille 10
		 	test est un booléen
		 
		 Début du programme
		 	
		 	Pour i de 0 à 9 faire
		 		tab[i] <-- i+1
		 	fin pour
		 	
		 	Ecrire "Entrer un nombre entier."
		 	Lire <-- nombre
		 	
		 	Pour i de 0 à 9 faire
		 		Si tab[i] = n
		 			Ecrire "Le nombre est dans le tableau en ",i+1,"ième place"
		 		fin si
		 		Sinon 
		 			test = vrai
		 		Fin si
		 		i++
		 	Fin pour
		 	Si test = vrai
		 		Ecrire "Error 404 no found"
		 	Fin si
		 Fin du programme
		 */

		int nombre = 0;
		int monTableau[ ] = new int[10];
		boolean test = true;
		
		Scanner sc = new Scanner(System.in);
		
		for (int i=0;i<=9;i++)
		{
			monTableau[i] = i+1;
		}
		
		System.out.println("Entrer un nombre entier");
		nombre = sc.nextInt();
		
		for (int i=0; i<9; i++)
		{
			if(monTableau[i] == nombre)
			{
				System.out.println("Le nombre est présent dans le tableau à la "+(i+1)+" ième place");
				test = false;
			}

		}
		if (test == true)
		{
			System.out.println("Error 404 no found");
		}
		sc.close();
	}

}
