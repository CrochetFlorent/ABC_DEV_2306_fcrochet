package Exo4_Procédures_Fonctions_v2_Correction;

import java.util.Random;
import java.util.Scanner;

public class App {

	/*
	FONCTION entier nbAleatoire(entier min, entier max)
		entier nombre
		nombre <-- est generer aleatoirement
		retourner nombre
	Fin Fonction
	VARIABLES
		nombreMystere est un entier
		nbJoueur est un entier
		nbOrdi est un entier
		max est un entier
		min est un entier
		essai est un entier
	CONSTANTE
		nbEssaiMax = 6

	DEBUT DU PROGRAMME
		essai <-- 0
		min <-- 0
		max <-- 100
		nombreMystere <-- nbAleatoire(min,max)
		Debut boucle
		tant que nombreMystere est different de nbJoueur 
					ET nombreMystere est different de nbOrdi 
					ET essai est infèrieur à nbEssaiMax
		Faire
			Ecrire "Saisir un nombre entre ", min," et ",max
			Lire nbJoueur
			nbOrdi <-- nbAleatoire(min,max)
			essai++
			Debut si
				si nbJoueur egale nombreMystere
					Ecrire "Le joueur humain à gagner en ",essai
				sinon
					Debut si
						si nbJoueur < nombreMystere
							Ecrire "C'est plus"
							min <-- nbJoueur
						Sinon
							Ecrire "C'est moins"
							max <-- nbJoueur+1
					Fin SI
			Fin Si
			Debut Si
				si nbOrdi egale nombreMystere
					Ecrire "L'ordi à gagner en ",essai
				sinon
					Debut Si
						si nbOrdi > nombreMystere
							Ecrire "Le nombre choisit par l'ordi est trop grand"
							Debut si 
								Si max > nbOrdi
								max <-- nbOrdi 
							Fin Si
						Sinon
							Ecrire "Le nombre choisit par l'ordi est trop petit"
							Debut Si
								Si min < nbOrdi
								min <-- nbOrdi 
							Fin Si
						Fin Si
			Fin Si
		Fin tant que
		Debut Si 
			Si essai egale nbEssaiMax
				Debut Si
					Si nombreMystere different de nbJoueur
					Ecrire "Le joueur humain a perdu"
				Fin Si
				Debut Si
					Si nombreMystere different de nbOrdi
					Ecrire "L'ordi a perdu
				Fin si
		Fin Si
	Fin du programme

	 */
		public static int nbAleatoire(int min, int max)
		{
			int nombre;
			Random random = new Random();
			nombre = random.nextInt(100)+1;
			return nombre;
		}
		public static void main(String[] args) 
		{
		
	// Déclaration des variables
		int nombreMystere;
		int nbJoueur;
		int nbOrdi;
		int max;
		int min;
		int essai;
		String rejouer;
		
		final int nbEssaiMax = 6;		
		
		Scanner sc = new Scanner(System.in);
		do {
			essai = 0;
			min = 0;
			max = 100;
			nbJoueur= -1;
			nbOrdi= -1;
			nombreMystere = nbAleatoire(min,max);
			
			System.out.println(nombreMystere);
			while(nombreMystere != nbJoueur && nombreMystere != nbOrdi && essai < nbEssaiMax)
			{
				
				System.out.println("Saisir un nombre compris entre "+min+" et " +max);
				nbJoueur = sc.nextInt();
				nbOrdi = nbAleatoire(min,max);
				System.out.println(nbOrdi);
				essai++;
				
					if(nbJoueur == nombreMystere) 
					{
						System.out.println("Le joueur humain à gagner en "+essai);
					}
					else 
					{
						if(nbJoueur < nombreMystere)
						{
							System.out.println("C'est plus");
							min = nbJoueur;
						}
						else
						{
							System.out.println("C'est moins");
							max = nbJoueur;
						}
					}	
					if(nbOrdi == nombreMystere) 
					{
						System.out.println("L'ordi à gagner en "+essai);
					}
					else 
					{
						if(nbOrdi > nombreMystere)
						{
							System.out.println("Le nombre choisit par l'ordi est trop grand");
							if(max > nbOrdi)
							{
								max = nbOrdi;
							}
							
						}
						else
						{
							System.out.println("Le nombre choisit par l'ordi est trop petit");
							if(min < nbOrdi)
							{
								min = nbOrdi;
							}
						}
					}				
			} 
			if (essai == nbEssaiMax )
			{
				System.out.println("Le nombre d'essais maximum à été atteint (6).");
			}
			System.out.println("Voulez vous rejouer ? Oui(O)(o) ou n'importe quelle touche pour arrêter");
			rejouer = sc.next();
		}while(rejouer.equals("O") || rejouer.equals("o") );
		sc.close();
	}

}
