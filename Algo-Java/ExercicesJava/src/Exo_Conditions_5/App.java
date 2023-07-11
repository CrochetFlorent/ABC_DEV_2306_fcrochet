package Exo_Conditions_5;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
	/*
	 Variables
	 	nombre est un entier
	 	facture est un double
	 
	 Debut du programme
	 	Ecrire "Entrer le nombre de photocopies"
	 	Lire <-- nombre
	 	
	 	Si nombre <= 10 alors
	 		facture = nombre * 0.1
	 		Ecrire "Le montant s'élève à ",facture
	 	Sinon si 10<nombre<=20 alors
	 		facture = 10*0.1 + (nombre - 10) * 0.09
	 		Ecrire "Le montant s'élève à ",facture
	 	Sinon si nombre > 20 alors
	 		facture = 10*0.1 + 10*0.09 + (nombre - 20 ) *0.08
	 		Ecrire "Le montant s'élève à ",facture
	 	fin si
	 Fin du programme
	 */

	int nombre;
	double facture;
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Entrer le nombre de photocopies");
	nombre = sc.nextInt();
	
	if (nombre <= 10)
	{
		facture = nombre * 0.1;
		System.out.println("Le montant s'élève à "+facture);
	}
	else if (nombre > 10 && nombre <= 20)
	{
		facture = 10 * 0.1 + (nombre -10)*0.09;
		System.out.println("Le montant s'élève à "+facture);
	}
	else if (nombre > 20)
	{
		facture = 10 * 0.1 + 10*0.09 + (nombre - 20) * 0.08;
		System.out.println("Le montant s'élève à "+facture);
	}
	
	sc.close();
	
	}

}
