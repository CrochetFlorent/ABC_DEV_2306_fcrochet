package Exo_Boucles_7;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		/*
		 Variables
		nombre est un entier
		plusGrand est un entier
		position est un entier
		i est un entier
	Debut du programme
		nombre <-- 1
		i <-- 0
		plusGrand <-- 0
		position <-- 0
	Debut tant que
		tant que nombre != 0
		faire
			Ecrire "Saisir un nombre"
			Lire nombre
			i <-- i + 1
			Debut Si
				Si i = 1 OU nombre > plusGrand
				Alors 
					plusGrand <-- nombre
					position <-- i
			Fin Si
	Fin tant que
		Ecrire "Le nombre le plus grand est : ",nombre
		Ecrire "Il a ete saisi en position numero : ",position
	Fin du programme
		 */

			int nombre;
			int plusGrand;
			int position;
			int i;
			
			Scanner sc = new Scanner(System.in);
			
			nombre = 1;
			plusGrand = 0;
			position = 0;
			i = 0;
			
			while(nombre != 0)
			{
				System.out.println("Saisir un nombre");
				nombre = sc.nextInt();
				i++;
				if(/*i == 1 ||*/ nombre > plusGrand)
				{
					plusGrand = nombre;
					position = i;
				}
			}
			
			System.out.println("Le nombre le plus grand est : "+plusGrand);
			System.out.println("Il a ete saisi en position numero : "+position);
			
			sc.close();
	}

}
