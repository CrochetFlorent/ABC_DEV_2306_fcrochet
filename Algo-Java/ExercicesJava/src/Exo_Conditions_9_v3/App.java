package Exo_Conditions_9_v3;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		/*
		 Variables 
		jour, mois, annee sont des entiers
		cas1, cas2, cas3, cas4, estBissextille sont des booleens
	Debut du programme
		Ecrire "Saisir le numero du jour"
		Lire jour
		Ecrire "Saisir le numero du mois"
		Lire mois
		Ecrire "Saisir l'annee"
		Lire annee
		estBissextille <-- (annee%4 = 0 ET annee%100 != 0) OU annee%400 = 0
		cas1 <-- (mois = 1 OU mois = 3 OU mois = 5 OU mois = 8 OU mois = 10 OU mois = 12) ET (jour >= 1 ET jour <= 31)
		cas2 <-- (mois = 4 OU mois = 6 OU mois = 9 OU mois = 11) ET (jour >= 1 ET jour >= 30)
		cas3 <-- mois = 2 ET estBissextille = vrai ET jour >= 1 ET jour <= 29
		cas4 <-- mois = 2 ET jour >= 1 ET jour <= 28
	Debut Si
		Si cas1 = vrai OU cas2 = vrai OU cas3 = vrai OU cas4 = vrai
		Alors Ecrire "Date valide"
		Sinon Ecrire "Date invalide"
	Fin Si
	Fin du programme
		 */
		
		int jour, mois, annee;
		boolean cas1, cas2, cas3, cas4, estBissextille;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Saisir le numero du jour : ");
		jour = sc.nextInt();
		System.out.println("Saisir le numero du mois : ");
		mois = sc.nextInt();
		System.out.println("Saisir l'annee : ");
		annee = sc.nextInt();
		
		estBissextille = (annee%4 == 0 && annee%100 != 0) || annee%400 == 0;
		cas1 = (mois == 1 || mois == 3 || mois == 5 || mois == 8 || mois == 10 || mois == 12) && (jour >= 1 && jour <= 31);
		cas2 = (mois == 4 || mois == 6 || mois == 9 || mois == 11) && (jour >= 1 && jour <= 30);
		cas3 = mois == 2 && estBissextille  && jour >= 1 && jour <= 29;
		cas4 = mois == 2 && jour >= 1 && jour <= 28;
		
		if(cas1 || cas2 || cas3 || cas4)
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
