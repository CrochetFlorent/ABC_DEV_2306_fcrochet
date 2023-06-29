package Exercice1_2;

import java.util.Scanner;

public class App {
	
	/* Variables
    Rayon est un réel
    Aire est un réel
    Volume est un réel
Constantes
    Pi est un réel

Début du Programme
    Ecrire " Entrez le rayon de la sphère"
    Lire <-- Rayon
    Aire <-- 4*Pi*Rayon²
    Volume <-- (4*Pi*Rayon^3)/3
    Ecrire " L'aire de la sphère est :",Aire,"et son volume est :",volume
Fin du Programme*/
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double r;
		double aire;
		double volume;
		final double Pi = Math.PI;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Entrer le rayon de la sphère");
		r = scanner.nextDouble();
		
		aire = 4*Pi*Math.pow(r, 2);
		volume = (4d/3)*Pi*Math.pow(r, 3);
		
		aire = Math.round(aire*100.0)/100.0;
		volume = Math.round(volume*100.0)/100.0;
		
		System.out.println("L'aire est de "+aire+" et le volume est de " +volume);
		
		
		scanner.close();
	}

}
