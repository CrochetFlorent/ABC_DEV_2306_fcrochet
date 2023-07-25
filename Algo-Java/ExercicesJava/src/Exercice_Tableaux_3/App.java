package Exercice_Tableaux_3;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
	
		/*
		 Variables
		 	tab est un tableau d'entiers
		 	valeur est un entier
		 	nbValeurs est un entier
		 	nbPos est un entier
		 	nbNeg est un neiter
		 	
		 Debut du Programme
		 	Ecrire "Entrer le nombre de valeurs que vous voulez saisir."
		 	Lire nbValeurs
		 	
		 	nbPos <-- 0
		 	nbNeg <-- 0
		 	
		 	Pour i de 0 à nbValeurs -1 faire
		 		Ecrire "Entrer la valeur nuéméro ",i+1
		 		Lire valeur
		 		tab[i] = valeur
		 			Si valeur > 0 alors
		 				nbPos ++
		 			Sinon si valeur <0 alors
		 				nbNeg++
		 			Fin si
		 	Fin pour
		 	 Ecrire "Il y a ",nbPos," valeur positives et ",nbNeg," valeurs négatives"
		 */
		int nbValeurs,nbNeg = 0,nbPos = 0,valeur;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Combien de valeurs voulez vous entrer?");
		nbValeurs = sc.nextInt();
		
		int[] tab = new int[nbValeurs];
		
		for (int i=0;i<=nbValeurs -1;i++)
		{
			System.out.println("Entrer la valeur numéro"+(i+1));
			valeur = sc.nextInt();
			tab[i] = valeur;
			if(valeur > 0)
			{
				nbPos++;
			}else if (valeur <0 )
			{
				nbNeg ++;
			}
		}
		System.out.println("Il y a "+nbPos+" valeur positives et "+nbNeg+" valeurs négatives.");
		
		sc.close();
	}

}
