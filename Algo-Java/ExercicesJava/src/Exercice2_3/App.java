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
			System.out.println(a+" < "+b+" < "+c);
		}
		if (a < c &&  c < b)
		{
			System.out.println(a+" < "+c+" < "+b);
		}
		if (b < a &&  a < c)
		{
			System.out.println(b+" < "+a+" < "+c);
		}
		if (b < c &&  c < a)
		{
			System.out.println(b+" < "+c+" < "+a);
		}
		if (c < b &&  b < a)
		{
			System.out.println(c+" < "+b+" < "+a);
		}
		if (c < a &&  a < b)
		{
			System.out.println(b+" < "+a+" < "+c);
		}
		
		if (a > b)
		{
			d = a;
			a = b;
			b = d;
		}
		if (a > c)
		{
			d = a;
			a = c;
			c = d;
		}
		if ( b > c)
		{
			d = b;
			b = c;
			c = d;
		}
		System.out.println("Dans l'ordre croissant : "+a+" ,"+b+" ,"+c);
		
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
