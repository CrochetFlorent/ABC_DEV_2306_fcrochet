package Exos_Fonctions_Procedures;

import java.util.Scanner;

public class App3 {
	
		/*Moyenne
		
		Fonction
	 		Réel moyenne(entier a,entier b)
	 			moyenne est un réel
				moyenne <-- (a+b)/2
			retourne moyenne
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
		double _a,_b,moyenne;
		
		System.out.println("Entrer un nombre");
		_a = sc.nextDouble();
		System.out.println("Entrer un deuxième nombre");
		_b = sc.nextDouble();
		moyenne = moyenne(_a,_b);
		System.out.println("La moyenne est de "+moyenne);
		
		sc.close();

	}

}
