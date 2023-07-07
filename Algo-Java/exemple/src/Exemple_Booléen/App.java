package Exemple_Booléen;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		/*
		 "J'irais me promener s'il fait plus de 25°C et qu'il ne pleut pas, ou si ma copine le veut"
		 
		 Variables
		 	temperature est un entier
		 	pleutIl est une chaine de caractère
		 	ilPleut est un booleen
		 	copineVeutElle est une chaine de carractère
		 	elleVeut est un booleen
		 Debut du programme
		 	ecrire "qu'elle temperature ?"
		 	lire <-- temperature
		 	ecrire "est ce qu'il pleut ?"
		 	lire <-- pleutil
		 	ecrire "est ce que ma copine veut sortir"
		 	lire <-- copineVeutElle
		 Debut Si
		 	Si pleutIl est egale à oui 
		 	Alors ilPleut egale vrai
		 	Sinon ilPleut egale faux
		 Fin si
		 Debut Si
		 	Si copineVeutElle est egale à oui
		 	Alors elleVeut egale vrai
		 	Sinon elleVeut egale faux
		 Fin Si
		 Debut Si
		 	Si temperature supérieure à 25 et ilPleut egale faux ou elleVeut egale vrai
		 	Alors ecrire "J'irais me promener"
		 	Sinon ecrire "Je reste à la maison"
		 Fin Si
		 Fin du programme
		 */

			// declaration des variables
			int temperature;
			String pleutIl;
			boolean ilPleut;
			String copineVeutElle;
			boolean elleVeut;
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Quelle temperature");
			temperature = sc.nextInt();
			System.out.println("est qu'il pleut ? \nOui= O ou o \tNon=N ou n ");
			pleutIl = sc.next();
			if(pleutIl.equals("O")  || pleutIl.equals("o") )
			{
				ilPleut = true;
			}
			else
			{
				ilPleut = false;
			}
			
			System.out.println("est ce que ma copine veut sortir ? \nOui= O ou o \tNon=N ou n");
			copineVeutElle = sc.next();
			
			if(copineVeutElle.equals("O") || copineVeutElle.equals("o"))
			{
				elleVeut = true;
			}
			else
			{
				elleVeut = false;
			}
			
			if(temperature > 25 && ilPleut == false || elleVeut == true)
			{
				System.out.println("J'irais me promener");
			}
			else
			{
				System.out.println("Je reste à la maison");
			}
			
			sc.close();


	}

}
