package Exo_Conditions_9_v2;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		/*
		  Variables 
		jour, mois, annee sont des entiers
		
	Debut du programme
		Ecrire "Saisir le numero du jour"
		Lire jour
		Ecrire "Saisir le numero du mois"
		Lire mois
		Ecrire "Saisir l'annee"
		Lire annee
		
		Debut Si
		Si mois < 1 OU mois > 12
		Alors Ecrire "Date invalide"
		Sinon Si mois = 2
		Alors
		Debut Si
			Si annee%400 = 0
				Alors
				Debut Si
					Si jour < 1 OU jour > 29
					Alors Ecrire "Date invalide"
					Sinon Ecrire "Date valide"
				Fin Si
			Sinon Si annee%100 = 0
				Alors
				Debut Si
					Si jour < 1 OU jour > 28
					Alors Ecrire "Date invalide"
					Sinon Ecrire "Date valide"
				Fin Si
			Sinon Si annee%4 = 0
				Alors
				Debut Si
					Si jour < 1 OU jour > 29
					Alors Ecrire "Date invalide"
					Sinon Ecrire "Date valide"
				Fin Si
			Sinon
				Debut Si
					Si jour < 1 OU jour > 28
					Alors Ecrire "Date invalide"
					Sinon Ecrire "Date valide"
				Fin Si
		Fin Si
	Sinon Si mois = 4 OU mois = 6 OU mois = 9 OU mois = 11 
		Alors
		Debut Si
			Si jour < 1 OU jour > 30
			Alors Ecrire "Date invalide"
			Sinon Ecrire "Date valide"
		Fin Si
	Sinon
		Debut Si
			Si jour < 1 OU jour > 31
			Alors Ecrire "Date invalide"
			Sinon Ecrire "Date valide"
		Fin Si
	Fin Si
	Fin du programme
		 */
		
int jour, mois, annee;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Saisir le numero du jour : ");
		jour = sc.nextInt();
		System.out.println("Saisir le numero du mois : ");
		mois = sc.nextInt();
		System.out.println("Saisir l'annee : ");
		annee = sc.nextInt();
		
		if(mois < 1 || mois > 12)
		{
			System.out.println("Date invalide");
		}
		else if(mois == 2)
		{
			if(annee%400 == 0)
			{
				if(jour < 1 || jour > 29)
				{
					System.out.println("Date Invalide");
				}
				else
				{
					System.out.println("Date Valide");
				}
			}
			else if(annee%100 == 0)
			{
				if(jour < 1 || jour > 28)
				{
					System.out.println("Date Invalide");
				}
				else
				{
					System.out.println("Date Valide");
				}
			}
			else if(annee%4 == 0)
			{
				if(jour < 1 || jour > 29)
				{
					System.out.println("Date Invalide");
				}
				else
				{
					System.out.println("Date Valide");
				}
			}
			else
			{

				if(jour < 1 || jour > 28)
				{
					System.out.println("Date Invalide");
				}
				else
				{
					System.out.println("Date Valide");
				}
			}
		}
		else if(mois == 4 || mois == 6 || mois == 9 || mois == 11)
		{
			if(jour < 1 || jour > 30)
			{
				System.out.println("Date Invalide");
			}
			else
			{
				System.out.println("Date Valide");
			}
		}
		else
		{
			if(jour < 1 || jour > 31)
			{
				System.out.println("Date Invalide");
			}
			else
			{
				System.out.println("Date Valide");
			}
		}
		sc.close();
	}

}
