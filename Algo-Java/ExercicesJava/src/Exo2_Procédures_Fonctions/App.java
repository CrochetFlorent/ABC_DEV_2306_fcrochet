package Exo2_Procédures_Fonctions;

import java.util.Scanner;

public class App {

	
		
	public static String plusGrand()
	{
		Scanner sc = new Scanner(System.in);
		
		int tailleTab,plusGrand = 0 ;
		String strPlusGrand = null;
		
		System.out.println("Combien de valeur voulez vous dans votre tableau? Je vous donnerais la plus grande");
		tailleTab = sc.nextInt();
		int[] tab = new int[tailleTab];
		
		
		for (int i=0;i < tailleTab;i++)
		{
			System.out.println("Entrer un nombre");
			tab[i] = sc.nextInt();
			plusGrand = tab[0];
			
			if(i > 0 && tab[i]>tab[i-1])
			{
				plusGrand = tab[i];
			}
		}
		
		strPlusGrand = "Le plus grand nombre des nombres rentrés est "+plusGrand;
		
		sc.close();
		return strPlusGrand;
	}
	
	public static void main(String[] args) {
		
		System.out.println(plusGrand());

	}

}
