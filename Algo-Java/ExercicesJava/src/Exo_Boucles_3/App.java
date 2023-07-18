package Exo_Boucles_3;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		/*
		 Avec boucle tant que :
		 
		 Variables
		 	nombre est un entier
		 
		 Debut du programme
		 	Ecrire "Entrer un nombre entier."
		 	Lire <-- nombre
		 	
		 	Tant que nombre < nombre +10 faire
		 		ecrire nombre +1
		 	Fin tant que
		 Fin du Programme
		  
		 Avec boucle pour :
		 
		 Variables
		 	nombre est un entier
		 
		 Debut du programme
		 	Ecrire "Entrer un nombre entier."
		 	Lire <-- nombre
		 	
		 	Pour i = nombre à i = nombre +9 faire
		 		Ecrire i +1
		 	Fin pour
		 Fin du programme
		 
		 */

		int nombre,counter;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entrer un nombre, avec boucle tant que");
		nombre = sc.nextInt();
		counter=nombre+1;
		
		while(counter <= nombre +10)
		{
			System.out.println(counter);
			counter++;
		}
		
		System.out.println("Entrer un nombre, avec boucle pour");
		nombre = sc.nextInt();
		counter=nombre+1;
		
		for (int i=counter; i<= nombre +10;i++)
		{
			System.out.println(i);
		}
		
		sc.close();
	}

}
