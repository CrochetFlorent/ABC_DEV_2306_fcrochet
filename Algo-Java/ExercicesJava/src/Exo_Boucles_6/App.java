package Exo_Boucles_6;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		/*
		 Variables
		 	Tab est un tableau
		 	nombre est un entier
		 	plusGrand est un entier
		 	indice est un entier
		 
		 Debut du Programme
		 	Pour i de 0 à 19 faire
		 		Ecrire "Entrer un nombre."
		 		Lire <-- nombre
		 		tab[i] = nombre
		 		
		 		
		 		Si i <=1 et nombre < tab[i-1] alors
		 			plusGrand = nombre
		 			
		 		Fin si
		 	Fin pour
		 	Ecrire plusGrand,"est le plus grand nombre"
		 Fin du Programme		
		 */
		
		int nombre = 0,plusGrand = 0,indice =0,j;
		int [] tabNombre = new int[20];
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < tabNombre.length-1;i++)
		{
			System.out.println("Entrer un nombre");
			nombre = sc.nextInt();
			tabNombre[i] = nombre;
			
			for (j = 0;j <= i;j++)
			{
				if (j >= 1 && plusGrand > tabNombre[j-1])
				{
					plusGrand = nombre;
					System.out.println(plusGrand);
					indice = i+1;
				}
			}
		}
		
		System.out.println(plusGrand+" est le plus grand nombre est nombres entrés, a l'indice "+indice);
		
		sc.close();
	}

}
