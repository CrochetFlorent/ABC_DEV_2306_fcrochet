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
		int Nb1 ;
		int Nb2 ;
		double Moyenne;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Saisir le premier nombre:");
		Nb1 = scanner.nextInt();
		System.out.println("Saisir le deuxième nombre:");
		Nb2 = scanner.nextInt();
		
		System.out.println("Le premier nombre est " +Nb1+ " et le deuxième " +Nb2);
		
		Moyenne = (Nb1 + Nb2)/2d ;
		System.out.println("La moyenne des deux nombres est :" +Moyenne);
		
		scanner.close();
		
	}

}
