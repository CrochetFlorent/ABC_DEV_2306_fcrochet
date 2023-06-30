package Jalon1;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// Déclaration des variables
		String Nom;
		String Prénom;
		int Département;
		String Adresse1;
		String Adresse2;
		
		// Création et ouverture du scanner
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Quel est votre nom?"); 												// Demande du nom
		Nom = sc.next();																		// Lecture du nom grâce au scanner					
		System.out.println(" Quel est votre prénom?");											// Demande du nom
		Prénom = sc.next();																		// Lecture du prénom grâce au scanner
		System.out.println("Quel est votre département?");										// Demande du département
		Département = sc.nextInt();																// Lecture du département
		
		Adresse1 = Nom+Département+Prénom+"@arfp.asso.fr";										// Création de l'adresse mail 1
		Adresse2 = Prénom+"."+Nom+Département+"@arfp.asso.fr";									// Création de l'adresse mail 2
		
		System.out.println("L'adresse que vous préférez est : "+Adresse1+" ou "+Adresse2+" ?");	// Proposition des adresses mail
		
		// Fermeture du scanner
		sc.close();
	}

}
