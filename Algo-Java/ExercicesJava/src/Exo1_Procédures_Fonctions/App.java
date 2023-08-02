package Exo1_Procédures_Fonctions;

import java.util.Scanner;

public class App {
	/*
	Procédure
			Pourcentage
				inCd,inChq,inVir et nbPaiements sont des réels
				
				Ecrire"Entrer le nombre de paiement à la carte bleue."
				Lire inCb
				Ecrire"Entrer le nombre de paiement par chèques."
				Lire inChq 
				Ecrire"Entrer le nombre de paiement par virements."
				Lire inVir 
				
				nbPaiements <-- inCb + inChq + inVir
				
				Ecrire "Le pourcentage de paiements par carte bleue est : ",((inCb / nbPaiements)*100),
				" ,le pourcentage de paiements par chèques est : ",((inChq / nbPaiements)*100),
				" et le pourcentage de paiements par virement est : ",((inVir / nbPaiements)*100)
	Fin Procédure
	
	 */		
	public static void Pourcentage()
	{
		double inCb,inChq,inVir,nbPaiements;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entrer le nombre de paiement à la carte bleue.");
		inCb = sc.nextInt();
		System.out.println("Entrer le nombre de paiement par chèques.");
		inChq = sc.nextInt();
		System.out.println("Entrer le nombre de paiement par virement.");
		inVir = sc.nextInt();
		
		nbPaiements = inCb + inChq + inVir;
		
		System.out.println( "Le pourcentage de paiements par carte bleue est : "+((inCb / nbPaiements)*100)+
				" ,le pourcentage de paiements par chèques est : "+((inChq / nbPaiements)*100)+
				" et le pourcentage de paiements par virement est : "+((inVir / nbPaiements)*100));
		
		sc.close();	
	}
	
	public static void main(String[] args) {
		
		// On appelle la procédure
		Pourcentage();

	}

}
