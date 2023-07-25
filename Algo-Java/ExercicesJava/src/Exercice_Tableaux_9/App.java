package Exercice_Tableaux_9;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		/*
		 Variables
		 	moyenne est un réel
		 	nbPlusGrand est un entier
		 	saisie est un réel
		 	tab est un tableau d'entier de taille nbEleves
		 	nbEleves est un entier
		 
		 Debut du Programme
		 	Ecrire "Entrer le nombre d'élèves dans la classe."
		 	Lire nbEleves
		 	Ecrire "Entrer la moyenne de la classe"
		 	lire moyenne
		 	
		 	nbPlusGrand = 0
		 	
		 	Pour i de 0 à nbEleves -1 faire
		 		Ecrire "Entrer une note."
		 		Lire saisie
		 		tab[i] = saisie
		 		Si saisie > moyenne alors
		 			nbPlusGrand = nbPlusGrand +1
		 		Fin si
		 	Fin pour
		 	
		 	Ecrire "Il y a ",nbPlusGrand," eleves au dessus de la moyenne"
		 	
		 Fin duProgramme
		 */
			
		int nbEleves,nbPlusGrand;
		double moyenne,saisie;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entrer le nombre d'élèves dans la classe");
		nbEleves = sc.nextInt();
		System.out.println("Entrer la moyenne de la classe.");
		moyenne = sc.nextDouble();
		
		double[] tab = new double[nbEleves];
		nbPlusGrand = 0;
		
		for(int i = 0; i< nbEleves;i++ )
		{
			System.out.println("Entrer une note");
			saisie = sc.nextDouble();
			tab[i] = saisie;
			if(saisie > moyenne)
			{
				nbPlusGrand = nbPlusGrand +1;
			}
		}
		
		System.out.println("Il y a "+nbPlusGrand+" eleves au dessus de la moyenne.");
		
		sc.close();
	}

}
