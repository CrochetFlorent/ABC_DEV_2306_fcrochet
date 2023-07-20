package Exercice2_2;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		/*
		 Variables
		    Nombre1 est un entier
		    Nombre2 est un entier
		
		Début du Programme
		    Ecrire " Saisir le nombre1"
		    Lire <-- Nombre1
		    Ecrire " Saisir le nombre2"
		    Lire <-- Nombre2
		
		    Si 
		        Nombre1 est plus petit que Nombre2 
		    alors
		        Ecrire Nombre1," < ",Nombre2
		    Sinon si
			Nombre2 est plus petit que Nombre1
		    Alors		
		        Ecrire Nombre2," > ",Nombre1
		    Fin si
		Fin du Programme
		 */
		
		int a;
		int	b;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Entrer une nombre entier");
		a = sc.nextInt();
		System.out.println("Entrez un deuxième nombre entier");
		b = sc.nextInt();
		
		if (a>b)
		{
			System.out.println("b= "+b+" est plus petit que a= "+a);	
		}else if (b>a)
		{
			System.out.println("a= "+a+" est plus petit que b= "+b);
		}
		
		sc.close();
		
	}

}
