package Exo3_Procédures_Fonctions;

import java.util.Scanner;

public class App {

	public static boolean estDivisible()
	{
		Scanner sc = new Scanner(System.in);
		
		int nb1,nb2;
		boolean estDivisible;
		
		System.out.println("Entrer un nombre entier.");
		nb1 = sc.nextInt();
		System.out.println("Entrer un autre nombre entier.");
		nb2 = sc.nextInt();
		
		if(nb1 % nb2 == 0)
		{
			estDivisible = true;
		}
		else
		{
			estDivisible = false;
		}
		sc.close();
		return estDivisible;
	}
	
	public static void main(String[] args) {
		
		boolean estDivisible = estDivisible();
		
		System.out.println(estDivisible);

	}

}
