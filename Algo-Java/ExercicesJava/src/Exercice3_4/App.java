package Exercice3_4;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
	
	/*
	 Variables
	 	chaine est une chaine de caractères
	 	presente est un entier
	 	lettre est un caractère
	 	pasPresent est un booleen
	 	ou est un entier
	 	
	 Debut du programme
	 	Ecrire" Entrer une chaîne de caractères"
	 	Lire <-- chaine
	 	
	 	Ecrire" Entrer une lettre"
	 	Lire <-- lettre
	 	
	 	Faire
	 		Si chaine = "" ou chaine ="." alors
	 			Ecrire "LA CHAINE EST VIDE"
	 		Fin si
	 	Tant que chaine ="" ou chaine ="."
	 	
	 	Pour i de 0 à taille de la chaîne faire
	 		Si la valeur de la chaine =  lettre
				presente = presente+1;
				ou = i+1;
				Ecrire "La lettre est présente  à la place numéro :",ou
	 		Fin si
	 	Fin pour
	 	Ecrire "La lettre est présente ",presente," fois
	 Fin du programme
	 */

		String chaine;
		char lettre;
		int presente;
		int ou;
		//boolean fin = false;
		Character comp;
		
		Scanner sc = new Scanner(System.in);
		
		presente = 0 ;
		ou = 0;
		
		//do {
			do
			{
				System.out.println("Entrer une chaine de caractères.");
				chaine = sc.next();
				
				if ( chaine.isEmpty() || chaine.equals("."))
				{
					System.out.println("LA CHAINE EST VIDE");
				}
	
				
			}while (chaine.isEmpty() || chaine.equals("."));
			
			System.out.println("Entrer une lettre pour comparer");
			lettre = sc.next().charAt(0);
			
			for (int i=0; i<chaine.length()-1;i++)
			{
				
				comp =chaine.charAt(i);
				
				
				
				if( comp.equals(lettre))
				{
					presente = presente+1;
					ou = i+1;
					System.out.println("La lettre est présente à la place numéro "+ou);
				}
			//if (i == chaine.length()-1 )
			//{
			//	fin = true;
			//}
				
			}
			System.out.println("La lettre est présente"+presente+" fois");
			
		//}while (fin == false);
		sc.close();
	}
	
}
