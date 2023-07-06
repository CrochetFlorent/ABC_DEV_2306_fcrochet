package Exercice2_7;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		/*
		 Varibales

			kiloError est une chaîne de caractère
			miles est un double
			kilo est un double
		
		Debut du Programme
		
			Fin <-- vrai
		
			Faire
				Ecrire " Entrer une valeur en kilomètre de 0.01 à 1 000 000"
				Lire <-- kilo ou kiloError
		
				Si kiloError == "q" faire
				Fin <-- faux
				Fin Si
		
			Tant que kilo < 0.01 et miles > 1000000
		
			miles = kilo*0.62
			Ecrire kilo," vaut ",miles," En miles" 
		
		Fin du Programme
		 */
		 ;
		double kilo = 0,miles = 0;
		String kiloError = "p";
			
		Scanner sc = new Scanner(System.in);

		do
		{
			System.out.println("Entrer une valeur en kilomètres de 0.01 à 1000000 ou (Q ou q) si vous voulez quitter");
			
			if(sc.hasNextDouble())
			{
				kilo =sc.nextDouble();
			}
			else 
			{	
				kiloError = sc.next();
			}
			if (kiloError.equals("q") || kiloError.equals("Q"))
			{
				System.exit(0);
			}

		}while(kilo < 0.01 || kilo > 1000000);
		
		miles =kilo*0.62;
		
		System.out.println(kilo+" kilomètres font "+miles+" miles");

		
		sc.close();

				

	}	

}
