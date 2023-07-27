package Exos_Fonctions_Procedures;

import java.util.Scanner;

public class App {

	
	/*Inversion d'un nombre
	 
	 Procédure inversion_nombre(VAL nombre1,VAL nombre2,VAR temp)
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
	
	/*Calcul prérimètre et aire d'un triangle
	 	
	 	Procédure perimètre_aire(VAL a,VAL b,VAL c,VAR perimetre,VAR aire)
	 		perimetre = a+b+c
	 		aire = ((p/2-a)(p/2-b)(p/2-c))^(1/2)

	 	Fin Procédure
	 */
	
	public static void perimetre_aire(double a,double b,double c)
	{
		double perimetre,aire;
		perimetre = a+b+c;
		aire = Math.pow((perimetre/2-a)*(perimetre/2 -b)*(perimetre/2-c), 1/2);
		System.out.println("Le périmètre vaut : "+perimetre+" et l'aire vaut "+aire);
	}
	
	/*Moyenne
	 
	 	Réel Fonction moyenne(VAL a,VAL b, VAR moyenne)
			moyenne = (a+b)/2
	 	Fin Fonction
	 */
	
	public static double moyenne(double a,double b)
	{
		double moyenne;
		moyenne = (a+b)/2;
		return moyenne;
	}
	
	/*Est Bissextile (annee%400 == 0 || (annee%100 != 0 && annee%4 == 0))
	 
	 	Booleen Fonction estBissextile(VAL annee,VAR estBissextile)
	 		Si annee est divisible par 400 ou pas par 100 et par 4 alors
	 			estBissextile <-- vrai
	 		Sinon 
	 			est Bissextile <-- faux
	 		Fin si
	 		Retourne estBissextile
	 	Fin Fonction
	 */
	
	public static boolean estBissextile(int annee)
	{
		boolean estBissextile;
		
		if(annee%400 == 0 || (annee%100 != 0 && annee%4 == 0))
		{
			estBissextile = true;
		}
		else
		{
			estBissextile = false;
		}
		return estBissextile;
	}
	
	/*Booleen Fonction verif_date(VAL jour,VAL mois,VAL annee,VAR isOk)
	 		Si mois <=12 et mois >0 alors
	 			Si mois = 2 et annee est divisible par 400 ou pas par 100 et par 4 alors
	 				Si jour <= 29 alors
	 					isOk = vrai
	 				Sinon 
	 					isOk = faux
	 				Fin si
	 			Sinon si mois = 4 ou mois = 6 ou mois = 9 = ou mois = 11 alors
	 				Si jour >= 1 ou jour<= 30 alors
	 					isOK = vrai
	 				Sinon 
	 					isOK = faux
	 				Fin si
	 			Sinon 
	 				Si jour >=1 ou jour<= 31
	 					isOK = vrai
	 				Sinon
	 					isOK = faux
	 				Fin si
	 			Fin si
	 		Fin si
	 		Retourne isOK
	 	Fin Fonction
	 */
	
	public static boolean verif_date(int jour,int mois,int annee)
	{
		boolean isOk = false;
		if (mois <=12 && mois > 0)
		{
			if(mois == 2 && annee%400 == 0 || (annee%100 != 0 && annee%4 == 0))
			{
				if (jour == 29)
				{
					isOk = true;
				}
				else
				{
					isOk = false;
				}
			}
			else if (mois == 4 || mois == 6 || mois == 9 || mois == 11)
			{
				if (jour >= 1 || jour <= 30)
				{
					isOk = true;
				}
				else 
				{
					isOk = false;
				}
			}
			else
			{
				if(jour >=1 || jour <=31)
				{
					isOk = true;
				}
				else 
				{
					isOk = false;
				}
			}
		}
		return isOk;
	}
	
	/*Inversion de châine de caractère
	 	
	 	Procedure inversion_chaine (VAL chaine)
	 		inv est un entier
	 		inv <-- taille de la chaine -1
	 		Pour i de 0 à taille de la chaine de caractères faire
	 			caractère[i] = caractère[inv]
	 			inv <-- inv -1
	 		Fin pour
	 		Ecrire "Après inversion",chaine
	 	Fin procédure 				
	 */
	
	public static void inversion_chaine(String chaine)
	{
		int inv;
		inv = chaine.length()-1;
		char[] tab = new char[chaine.length()];
		for (int i=chaine.length()-1; i<=0;i--)
		{
			tab[i] = chaine.charAt(i);

		}
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//Première fonction
		
		double nombre1,nombre2;
		
		System.out.println("Entrer un nombre");
		nombre1 = sc.nextDouble();
		System.out.println("Entrer un deuxièmenombre");
		nombre2 = sc.nextDouble();
		
		System.out.println("Les nombres avant invresion : "+nombre1+" "+nombre2);
		
		inversion_nombre(nombre1,nombre2);
		
		//Deuxième fonction
		
		double a,b,c;
		
		System.out.println("Entrer un côté");
		a = sc.nextDouble();
		System.out.println("Entrer un côté");
		b = sc.nextDouble();
		System.out.println("Entrer un côté");
		c = sc.nextDouble();
		
		perimetre_aire(a,b,c);
	
		//Troisième fonction
		
		double a1,b1,moyenne;
		
		System.out.println("Entrer un nombre");
		a1 = sc.nextDouble();
		System.out.println("Entrer un deuxième nombre");
		b1 = sc.nextDouble();
		
		moyenne = moyenne(a1,b1);
		System.out.println("La moyenne est de "+moyenne);
		
		//Quatrième fonction
		
		int annee;
		
		System.out.println("Entrer une annee");
		annee = sc.nextInt();
		
		System.out.println("L'année est bissextile, vrai ou faux?"+estBissextile(annee));
		
		//Cinquième fonction
		
		int jour,mois,annee;
		System.out.println("Entrer un jour");
		jour = sc.nextInt();
		System.out.println("Entrer un mois");
		mois = sc.nextInt();
		System.out.println("Entrer un annee");
		annee = sc.nextInt();
		
		System.out.println("La date est valide, vrai ou faux?"+verif_date(jour,mois,annee));
		sc.close();
		
		//Sixième fonction
		
		
	}

}
