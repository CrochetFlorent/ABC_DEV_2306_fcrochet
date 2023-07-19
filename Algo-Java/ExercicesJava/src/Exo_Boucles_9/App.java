package Exo_Boucles_9;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		/*
		 Variables
		 
		 	n est un entier
		 	p est un entier
		 	x est un réel
		 	y est un réel
		 
		 Début du Programme
		 	
		 	Ecrire "Entrer le nombre de chevaux partants."
		 	Lire <-- n
		 	Ecrire "Entrer le nombre de chevaux que vous voulez jouer."
		 	Lire <-- p
		 	
		 	x = n!/(n-p)!
		 	y = n!(p ! *(n-p)!)
		 	
		 	Ecrire "Vous avez ",x," chances dans l'ordre des gagner et ",y," dans le désordre"
		 	
		 Fin du Programme
		 */

		int n,p,x,y,factN = 1,factNP = 1,factP = 1;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entrer le nombre de chevaux partants");
		n = sc.nextInt();
		System.out.println("Entrer le nombre de chevaux que vous voulez jouer");
		p = sc.nextInt();
		
		//x = n! / (n-p)!  et y = n! /(p! * (n-p)! )
		for (int i=1;i<=n;i++)
		{
			factN = factN * i;
		}
		for (int i = 1; i < n-p;i++)
		{
			factNP = factNP * i;
		}
		for (int i=1;i<=p;i++)
		{
			factP = factP * i;
		}
		
		x = factN / factNP ;
		y = factN / (factP * factNP);
		
		System.out.println("Dans l'ordre 1 chance sur "+x+" de gagner et dans le désordre 1 chance sur "+y+ " de gagner.");
		sc.close();
	}

}
