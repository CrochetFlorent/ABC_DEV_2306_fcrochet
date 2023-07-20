package Exercice1_4;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		
		/* Variables
    		Somme est un réel
    		Intérêts est un réel
    		Années est un entier
    		Isimples est un réel
    		Icomposés est un réel

		Début du Programme
    		Ecrire "Entrez la somme"
    		Lire <-- Somme
    		Ecrire "Entrez les intérêts
    		Lire <-- Intérêts
    		Ecrire "Entrez les années"
    		Lire <-- Années
    		Isimples <-- Somme*(1+Années*Intérêts)
    		Icomposés <-- Somme(1+Intérêts)^Années
    		Ecrire "Intérêts Simple:",Isimples,"Intérêts composés:",Icomposés
		Fin du Programme
		*/
		
		double Somme;
		double Interet;
		int Annees;
		double iS;
		double iC;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Entrer la somme:");
		Somme = scanner.nextFloat();
		System.out.println("Entrer les intérêts:");
		Interet = scanner.nextFloat();
		System.out.println("Entrer le nombre d'années");
		Annees = scanner.nextInt();
		
		iS = Somme*(1+Annees*(Interet/100d)); 
		iC = Somme*Math.pow(1+Interet/100d, Annees);
		
		System.out.println("Les intérêts simples sont de : "+iS+" et les composés de : "+iC);
		
		scanner.close();
		
	}

}
