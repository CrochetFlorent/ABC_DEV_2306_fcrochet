package Exo_Boucles_8;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
	/*
	 Variables
	 
	 	prix est un entier
	 	sommeDue est un entier
	 	sommePayee est un entier
	 	paye est un booleen
	 	
	 Debut du Programme 
	 	
		sommeDue <-- 0
		Faire
			Ecrire "Entrer un prix"
			Lire <-- Prix
			sommeDue = sommeDue +prix
		Tant que prix != 0 
		
		Si sommeDue > 0 alors
		
			Ecrire "Vous devez",sommeDue," , combien donnez vous?"
			Lire <-- sommePaye
		
			Tant que sommePayee < sommeDue faire
				Ecrire "Il manque, combien donnez vous en tout cette fois?"
				Lire <-- sommePayee
			Fin tant que
			
			Tant que paye est egal a faux faire
				
				Si sommePayee - sommeDue >=10 faire
					Ecrire "Rendu 10 euros"
				Sinon si sommePaye - sommeDue >= 5 faire
					Ecrire "Rendu 5 euros"
				Sinon si sommePaye - sommeDUe >= 1 faire
					Ecrire "Rendu 1 euros"
				Sinon
					paye <-- true
				Fin si
				
			Fin tant que
		Fin du Programme
	 */

		int prix,sommeDue,sommePayee,un = 0,cinq = 0,dix = 0;
		boolean paye= false;
		
		Scanner sc = new Scanner(System.in);
		
		sommeDue = 0;
		
		do
		{
			System.out.println("Entrer un prix");
			prix = sc.nextInt();
			sommeDue = sommeDue + prix;			
		}while(prix != 0);
		
		if (sommeDue > 0 )
		{
			System.out.println("Vous devez "+sommeDue+" ,comebien donnez vous?");
			sommePayee = sc.nextInt();
			
			while (sommePayee < sommeDue)
			{
				System.out.println("Il manque, combien donnez vous en tout cette fois?");
				sommePayee = sc.nextInt();
			}
			
			while (paye == false)
			{
				if (sommePayee - sommeDue >= 10)
				{
					dix = dix+1;
					sommePayee = sommePayee -10;
				}
				else if(sommePayee - sommeDue >= 5)
				{
					cinq=cinq+1;
					sommePayee = sommePayee -5;

				}
				else if(sommePayee - sommeDue >= 1)
				{
					un = un+1;
					sommePayee = sommePayee -1;
				}
				else
				{
					paye = true;
				}	
				
			}
			System.out.println("Vous avez payé "+dix+" fois 10 euros");
			System.out.println("Vous avez payé "+cinq+" fois 5 euros");
			System.out.println("Vous avez payé "+un+" fois 1 euros");
		}
		sc.close();
	}

}
