package Exercice2_4;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		/*
		Variable
			Annee est un entier
		Debut du programme
			Ecrire " Entrez une année"
			Lire <-- Annee
			
			Si 
				Annee n'est pas divisible par 4
			Alors
				Ecrire "L'année n'est pas divisible par 4"
				 
			
			Sinon si 
				Annee est divisible par 100 et pas par 400
					
			Alors
				Ecrire "L'Année n'est pas bissextile"
				
			Sinon 
				Ecrire " L'année est bissextile"
			Fin si
		Fin du Programme
		 */
		
		int Annee;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Entrer une année");
		Annee = sc.nextInt();
		
		if ((Annee%4 != 0) ||( Annee % 4 == 0) && (Annee % 100 == 0 && Annee % 400 != 0))
		{	
			System.out.println("L'année n'est pas bissexctile");
		}
		else 
		{
			System.out.println ("L'année est bissextile");
		}

				
		sc.close();

	}

}
