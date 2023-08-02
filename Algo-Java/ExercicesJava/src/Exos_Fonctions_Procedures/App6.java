package Exos_Fonctions_Procedures;

import java.util.Scanner;

public class App6 {
	
	/*Inversion de châine de caractère
	 	
	 	Procedure 
	 		inversion_chaine (String chaine)
		 		chaine2 est une chaine de caractères vide
		 		Pour i de 0 à taille de la chaine de caractères faire
		 			chaine2 = caractère à l'indice + chaine2
		 		Fin pour
		 		Ecrire "Ecrire",chaine2
	 	Fin procédure 				
	 */
	
	public static void inversion_chaine(String chaine)
	{

		String chaine2="";
		for (int i=0; i< chaine.length();i++)
		{
			chaine2 = chaine.charAt(i)+ chaine2;
		}
		System.out.println("A l'envers : "+chaine2);
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//Sixième fonction
		String _chaine;
		
		System.out.println("Entrer une chaîne de caractères");
		_chaine = sc.next();
		inversion_chaine(_chaine);
		
		sc.close();
	}

}
