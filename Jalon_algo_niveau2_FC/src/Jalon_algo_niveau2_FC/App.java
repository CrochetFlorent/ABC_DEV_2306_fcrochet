package Jalon_algo_niveau2_FC;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		String Etudiant,Mercredi,Jeudi;
		boolean estEtudiant,estMercredi,estJeudi;
		boolean Recommencer;

		Scanner sc = new Scanner(System.in);
		
		//do {
		System.out.println("Etes vous étudiant? O ou o pour oui N ou n pour non");
		Etudiant = sc.next();
		estJeudi = false;
		
		if (Etudiant.equals("O") || Etudiant.equals("o"))
		{
			estEtudiant = true;
		}
		else
		{
			estEtudiant = false;
		}
		
		if (estEtudiant)
		{ 
	
		
			System.out.println("Coupe le Mercredi? O ou o pour oui N ou n pour non");
			Mercredi = sc.next();
		
			if (Mercredi.equals("O") || Mercredi.equals("o"))
			{
				estMercredi = true;
			}
			else
			{
				estMercredi = false;
			}
			if (Mercredi.equals("N") || Mercredi.equals("n"))
			{
				System.out.println("Coupe le Jeudi? O ou o pour oui N ou n pour non");
				Jeudi = sc.next();
		
				if (Jeudi.equals("O") || Jeudi.equals("o"))
				{
					estJeudi = true;
				}
				else
				{
					estJeudi = false;
				}
			}
			
			if (estEtudiant && estMercredi)
			{ 
				System.out.println("Votre réduction est de 50%.");
			}
			else if (estEtudiant && estJeudi)
			{
				System.out.println("Votre réduction est de 20%.");
			}
		}
		else //if (estEtudiant == false)
		{
			System.out.println("Vous n'avez pas de réduction.");
		}
		//else ( Recommencer = true)
		//while( Recommencer = vrai)
		
			
		
		sc.close();
	
}
}
