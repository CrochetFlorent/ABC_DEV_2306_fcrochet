package Exos_Fonctions_Procedures;

import java.util.Scanner;

public class App2 {
	
	/*Calcul prérimètre et aire d'un triangle
 	
 	Procédure perimètre_aire(VAL a,VAL b,VAL c,VAR perimetre,VAR aire)
 		perimetre = a+b+c
 		aire = ((p/2-a)(p/2-b)(p/2-c))^(1/2)

 	Fin Procédure
 */

	public static void perimetre_aire(double a,double b,double c)
	{
		double perimetre,aire;
		perimetre = a+b+c;
		aire = Math.pow((perimetre/2-a)*(perimetre/2 -b)*(perimetre/2-c), 1/2);
		System.out.println("Le périmètre vaut : "+perimetre+" et l'aire vaut "+aire);
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//Deuxième fonction
		double a,b,c;
		
		System.out.println("Entrer un côté");
		a = sc.nextDouble();
		System.out.println("Entrer un côté");
		b = sc.nextDouble();
		System.out.println("Entrer un côté");
		c = sc.nextDouble();
		perimetre_aire(a,b,c);
		
		sc.close();
	}

}
