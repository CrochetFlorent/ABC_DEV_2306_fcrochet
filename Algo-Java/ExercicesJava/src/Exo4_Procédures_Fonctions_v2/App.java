package Exo4_Procédures_Fonctions_v2;

import java.util.Random;
import java.util.Scanner;

public class App {

	//Cette fonction génère un nombre entre deux variables : une minimum et une maximum
	public static int randomNb(int a,int b)
	{
		Random random = new Random();
		int nbAlea;		
		nbAlea = random.nextInt(a,b);	
		return nbAlea;	
	}
	
	public static void main(String[] args) {
		// Cette version partira du principe que les deux joueurs cherchent le même nombre
	
		String rejouer;
		Scanner sc = new Scanner(System.in);
		
		// premier do/while : demande si on veut recommencer le jeu une fois celui-ci fini
		do
		{
			int i = 0,minOrdi=0,maxOrdi=100,minHumain = 0, maxHumain = 100, exSupOrdi = 0;
			String gagnant = "";
			int mystere,supHumain,supOrdi = 0;
			boolean win = false;
			mystere = randomNb(1,100);
			//System.out.println("Nombre cherché: "+mystere);
			supOrdi = randomNb(minOrdi,maxOrdi);
			
			//Deuxième do/while : test du gagnant
			do
			{
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
					if (win = false)
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
			}while (win == false);
			// On test si les deux joueurs on trouvé en le même nombre de tours et on retourne le nombre de tours
			if (supHumain == mystere && supOrdi == mystere )
			{
				System.out.println("Les deux ont trouvé en "+i+" essais.");
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
