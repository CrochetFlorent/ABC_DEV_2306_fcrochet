package Exercice_Tableaux_8;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		/*
	 	Variables
	 		tab est un tableau d'entier
	 		saisie est un entier
	 		taille est un entier
	 		plusGrand est un entier
	 		
	 	 Debut du Programme
	 	 	Ecrire "Combien de valeurs voulez vous rentrer?"
	 	 	Lire taille
	 	 	
	 	 	Pour i de 0 à taille -1 faire
	 	 		Ecrire "Entrer un nombre entier."
	 	 		Lire saisie
	 	 		tab[i] = saisie
	 	 	Fin pour
	 	 	
	 	 	plusGrand = tab[0]
	 	 	
	 	 	Pour i de 1 à taille -1 faire
	 	 		Si tab[i] > tab[i-1] alors
	 	 			plusGrand = tab[i]
	 	 		Fin si
	 	 	Fin pour
	 	 	
	 	 	Ecrire "Le nombre le plus grand de la saisie est ",plusGRand
	 */	
	
	int saisie,taille,plusGrand;
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Entrer le nombre de valeurs que vous voulez saisir:");
	taille = sc.nextInt();
	
	int[] tab = new int[taille];
	
	for (int i = 0;i<taille;i++)
	{
		System.out.println("Entrer un nombre entier");
		saisie = sc.nextInt();
		tab[i] = saisie;
	}
	plusGrand = tab[0];
	
	for (int i=1; i<taille; i++)
	{
		if (tab[i] > tab[i-1])
		{
			plusGrand = tab[i];
		}
	}
	
	System.out.println("Le nombre le plus grans de la saisie est "+plusGrand);
	
	sc.close();
	}

}
