package exercice12;

import java.util.Scanner;  // Import the Scanner class

public class AireVolume {

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
	Fin du Programme */
	
	public void main (String [] args) {
		
		double r;
		double aire;
		double volume;
		double Pi = Math.PI;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Entrer le rayon de la sphère");
		r = scanner.nextInt();
		
		aire = 4*Pi*Math.pow(r, 2);
		volume = (4/3*Pi*Math.pow(r, 3));
		
		System.out.println("L'aire est de "+aire+" et le volume est de" +volume);
		
		
		scanner.close();
			
	}
}
