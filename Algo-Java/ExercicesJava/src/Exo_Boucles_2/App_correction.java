package Exo_Boucles_2;

import java.util.Scanner;

public class App_correction {

	public static void main(String[] args) {
		
		/*
		 Variables
			nombre est un entier
		Debut du programme
		nombre<-- 0
		Debut tant que
			tant que nombre < 10 OU nombre > 20
			faire
				Ecrire "Saisir un nombre entre 10 et 20
				Lire nombre
				Debut si
					si nombre < 10
					Alors Ecrire "Plus grand !"
					Sinon Si nombre > 20
					Alors Ecrire "Plus petit"
					Sinon Ecrire "Nombre valide"
				Fin Si
		Fin tant que
		fin du programme
		*/
		
		int nombre;
		
		Scanner sc = new Scanner(System.in);
		
		nombre = 0;
		
		while(nombre < 10 || nombre > 20)
		{
			System.out.println("Saisir un nombre entre 10 et 20");
			nombre = sc.nextInt();
			if(nombre < 10)
			{
				System.out.println("Plus grand");
			}
			else if(nombre > 20)
			{
				System.out.println("Plus petit");
			}
			else
			{
				System.out.println("Nombre valide");
			}
		}
		sc.close();
	}

}
