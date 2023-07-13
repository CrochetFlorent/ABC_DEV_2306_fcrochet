package Exo_Conditions_9_v1;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		/*
		 Variables 
		jour, mois, annee, jourMax sont des entiers
		jourValide, moisValide, estBissextille sont des booleens
	Debut du programme
		Ecrire "Saisir le numero du jour"
		Lire jour
		Ecrire "Saisir le numero du mois"
		Lire mois
		Ecrire "Saisir l'annee"
		Lire annee
		
		estBissextille <-- annee%400 = 0 OU (annee%100 != 0 ET annee%4 = 0)
		jourMax <-- 0
		moisValide <-- mois >= 1 ET mois <= 12
	Debut Si
		Si moisValide
		Alors
		Debut Si
			Si mois = 2 et estBissextille
			Alors jourMax <-- 29
			Sinon Si mois = 2
			Alors jourMax <-- 28
			Sinon Si mois = 4 
				OU mois = 6
				OU mois = 9
				OU mois = 11
			Alors jourMax <-- 30
			Sinon jourMax <-- 31
		Fin Si
		jourValide <-- jour >= 1 ET jour <= jourMax
	Fin Si
	Debut Si
		Si jourValide = vrai ET moisValide = vrai
		Alors Ecrire "La date est valide"
		Sinon Ecrire "La date n'est pas valide"
	Fin Si
	Fin du programme
		 */
		
		int jour, mois, annee, jourMax;
		boolean jourValide, moisValide, estBissextille;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Saisir le numero du jour : ");
		jour = sc.nextInt();
		System.out.println("Saisir le numero du mois : ");
		mois = sc.nextInt();
		System.out.println("Saisir l'annee : ");
		annee = sc.nextInt();
		
		estBissextille = annee%400 == 0 || (annee%100 != 0 && annee%4 == 0);
		jourMax = 0;
		moisValide = mois >= 1 && mois <= 12;
		
		if(mois == 2 && estBissextille)
		{
			jourMax = 29;
		}
		else if(mois == 2)
		{
			jourMax = 28;
		}
		else if(mois == 4 ||  mois == 6 || mois == 9 || mois == 11)
		{
			jourMax = 30;
		}
		else
		{
			jourMax = 31;
		}
		
		jourValide = jour >= 1 && jour <= jourMax;
		
		if(jourValide && moisValide)
		{
			System.out.println("Date Valide");
		}
		else
		{
			System.out.println("Date Invalide");
		}
		
		sc.close();

	}

}
