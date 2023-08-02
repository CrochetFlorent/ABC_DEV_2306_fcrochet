package Exo3_Procédures_Fonctions;

import java.util.Scanner;

public class App {

	/*
	 Fonction
	 		estDivisible(booleen estDivisible)
	 			nb1,nb2 sont des entiers
	 			
	 			
	 			Ecrire "Entrer un nombre entier"
	 			Lire nb1
	 			Ecrire "Entrer un deuxième nombre entier"
	 			Lire nb2
	 			
	 			Si le reste de nb1 / nb2 est égale à 0 alors
	 				estDivisible est égale à vrai
	 			Sinon
	 				estDivisible est égale à faux
	 			Fin si
	 			Retourne estDivisible
	 */
	public static boolean estDivisible(boolean estDivisible)
	{
		Scanner sc = new Scanner(System.in);
		
		int nb1,nb2;
		
		System.out.println("Entrer un nombre entier.");
		nb1 = sc.nextInt();
		System.out.println("Entrer un autre nombre entier.");
		nb2 = sc.nextInt();
		
		if(nb1 % nb2 == 0)
		{
			estDivisible = true;
		}
		else
		{
			estDivisible = false;
		}
		sc.close();
		return estDivisible;
	}
	
	public static void main(String[] args) {
		
		/* Variables
		 		_estDivisible est un booléen
		 	Debut programme
		 		On apelle la fonction estDivisible par le biais le la variable estDivisible
		 */
		
		boolean _estDivisible = false; 
		
		System.out.println(estDivisible(_estDivisible));

	}

}
