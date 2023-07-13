package Exo_Conditions_6;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		/*
		 Variables
		genre est une chaine de caracteres
		age est un entier
		condition1 est un booleen
		condition2 est un booleen
	Debut du programme
		Ecrire "Saisir le genre (M/F) : "
		Lire genre
		Ecrire "Saisir l'age : "
		Lire age
		condition1 <-- genre = "M" ET age > 20
		condition2 <-- genre = "F" ET (age > 18 ET age < 35)
	Debut Si
		Si condition1 = vrai OU condition2 = vrai
		Alors Ecrire "Imposable"
		Sinon Ecrire "Non Imposable"
	Fin Si
	Fin du programme

		 */
		
		String genre;
		int age;
		boolean condition1,condition2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Saisir le genre (M/F) : ");
		genre = sc.next();
		System.out.println("Saisir l'age : ");
		age = sc.nextInt();
		condition1 = genre.equals("M") && age > 20;
		condition2 = genre.equals("F") && (age > 18 && age < 35);
		
		if(condition1 || condition2)
		{
			System.out.println("Imposable");
		}
		else
		{
			System.out.println("Non imposable");
		}
		sc.close();
	}

}
