package Exercice1_1;

import java.util.Scanner;

public class App {
	
	/* Variables
    Nombre1 est un entier
    Nombre2 est un entier
    Moyenne est un réel

Début du Programme
    Ecrire "Saisir le premier nombre"
    Lire <-- Nombre1
    Ecrire "Saisir le deuxième nombre"
    Lire <-- Nombre2
    Résultat <-- (Nombre1+Nombre2)/2
    Ecrire "La moyenne de",Nombre1,"et",Nombre2,"est :",Moyenne
Fin du Programme */
	

	public static void main(String[] args) {
		int nb1 ;
		int nb2 ;
		double moyenne;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Saisir le premier nombre:");
		nb1 = scanner.nextInt();
		System.out.println("Saisir le deuxième nombre:");
		nb2 = scanner.nextInt();
		
		moyenne = (nb1 + nb2)/2d ;
		System.out.println("La moyenne des deux nombres est : " +moyenne);
		
		scanner.close();
		
	}

}
