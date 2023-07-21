package Decimal_Binaire;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {		
		
		/*Variables
		 * 		base10 est un entier
		 * 		end est un entier
		 * 		Création d'une liste de nom list
		 * 
		 * Debut du Programme
		 * 		Ecrire "Entrer le nomnre entier en base 10 pour le convertir en base 2
		 * 		Lire base10
		 * 		end = base10
		 * 
		 * 		Tant que base10 > 1
		 * 			Si base10 est divisible par 2 alors			// Ici on traite le cas ou le reste vaut 0
		 * 				on ajoute un 0 à la liste
		 *			Sinon 
		 *				on ajoute un 1 à la liste				// Ici on traite le cas ou le reste vaut 1
		 *			Fin si
		 *		Fin tant que
		 *		Si base10 n'est pas divisible par 2 alors     // Ici on traite le cas ou il reste 1 à la division 
		 *			on ajoute un 1 à la liste
		 *		Fin si
		 *
		 *		On inverse la liste								// Pour lire les 0 et 1 dans le bon sens
		 *
		 *		Ecrire " La base 2 de ",end," est "				
		 *
		 *		Pour i de 0 à la taille de la liste faire
		 *			Ecrire list(i)
		 *		Fin pour
		 *	Fin du Programme
		 */
		
		
		int base10,end;
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entrer un nombre entier en base 10 pour le convertir en base 2.");
		base10 = sc.nextInt();
		end = base10;
		
		
		while(base10>1)
		{
			if (base10%2 == 0)
			{
				list.add(0);
			}
			else
			{
				list.add(1);
			}
			base10 = base10 / 2 ;
		}
		if (base10%2 != 0)
		{
		list.add(1);
		}
		
		Collections.reverse(list);
		
		System.out.print("La base2 de "+end+" est ");
		
		for (int i=0; i< list.size();i++)
		{
		System.out.print(list.get(i));
		}
	
		sc.close();
	}

}
