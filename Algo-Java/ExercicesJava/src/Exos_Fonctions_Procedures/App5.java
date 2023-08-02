package Exos_Fonctions_Procedures;

import java.util.Scanner;

public class App5 {

		/*
		 * Fonction
		 * Booleen verif_date(entier jour,entier mois,entier annee,booleen isOk)
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
		
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//Cinquième fonction
				int _jour,_mois,_annee;
				
				System.out.println("Entrer un jour");
				_jour = sc.nextInt();
				System.out.println("Entrer un mois");
				_mois = sc.nextInt();
				System.out.println("Entrer un annee");
				_annee = sc.nextInt();
				System.out.println("La date est valide, vrai ou faux? "+verif_date(_jour,_mois,_annee));
				
				sc.close();
	}

}
