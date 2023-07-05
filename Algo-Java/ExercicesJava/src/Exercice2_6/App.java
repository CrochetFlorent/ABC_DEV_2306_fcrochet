package Exercice2_6;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		/*
 	Variables
		Nombre est un entier
		i est un entier
		Premier est un booléen
	
	Debut du Programme
		
		Ecrire " Entrer un nombre"
		Lire <-- Nombre
		i <-- 1
	
		Pour i de 1 à nombre faire
			Si Nombre /i != 1 et Nombre/i  != Nombre faire
				Premier = faux
			Sinon 
				Premier = vrai
			Fin si
		Fin pour
		Si premier == vrai
			Ecrire " Le nombre est un nombre premier"
		Sinon
			Ecrire " Le nombre n'est pas un nombre premier"
		Fin si
	
	Fin du Programme
			
		 */
		
		int Nombre;
		boolean Premier;
		
		
		// Ce programme ne marche encore pas
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entrer un nombre entier");
		Nombre = sc.nextInt();
		
		for (int i=1;i<=Nombre;i++)
		{
			if (Nombre/i !=1 && Nombre/i !=Nombre && Nombre%i != 0) 
			{
				Premier = false;
			}
			else
			{ 
				Premier = true;
			}
		}
		if (Premier = false)
		{
			System.out.println("Le nombre n'est pas premier");
		}
		else
		{
			System.out.println("Le nombre est un nombre premier");
		}

		sc.close();
	
	}

}
