package Exercice_Tableaux_7;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
	/*
	  Variables
	  		tab1 est un tableau de réels
	  		tab2 est un tableau de réels
	  		saisie est un réel
	  		taille est un entier
	  	
	  Début du Programme
	  
	  		taille = 0
	  		
	  		Ecrire "Combien de valeurs voulez vous entrer?"
	  		Lire taille
	  		
	  		Pour i de 0 à taille-1 faire
	  			Ecrire "Entrer une valeur"
	  			Lire saisie
	  			tab1[i] = saisie
	  			tab2[i] = saisie +1
	  			Ecrire "Pour ",tab1[i]," l'autre valeur vaut ",tab2[i]
	  		Fin pour

	Fin du programme
	  			
	 */

		double saisie = 0;
		int taille;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Combien de valeurs voulez vous entrer?");
		taille = sc.nextInt();
		
		double[] tab1 = new double[taille];
		double[] tab2 = new double[taille];
		
		for (int i=0;i<taille;i++)
		{
			System.out.println("Entrer une valeur");
			saisie = sc.nextDouble();
			
			tab1[i] = saisie;
			tab2[i] = saisie +1;
			System.out.println("Pour "+tab1[i]+" l'autre vaut "+tab2[i]);
		}
		// La méthode des deux tableaux est bien si l'on veut stocker toutes les valeurs
		// mais sinon on peut afficherles valeurs avec +1 sans les stocker au fur et à mesure du for
		
		sc.close();	
		}
}
