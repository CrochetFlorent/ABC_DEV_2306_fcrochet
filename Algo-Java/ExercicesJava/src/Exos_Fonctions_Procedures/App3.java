package Exos_Fonctions_Procedures;

import java.util.Scanner;

public class App3 {
	
		/*Moyenne
		 
	 	Réel Fonction moyenne(VAL a,VAL b, VAR moyenne)
			moyenne = (a+b)/2
	 	Fin Fonction
	 */

		public static double moyenne(double a,double b)
		{
			double moyenne;
			moyenne = (a+b)/2;
			return moyenne;
		}
		
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//Troisième fonction
		double a1,b1,moyenne;
		
		System.out.println("Entrer un nombre");
		a1 = sc.nextDouble();
		System.out.println("Entrer un deuxième nombre");
		b1 = sc.nextDouble();
		moyenne = moyenne(a1,b1);
		System.out.println("La moyenne est de "+moyenne);
		
		sc.close();

	}

}
