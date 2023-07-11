package Exo_Conditions_3;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
	/*
	 Variables
	 	age est un entier;
	 
	 Debut du programme
	 	Ecrire "Entrer votre age."
	 	Lire <-- age
	 	
	 	Si  6<= age et age>=7 alors
	 		Ecrire "Vous êtes un poussin."
	 	Sinon si 8<= age et age>=9 alors
	 		Ecrire "Vous êtes une pupille."
	 	Sinon si 10<= age et age<= 11 alors
	 		Ecrire "Vous êtes un minime."
	 	Sinon si age >= 12
	 		Ecrire "Vous êtes un cadet."
	 	Fin si
	 	
	 Fin du programme
	 */
		
		int age;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entrer votre age.");
		age = sc.nextInt();
		
		if (6 <= age && age <=7)
		{
			System.out.println("Vous êtes poussin");
		}
		else if (8 <= age && age <=9)
		{
			System.out.println("Vous êtes pupille");
		}
		else if (10 <= age && age <=11)
		{
			System.out.println("Vous êtes minime");
		}
		else if (age >= 12)
		{
			System.out.println("Vous êtes cadet");
		}
		
		sc.close();
	}

}
