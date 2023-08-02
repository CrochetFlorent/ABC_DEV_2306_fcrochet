package Exos_Fonctions_Procedures;

import java.util.Scanner;

public class App {

	
	/*Inversion d'un nombre
	 
	 Procédure 
	 	inversion_nombre(entier nombre1, entier nombre2)
	 			temp est un entier
			 	temp <-- nombre2
			 	nombre2 <-- nombre1
			 	nombre1 <-- nombre2
			 	Ecrire "Les nombres après inversion valent ",nombre1," ",nombre2
	 Fin Procédure
	 */	

	public static void inversion_nombre(double nombre1,double nombre2)
	{
		double temp;
		temp = nombre2;
		nombre2 = nombre1;
		nombre1=temp;
		System.out.println("Les nombre après inversion valent "+nombre1+" "+nombre2);
	}
		

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//Première fonction	
		double _nombre1,_nombre2;
	
		System.out.println("Entrer un nombre");
		_nombre1 = sc.nextDouble();
		System.out.println("Entrer un deuxièmenombre");
		_nombre2 = sc.nextDouble();
		
		System.out.println("Les nombres avant invresion : "+_nombre1+" "+_nombre2);
		
		inversion_nombre(_nombre1,_nombre2);
			
		sc.close();
		
	}

}
