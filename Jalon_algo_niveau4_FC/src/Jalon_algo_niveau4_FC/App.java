package Jalon_algo_niveau4_FC;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		int position,nb;
		long nbPrecedent,nbCourant,nbSuivant;
		String resultat;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("[La suite de Fibonacci]\n");
		
		do
		{
			System.out.println("Entrer le nombre de nombre de la suite de fibonacci que vous voulez afficher : \nAppuyer sur la touche 0 pour quitter le programme");
			nb = sc.nextInt();
			
			position = 2;
			resultat = "\t0\n\t1";
			nbPrecedent = 0;
			nbCourant = 1;
			if (nb != 0)
			{
				if (nb > 2)
				{
					while( position < nb)
					{
						nbSuivant = nbPrecedent + nbCourant;
						resultat = resultat+"\n\t"+nbSuivant;
						nbPrecedent = nbCourant;
						nbCourant = nbSuivant;
						position = position +1;
					}
				}
			else
			{
				nb = 2;
			}
			System.out.println("Les"+nb+" premiers nombres de la suite de Fibonacci sont \n\n"+resultat);
			System.out.print("\n"+nb+" nombres affichés");
			}
		}while(nb !=0);
		
		sc.close();
	}

}
