package Exercice2_5;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		/*
		 Variables
			Nombre est un entier
			i est un entier

		Debut du Programme
	
			i <-- 1
			Ecrire " Entrer un nombre entier"
			Lire <-- Nombre
			Pour i de 1 à Nombre faire
				Si Nombre est divisible par i
					Ecrire i
				Fin si
				i++
			Fin pour 
	
		Fin du Programme 
		
		 */
		int Nombre;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Ecrire un nombre entier");
		
		Nombre = sc.nextInt();
		
		for (int i=1; i<=Nombre; i++)
		{
			
		if (Nombre%i == 0)
			{	
				System.out.println(i);
			}		
		}	
	}
}
