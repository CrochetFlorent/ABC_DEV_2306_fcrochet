package Exercice1_4;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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
		
		float s;
		float i;
		int a;
		float iS;
		float iC;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Entrer la somme:");
		s = scanner.nextFloat();
		System.out.println("Entrer les intérêts:");
		i = scanner.nextFloat();
		System.out.println("Entrer les années:");
		a = scanner.nextInt();
		
		iS = s*(1+a*(i/100)); 
		iC = (float) (s*Math.pow(1+(i/100), a));
		
		System.out.println("Les intérêts simple sont de : "+iS+" et les composés de : "+iC);
		
		scanner.close();
		
	}

}
