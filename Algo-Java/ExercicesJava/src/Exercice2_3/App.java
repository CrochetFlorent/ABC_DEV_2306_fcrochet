package Exercice2_3;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		

		double a;
		double b;
		double c;
		double d;
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
		else if (c < a &&  a < b)                        // pas else,car si un terme est égal la un autre, la condition n'est pas respectée
		{
			System.out.println("b < a < c");
		}
		
		System.out.println("Voulez vous continuer? 1 pour oui 2 pour non");
		choix = sc.nextInt();
		
		if (choix == 2)
		{
			end = false;
		}
		
		}while (end == true);
		
		sc.close();
		
	}

}
