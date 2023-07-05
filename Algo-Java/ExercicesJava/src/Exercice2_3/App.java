package Exercice2_3;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		/*
		 Variables
		    a est un décimal
		    b est un décimal
		    c est un décimal

		Début du Programme
		    Ecrire "Entrer un nombre"
		    Lire <-- a
		    Ecrire " Entrer un deuxième nombre"
		    Lire <-- b
		    Ecrire " Entrer un troisième nombre"
		    Lire <-- c
		
		    Debut si
		        si 
		            a<b et b<c
		        alors
		            Ecrire "a < b < c"
		        sinon si
		            a<c et c<b
		        alors
		            Ecrire "a < c < b"
		        sinon si
		            b<c et c<a
		        alors
		            Ecrire "b < c < a"
		        sinon si
		            b<a et a<c
		        alors
		            Ecrire "b < a < c"
		        sinon si
		            c<a et a<b
		        alors
		            Ecrire "c < a < b"
		        sinon si
		            c<b et b<a
		        alors
		            Ecrire "c < b < a"
		    Fin si
		    
		Fin du Programme
		 */
		double a,b,c;
		int choix;
		boolean end;
		
		Scanner sc = new Scanner(System.in);
		end = true;
		
		do {
			
		System.out.println("Entrer une nombre entier");
		a = sc.nextInt();
		System.out.println("Entrez un deuxième nombre entier");
		b = sc.nextInt();
		System.out.println("Entrez un troisième nombre entier");
		c = sc.nextInt();
		
		if (a < b &&  b < c)
		{
			System.out.println("a < b < c");
		}else if (a < c &&  c < b)
		{
			System.out.println("a < c < b");
		}
		else if (b < a &&  a < c)
		{
			System.out.println("b < a < c");
		}
		else if (b < c &&  c < a)
		{
			System.out.println("b < c < a");
		}
		else if (c < b &&  b < a)
		{
			System.out.println("c < b < a" );
		}
		else if (c < a &&  a < b)    
		{
			System.out.println("b < a < c");
		}
		
		System.out.println("Voulez vous continuer? 1 pour oui et 2 pour non");
		choix = sc.nextInt();
		
		if (choix == 2)
		{
			end = false;
		}
		
		}while (end == true);
		
		sc.close();
		
	}

}
