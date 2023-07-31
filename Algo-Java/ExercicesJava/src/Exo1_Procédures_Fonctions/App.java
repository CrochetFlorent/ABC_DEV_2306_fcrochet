package Exo1_Procédures_Fonctions;

import java.util.Scanner;

public class App {
	
	
	
	public static String Pourcentage()
	{
		double inCb,inChq,inVir,nbPaiements;
		String strPourcentage;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entrer le nombre de paiement à la carte bleue.");
		inCb = sc.nextInt();
		System.out.println("Entrer le nombre de paiement par chèques.");
		inChq = sc.nextInt();
		System.out.println("Entrer le nombre de paiement par virement.");
		inVir = sc.nextInt();
		
		nbPaiements = inCb + inChq + inVir;
		
		strPourcentage = "Le pourcentage de paiements par carte bleue est : "+((inCb / nbPaiements)*100)+
				" ,le pourcentage de paiements par chèques est : "+((inChq / nbPaiements)*100)+
				" et le pourcentage de paiements par virement est : "+((inVir / nbPaiements)*100);
		
		sc.close();
		return strPourcentage;
		
	}
	public static void main(String[] args) {
		
		String pourcentage = null;
		pourcentage = Pourcentage();
		System.out.println(pourcentage);

	}

}
