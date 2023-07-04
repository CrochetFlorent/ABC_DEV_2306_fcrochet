package Exercice1_5;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Variable 
    a est un réel
    b est un réel
    c est un réel

		Début du Programme
    Ecrire "Saisir le nombre a"
    Lire <-- a
    Ecrire "Saisir le nombre b"
    Lire <-- b
    Ecrire "a= ",a,"et b=",b
    c<--a
    a<--b
    b<--c
    Ecrire "Après inversion, a=",a,"et b=",b
		Fin du Programme
		*/
		
	float a;
	float b;
	float c;
	
	Scanner scanner = new Scanner(System.in);
	
			
	System.out.println("Saisir le nombre a:");
	a = scanner.nextFloat();
	System.out.println("Saisir le nombre b:");
	b = scanner.nextFloat();
	System.out.println("Le nombre a est : "+a+" le nombre b est : "+b);
	
	c=a;
	a=b;
	b=c;
	
	System.out.println("Après inversion,le nombre a vaut : "+a+" le nombre b vaut : "+b);
	
	scanner.close();
	
	}

}
