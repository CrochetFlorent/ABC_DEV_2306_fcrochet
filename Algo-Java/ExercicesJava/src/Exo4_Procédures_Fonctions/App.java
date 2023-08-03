package Exo4_Procédures_Fonctions;

import java.util.Random;
import java.util.Scanner;

public class App {

	//Cette fonction génère un nombre entre deux variables : une minimum et une maximum
	
	//Quelques erreurs puisque quelques fois la fourchette n'est pas mise à jour, ou encore 'ordi gagne car mon choix 
	// au tour de jeu n' pas été pris en compte. De la même manière je crois que la borne de la fourchette
	
	
	/*	Fonction
	 		randomNb(entier a,entier b)
	 			nbAlea est un entier
	 			nbAlea <-- un nombre généré aléatoirement
	 			Retourne nbAlea
	 	Fin fonction
	 */
	
	public static int randomNb(int a,int b)
	{
		Random random = new Random();
		int nbAlea;		
		nbAlea = random.nextInt(a,b);	
		return nbAlea;	
	}
	
	public static void main(String[] args) {
		// Cette version partira du principe que les deux joueurs cherchent le même nombre
		
		/* Variables 
		 		rejouer est une chaîne de caractères
		 	
		 	Debut du Programme
		 	Faire
		 		i est un entier initialisés à 0
		 		minOrdi,minHumain sont des entiers initialisés à 1
		 		supOrdi,exSupOrdi sont des entiers initialisé à 0
		 		maxOrdi et maxHumain sont des entiers de valeur 100
		 		mystere et supHumain sont des entiers
		 		win est un booleen initialisés à faux
		 		
		 		Faire
		 			mystere <-- un nombre aléatoire entre 1 et 100
		 			supOrdi <-- un nombre aléatoire entre 1 et 100
		 			Faire
		 				supOrdi <-- un nombre aléatoire entre 1 et 100
		 			Tant que ce nombre est le même que le précédent généré(supOrdi est égale à exSupOrdi)
		 			Ecrire "Entrer une valeur entre ",minHumain," et ",maxHumain
		 			Lire supHumain
		 			Ecrire "Le nombre supposé par le joueur ordinateur est ",supOrdi
		 			Si supHumain est égale à mystere alors
		 				win <-- vrai
		 				gagnant <-- "humain"
		 			Sinon si supHumain est supérieur à mystère alors
		 				maxHumain <-- supHumain
		 			Sinon 
		 				minHumain<-- supHumain
		 			Fin si
		 			Si supOrdi est égale à mystere alors
		 				win <-- vrai
		 				gagnant <-- "l'ordinateur"
		 			Sinon si supOrdi est supérieur à mystère alors
		 				maxOrdi <-- supHumain
		 			Sinon 
		 				minOrdi<-- supHumain
		 				Si win est égale à faux alors
		 					Ecrire "L'ordinateur a supposé ",supOrdi,". Il doit trouver entre "
							,minOrdi," et ",maxOrdi,"." 
						Sinon
							Ecrire "L'ordinateur a supposé "+supOrdi+". Il devait trouver entre "
								+minOrdi+" et "+maxOrdi+"."
						Fin Si
					Fin si
					exSupOrdi <-- supOrdi
					i <-- i+1
				Tant que win est égale à faux
				Si supOrdi et supHumain sont égales à mystere alors
					Ecrire "Les deux joueurs ont gagnés en ",i," essais
				Sinon 
					Ecrire "Le gagnant est ",gagnant," en ",i," essais."
				Fin Si
				Ecrire "Voulez vous rejouer? "o" pour oui, n'importe qelle autre touche pour non"
				Lire rejouer
			Tant que rejouer est egale à "0"
		Fin du Programme
			
		 						
		 				
		 */
	
		String rejouer;
		Scanner sc = new Scanner(System.in);
		
		// premier do/while : demande si on veut recommencer le jeu une fois celui-ci fini
		do
		{
			int i = 0,minOrdi=1,maxOrdi=100,minHumain = 1, maxHumain = 100, exSupOrdi = 0,essaisMax = 6;
			String gagnant = "";
			int mystere,supHumain,supOrdi = 0;
			boolean win = false;
			
			mystere = randomNb(1,100);
			//System.out.println("Nombre cherché: "+mystere);
			
			//Deuxième do/while : test du gagnant
			do
			{	
				
				supOrdi = randomNb(minOrdi,maxOrdi);
				//On empeche ici l'ordinateur de générer un nombre egale à l'ancien généré
				do
				{
					supOrdi = randomNb(minOrdi,maxOrdi);
				}while(exSupOrdi == supOrdi);
				//On demande à l'humain de essayer/reessayer
				System.out.println("Entrer une valeur entre "+minHumain+" et "+maxHumain+".");
				supHumain =sc.nextInt();
				//On écrit le nombre généré par le joueur ordinateur
				System.out.println("Nombre supposé par l'ordi "+supOrdi+".");	
				// On test le nombre que l'humain à rentré et on lui creer une fourchette
				if (supHumain == mystere)
				{
					win = true;
					gagnant = "humain";	
				}
				else if (supHumain > mystere) 
				{	
					maxHumain = supHumain;			
				}
				else 
				{
					minHumain = supHumain;	
				}
				// On test le nombre généré par le joueur ordinateur et lui lui creer une fourchette
				if  (supOrdi == mystere )
				{
					win = true;
					gagnant = "l'ordinateur";
				}
				else if (supOrdi > mystere)
				{	
					maxOrdi = supOrdi;
					System.out.println("L'ordinateur a supposé "+supOrdi+". Il doit trouver entre "
							+minOrdi+" et "+maxOrdi+".");
				}
				else
				{
					minOrdi = supOrdi;
					// Quelqu'un à gagné?
					//Si non, le println est : l'Ordinateur DOIT trouver
					if (win == false)
					{
						System.out.println("L'ordinateur a supposé "+supOrdi+". Il doit trouver entre "
							+minOrdi+" et "+maxOrdi+".");
					}
					// Si oui, le println est : L'ordinateur DEVAIT trouver
					else
					{
						System.out.println("L'ordinateur a supposé "+supOrdi+". Il devait trouver entre "
								+minOrdi+" et "+maxOrdi+".");
					}
				}
				exSupOrdi = supOrdi;
				i++;	
			}while (win == false && i != essaisMax);
			// On test si les deux joueurs on trouvé en le même nombre de tours et on retourne le nombre de tours
			if (supHumain == mystere && supOrdi == mystere )
			{
				System.out.println("Les deux ont trouvé en "+i+" essais.");
			}
			// Sinon si il n'y a pas de gagnant c'est que le nombre d'essais max est atteint, on l'écrit
			else if (supHumain != mystere && supOrdi != mystere && essaisMax == 6)
			{
				System.out.println("Pas de gagnant en "+i+" essais.");
			}
			//Sinon on retourne le gagnant et le nombre d'essais
			else 
			{
				System.out.println("Le gagnant est "+gagnant+" avec "+i+" essais.");
			}
			//On demande si l'utilisateur veut rejouer
			System.out.println("Voulez vous rejouer? \"o\" pour oui, n'importe qelle autre touche pour non");
			rejouer = sc.next();
		}while(rejouer.equals("o"));
		
		sc.close();
	}
}

