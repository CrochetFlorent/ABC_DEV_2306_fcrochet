package Exo_Boucles_2;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		/*
		 Variables
		 	nombre est un entier
		 	fin est un booléen
		 	
		 Debut du Programme
		 	Ecrire "Saisissez un nombre entre 10 et 20"
		 	
		 	Tant que nombre plus petit que 10 ou nombre plus grand que 20 faire
		 		Si nombre > 20 alors
		 			Ecrire "Plus petit"
		 			Ecrire "Saisissez un nombre entre 10 et 20"
		 		lire <-- nombre
		 		Sinon si nombre < 10 faire
		 			Ecrire "Plus grand"
		 			Ecrire "Saisissez un nombre entre 10 et 20"
		 		lire <-- nombre
		 		Sinon
		 			Ecrire "Le nombre est compris entre 10 et 20"
		 			fin <-- vrai
		 		fin si
		 	Fin tant que
		 Fin du Programme
		 */
		
		int nombre;
		
		Scanner sc = new Scanner(System.in);
		
		nombre =0;
		
		while  (nombre <10 || nombre >20)
		{
			System.out.println("Entrer un nombre entre 10 et 20.");
			nombre = sc.nextInt();
			
			if (nombre > 20)
			{
				System.out.println("Plus petit !");
				System.out.println("Entrer un nombre entre 10 et 20.");
				nombre = sc.nextInt();
			}
			else if(nombre < 10)
			{
				System.out.println("Plus grand!");
				System.out.println("Entrer un nombre entre 10 et 20.");
				nombre = sc.nextInt();
			}
			else 
			{
				System.out.println("Le nombre est compris entre 10 et 20.");
			}
			
		}
		
		sc.close();
	}

}
