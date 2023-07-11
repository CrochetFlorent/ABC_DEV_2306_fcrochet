package Exo_Conditions_2;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

	/*
	 Variables
	 	a est un double
	 	b est un double
	 	
	 Debut du programme
	 
	 	Ecrire "Entrer un nombre."
	 	Lire <-- a
	 	
	 	Ecrire "Entrer un deuxième nombre."
	 	Lire <-- b
	 	
	 	Si (a>0 et b>0) ou (a<0 et b<0) alors
	 		Ecrire "Le produit est positif"
	 		
	 	Sinon si a=0 ou b=0 alors
	 		Ecrire "Le produit est nul."
	 		
	 	Sinon a<0 ou b<0 alors
	 		Ecrire "Le produit est négatif."
	 	Fin si
	 	
	 Fin du programme	
	 */
		
		double a,b;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entrer un nombre.");
		a = sc.nextDouble();
		
		System.out.println("Entrer un nombre.");
		b = sc.nextDouble();
		
		if (a>0 && b>0 || a<0 && b<0)
		{
			System.out.println("Le produit est positif.");
		}
		else if (a==0 || b==0)
		{
			System.out.println("Le produit est nul.");
		}
		else 
		{
			System.out.println("Le produit est négatif");
		}
		
		sc.close();
	}

}
