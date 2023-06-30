package Jalon1;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		String Nom;
		String Prénom;
		int Département;
		String Adresse1;
		String Adresse2;
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quel est votre nom?");
		Nom = sc.next();
		System.out.println(" Quel est votre prénom?");
		Prénom = sc.next();
		System.out.println("Quel est votre département?");
		Département = sc.nextInt();
		
		Adresse1 = Nom+Département+Prénom+"@arfp.asso.fr";
		Adresse2 = Prénom+"."+Nom+Département+"@arfp.asso.fr";
		
		System.out.println("'Adresse que vous préférez est : "+Adresse1+" ou "+Adresse2+" ?");
		
		sc.close();
	}

}
