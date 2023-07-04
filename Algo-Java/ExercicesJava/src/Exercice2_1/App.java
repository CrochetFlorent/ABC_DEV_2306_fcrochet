package Exercice2_1;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		/*
		Variables
    		a est un entier

		Début du Programme
    		Ecrire " Saisir votre age"
    		Lire <-- a

		Début si
    		si 
       			a est plus grand ou égale à 18
    		alors
        		Ecrire " Vous êtes majeur"
    		Sinon si
        		a est plus petit que 0
    		alors
        		Ecrire "Vous n'êtes pas né"
    		Sinon 
        		Ecrire "Vous êtes mineur"
    
			Fin si

		Fin du Programme
		 */
		
		int a;
		boolean val;

		Scanner sc = new Scanner(System.in);
		val = false;
		
		do {
			
		System.out.println(" Quel est votre age?");
		a = sc.nextInt();
		
		if (  a>=0 && a<18 ) {
			System.out.println("Vous êtes mineur.");
			val = true;
		}
		else if (a>=18) {
			System.out.println("Vous êtes majeur.");
			val = true;
		}
		else {
			System.out.println("Vous êtes comme pas né");	
		}
		
		}while(val == false);
		
		sc.close();	

	}

}
