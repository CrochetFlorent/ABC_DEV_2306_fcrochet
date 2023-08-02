package Exos_Fonctions_Procedures;

import java.util.Scanner;

public class App4 {
	
		// Ici, dans le pseudo code je retourne un booleen, alors que dans le code je retourne une chaîne de caractères.
		//	La méthode est la même, seule le type de valeur retournée change. Cependant selon le programme à creer,
		// je suppose que l'une ou l'autre aura une meilleure utilisation.
	
	
		/*Est Bissextile (annee%400 == 0 || (annee%100 != 0 && annee%4 == 0))
			Fonction
				String estBissextile(entier annee)
					estBissextile est un booleen
					Si annee est divisible par 400 ou pas par 100 et par 4 alors
						estBissextile <-- vrai
					Sinon 
						est Bissextile <-- faux
					Fin si
					Retourne estBissextile
			Fin Fonction
		*/
		
		public static String estBissextile(int annee)
		{
			String strAnnee;
			
			if(annee%400 == 0 || (annee%100 != 0 && annee%4 == 0))
			{
				strAnnee = "L'année est bissextile";
			}
			else
			{
				strAnnee = "L'année n'est pas bissextile";
			}
		return strAnnee;
		}
		

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//Quatrième fonction
		int _annee;		
		System.out.println("Entrer une annee");
		_annee = sc.nextInt();		
		System.out.println(estBissextile(_annee));
		
		sc.close();
		}
}
