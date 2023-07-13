package Exo_Conditions_8_v1;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		/*
		 Variables
		age, annePermis, nbAccident, anneAssurance sont des entiers
		condition1, condition2, condition3 sont des booleens
		situation est une chaine de caracteres
	Debut du programme
		Ecrire "Saisir l'age : "
		Lire age
		Ecrire "Saisir le nombre d'annees de permis"
		Lire annePermis
		Ecrire "Saisir le nombre d'accidents : "
		Lire nbAccident
		Ecrire "Saisir le nombre d'annees d'assurance : "
		Lire anneeAssurance
		condition1 <-- age >= 25
		condition2 <-- annePermis >= 2
		condition3 <-- anneAssurance > 5
	Debut Si
		Si condition1 = faux ET condition2 = faux
		Alors
			Debut Si
				Si nbAccident = 0
				Alors situation <-- "Rouge"
				Sinon situation <-- "Refuser"
			Fin Si
		Sinon Si (condition1 = faux ET condition2 = vrai) OU (condition1 = vrai ET condition2 = faux)
		Alors
			Debut Si
				Si nbAccident = 0
				Alors situation <-- "Orange"
				Sinon Si nbAccident = 1 
				Alors situation <-- "Rouge"
				Sinon situation <-- "Refuser"
			Fin Si
		Sinon
			Debut Si
				Si nbAccident = 0
				Alors situation <-- "Vert"
				Sinon Si nbAccident = 1
				Alors situation <-- "Orange"
				Sinon Si nbAccident = 2
				Alors situation <-- "Rouge"
				Sinon situation <-- "Refuser"
			Fin Si
	Fin Si
	Debut Si
		Si condition3 = vrai
		Alors 
			Debut Si
				Si situation = "Rouge"
				Alors situation <-- "Orange"
				Sinon Si situation = "Orange"
				Alors situation <-- "Vert"
				Sinon Si situation = "Vert"
				Alors situation <-- "bleu"
			Fin Si
	Fin Si
	Ecrire "Votre situation : ",situation
	Fin du programme
		 */
		
		int age, annePermis, nbAccident, anneAssurance;
		boolean condition1, condition2, condition3;
		String situation;
		
		Scanner sc = new Scanner(System.in);
		
		System.out .println("Saisir l'age : ");
		age = sc.nextInt();
		System.out .println("Saisir le nombre d'annees de permis");
		annePermis = sc.nextInt();
		System.out .println("Saisir le nombre d'accidents : ");
		nbAccident = sc.nextInt();
		System.out .println("Saisir le nombre d'annees d'assurance : ");
		anneAssurance = sc.nextInt();
		
		condition1 = age >= 25;
		condition2 = annePermis >= 2;
		condition3 = anneAssurance > 5;
		
		if(!condition1 && !condition2)
		{
			if(nbAccident == 0)
			{
				situation = "Rouge";
			}
			else
			{
				situation = "Refuser";
			}
		}
		else if((!condition1 && condition2) || condition1 && !condition2)
		{
			if(nbAccident == 0)
			{
				situation = "Orange";
			}
			else if(nbAccident == 1)
			{
				situation = "Rouge";
			}
			else
			{
				situation = "Refuser";
			}
		}
		else
		{
			if(nbAccident == 0)
			{
				situation = "Vert";
			}
			else if(nbAccident == 1)
			{
				situation = "Orange";
			}
			else if (nbAccident == 2)
			{
				situation = "Rouge";
			}
			else
			{
				situation = "Refuser";
			}
		}
		if(condition3)
		{
			if(situation.equals("Rouge"))
			{
				situation = "Orange";
			}
			else if(situation.equals("Orange"))
			{
				situation = "Vert";
			}
			else if(situation.equals("Vert"));
			{
				situation = "Bleu";
			}
		}
		System.out.println("Votre situation : "+situation);
		
		sc.close();
	}

}
