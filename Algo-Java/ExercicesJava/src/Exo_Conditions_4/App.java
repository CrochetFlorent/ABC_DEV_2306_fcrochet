package Exo_Conditions_4;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
	/*
	 Variables
	 	heure est un entier
	 	minutes est un entier
	 
	 Debut du programme
	 	Ecrire "Entrer une heure."
	 	Lire<-- Heure
	 	Ecrire "Entrer les minutes."
	 	lire <-- minutes
	 	
	 	Si heure = 23 et minutes = 59 alors
	 		Ecrire "Dans une minute il est 00 heures et 00 minutes"
	 	Sinon si minutes = 59 alors
	 		heure = heure + 1
	 		minute = 0
	 		Ecrire "Dans une minute il est ",heure" heure(s) et ",minutes
	 	Sinon 
	 		minutes = minutes + 1
	 		Ecrire "Dans une minute il est ",heure" heure et ",minutes" minutes
	 	Fin si
	 Fin du programme
	 */

	int heure,minutes;
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Entrer une heure");
	heure = sc.nextInt();
	System.out.println("Entrer les minutes");
	minutes = sc.nextInt();
	
	if (heure == 23 && minutes == 59)
	{
		heure = 00;
		minutes = 00;
		
		System.out.println("Dans une minute il est 00 heure(s) et 00 minutes");
	}
	else if ( minutes == 59)
	{
		heure = heure + 1;
		minutes = 0;
		
		System.out.println("Dans une minute il est "+heure+", heure et 00 minutes");
	}
	else 
	{
		minutes = minutes +1;
		System.out.println("Dans une minute il est "+heure+" heure(s) et "+minutes);
		
	}
	sc.close();
	}

}
