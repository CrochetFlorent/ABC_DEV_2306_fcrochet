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
			i <-- 2
		
			Pour i de 2 à Nombre-1 faire
				Si Nombre n'est pas divisible par i faire
					Premier = vrai
				Sinon 
					Premier = faux
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
		boolean Premier = true;
		
		
		// Ce programme ne marche encore pas
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entrer un nombre entier");
		Nombre = sc.nextInt();
		
		Nombre = Math.abs(Nombre);
		
		if ( Nombre == 0 || Nombre == 1)
		{
			Premier = false;
		}
		
			for (int i=2; i<=Nombre-1 && Premier;i++)
			{
				//System.out.println( Nombre%i);
				if (Nombre%i == 0) 
				{
					Premier = false;
				}			
			}
		
			if (Premier)
			{
				System.out.println(Nombre+" est un nombre premier");
			}
			else
			{
				System.out.println(Nombre+" n'est pas un nombre premier");
			}
		

		sc.close();
	
	}

}
