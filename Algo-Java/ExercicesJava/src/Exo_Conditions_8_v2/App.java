package Exo_Conditions_8_v2;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		/*
		 Variables
		age, annePermis, nbAccident, anneAssurance sont des entiers
		condition1, condition2, condition3 sont des booleens
		situation est une chaine de caracteres
		point est un entier
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
		point <-- 0
	Debut Si
		Si condition1 = faux
		Alors point <-- point + 1
	Fin Si
	Debut Si
		Si condition2 = faux
		Alors point <-- point + 1
	Fin Si
	Debut Si
		point <-- point + nbAccident
		Si point < 3 et condition3 = vrai
		Alors point <-- point - 1
	Fin Si
	Debut Si
		Si point = -1
		Alors situation <-- "Bleu"
		Sinon Si point = 0
		Alors situation <-- "Vert"
		Sinon Si point = 1
		Alors situation <-- "Orange"
		Sinon Si point = 2
		Alors situation <-- "Rouge"
		Sinon situation <-- "Refuser"
	Fin Si
	Ecrire "Votre situation : ",situation
	Fin du programme
		 */
		
		int age, annePermis, nbAccident, anneAssurance;
		boolean condition1, condition2, condition3;
		String situation;
		int point;
		
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
		point = 0;
		
		if(!condition1)
		{
			point = point + 1;
		}
		
		if(!condition2)
		{
			point = point + 1;
		}
		
		point = point + nbAccident;
		
		if(point < 3 && condition3)
		{
			point = point - 1;
		}
		
		if(point == -1)
		{
			situation = "Bleu";
		}
		else if(point == 0)
		{
			situation = "Vert";
		}
		else if(point == 1)
		{
			situation = "Orange";
		}
		else if(point == 2)
		{
			situation = "Rouge";
		}
		else
		{
			situation = "Refuser";
		}
		System.out.println("Votre situation : "+situation);
		
		sc.close();

	}

}
