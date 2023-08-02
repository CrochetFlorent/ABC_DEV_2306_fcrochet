package Exo2_Procédures_Fonctions;

import java.util.Scanner;

public class App {

	/*	Procédure
	 			plusGrand
	 				tailleTab,plusGrand,i sont des entiers
	 				
	 				Ecrire "Combien de valeur voulez vous dans votre tableau? Je vous donnerais la plus grande"
	 				Lire tailleTab
	 				tab est un tableau d'entier de taille tailleTab
	 				
	 				Ecrire "Entrer un nombre"
	 				lire Tab[o]
	 				
	 				Pour i de 1 à taillTab (plus petit que)
	 					Ecrire "Entrer un nombre"
	 					Lire tab[i]
	 					
	 					Si tab[i] > tab[i-i] alors
	 						plusGrand <-- tab[i]
	 					Fin si
	 				Fin pour
	 				Ecrire "Le plus grand nombre des nombres rentrés est ",plusGrand
	 	Fin procédure
	 						
	 			
	 
	 */
		
	public static void plusGrand()
	{
		Scanner sc = new Scanner(System.in);
		
		int tailleTab,plusGrand = 0,i;
		
		System.out.println("Combien de valeur voulez vous dans votre tableau? Je vous donnerais la plus grande");
		tailleTab = sc.nextInt();
		int[] tab = new int[tailleTab];
		
		System.out.println("Entrer un nombre");
		tab[0] = sc.nextInt();
		
		for (i=1;i<tailleTab;i++)
		{
			System.out.println("Entrer un nombre");
			tab[i] = sc.nextInt();
			
			if(tab[i]>tab[i-1])
			{
				plusGrand = tab[i];
			}
		}
		
		System.out.println("Le plus grand nombre des nombres rentrés est "+plusGrand);
		
		sc.close();

	}
	
	public static void main(String[] args) {
		
		//On apelle la procédure
		plusGrand();

	}

}
