package Exo2_Procédures_Fonctions;

import java.util.Scanner;

public class App {

	
		
	public static void plusGrand()
	{
		Scanner sc = new Scanner(System.in);
		
		int tailleTab,plusGrand = 0,i;
		
		System.out.println("Combien de valeur voulez vous dans votre tableau? Je vous donnerais la plus grande");
		tailleTab = sc.nextInt();
		int[] tab = new int[tailleTab];
		
		System.out.println("Entrer un nombre");
		tab[0] = sc.nextInt();
		
		for (i=1;i<tailleTab;i++)
		{
			System.out.println("Entrer un nombre");
			tab[i] = sc.nextInt();
			
			if(i > 0 && tab[i]>tab[i-1])
			{
				plusGrand = tab[i];
			}
		}
		
		System.out.println("Le plus grand nombre des nombres rentrés est "+plusGrand);
		
		sc.close();

	}
	
	public static void main(String[] args) {
		
		plusGrand();

	}

}
