package Exercice1_3;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		

		/* Variables
    		Rayon est un réel
    		Aire est un réel
    		Angle est un réel

		Constantes
    		Pi est un réel

		Début du Programme
    		Ecrire "Entrez le rayon"
    		Lire <-- Rayon
    		Ecrire "Entrez l'angle"
    		Lire <-- Angle
    		Aire <-- (Pi*Rayon²*Angle)/360
    		Ecrire "L'aire est de",Aire
		Fin du Programme
		 */ 
			
		double r;
		double aire;
		double a;
		final double PI = Math.PI;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Entrer le rayon");
		r = scanner.nextDouble();
		System.out.println("Entrer l'angle");
		a = scanner.nextDouble();
		aire = (PI*Math.pow(r,2)*a)/360;
		aire = Math.round(aire*1000.0)/1000.0;
		System.out.println("L'aire est de : " +aire);
		
		scanner.close();
		
	}



}
